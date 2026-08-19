package com.rave.projectbabylonarmors.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.fml.loading.FMLPaths;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * User-editable armor stats, loaded from config/project_babylon_armors-stats.json.
 *
 * Loaded lazily on first access, which happens during registry events — before the
 * NeoForge TOML config lifecycle — so this is a plain JSON file we manage ourselves.
 * The file is created with default values on first launch; missing sets or missing
 * fields inside a set fall back to defaults, so partial files are fine.
 *
 * NOTE: stats bake into item registration. Server and client should use the same
 * file, and changes require a game restart.
 */
public final class PBArmorStats {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final String FILE_NAME = "project_babylon_armors-stats.json";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public record SetStats(int durabilityMultiplier, int enchantmentValue,
                           int defenseBoots, int defenseLeggings, int defenseChestplate, int defenseHelmet,
                           float toughness, float knockbackResistance,
                           double magicArmorBonus,
                           double speedPenaltyHelmet, double speedPenaltyChestplate,
                           double speedPenaltyLeggings, double speedPenaltyBoots) {

        public int defenseFor(ArmorItem.Type type) {
            return switch (type) {
                case HELMET -> defenseHelmet;
                case CHESTPLATE, BODY -> defenseChestplate;
                case LEGGINGS -> defenseLeggings;
                default -> defenseBoots;
            };
        }

        public double speedPenaltyFor(ArmorItem.Type type) {
            return switch (type) {
                case HELMET -> speedPenaltyHelmet;
                case CHESTPLATE -> speedPenaltyChestplate;
                case LEGGINGS -> speedPenaltyLeggings;
                case BOOTS -> speedPenaltyBoots;
                default -> 0.0D;
            };
        }
    }

    private static final Map<String, SetStats> DEFAULTS = new LinkedHashMap<>();
    private static volatile Map<String, SetStats> loaded;

    private PBArmorStats() {
    }

    private static void def(String key, int mult, int defB, int defL, int defC, int defH,
                            float toughness, double magicBonus, boolean tankPenalty) {
        DEFAULTS.put(key, new SetStats(mult, 9, defB, defL, defC, defH, toughness, 0.0f, magicBonus,
                tankPenalty ? -0.01D : 0.0D, tankPenalty ? -0.03D : 0.0D,
                tankPenalty ? -0.02D : 0.0D, tankPenalty ? -0.01D : 0.0D));
    }

    static {
        def("iron_warrior", 45, 2, 5, 6, 2, 1.25f, 0.0D, false);
        def("iron_mage", 39, 1, 3, 4, 1, 0.25f, 0.5D, false);
        def("iron_rogue", 43, 1, 4, 6, 1, 0.5f, 0.0D, false);
        def("iron_tank", 49, 2, 5, 7, 2, 2.0f, 0.25D, true);
        def("golden_warrior", 96, 2, 6, 8, 2, 2f, 2.0D, false);
        def("golden_mage", 88, 2, 4, 5, 1, 0.75f, 3.5D, false);
        def("golden_rogue", 92, 2, 5, 6, 2, 1f, 1.5D, false);
        def("golden_tank", 100, 3, 6, 8, 3, 3f, 2.5D, true);
        def("diamond_warrior", 96, 3, 7, 9, 3, 3f, 0.25D, false);
        def("diamond_mage", 88, 2, 4, 6, 2, 1.0f, 1.0D, false);
        def("diamond_rogue", 92, 2, 6, 8, 2, 1.5f, 0.25D, false);
        def("diamond_tank", 100, 4, 8, 9, 4, 4f, 0.5D, true);
        def("ice_warrior", 77, 3, 8, 10, 3, 3.5f, 0.75D, false);
        def("ice_mage", 69, 2, 5, 6, 2, 1.25f, 1.5D, false);
        def("ice_rogue", 73, 3, 6, 8, 3, 2f, 0.5D, false);
        def("ice_tank", 81, 4, 9, 10, 4, 4.5f, 1.0D, true);
        def("ethereal_warrior", 96, 3, 9, 11, 3, 4f, 3.0D, false);
        def("ethereal_mage", 88, 2, 5, 7, 2, 1.5f, 5.0D, false);
        def("ethereal_rogue", 92, 3, 7, 9, 3, 2f, 2.5D, false);
        def("ethereal_tank", 100, 5, 10, 11, 5, 5.5f, 4.0D, true);
        def("netherite_warrior", 116, 4, 10, 12, 4, 5.5f, 0.5D, false);
        def("netherite_mage", 108, 2, 7, 8, 2, 2f, 1.25D, false);
        def("netherite_rogue", 112, 3, 9, 11, 3, 3f, 0.25D, false);
        def("netherite_tank", 120, 5, 11, 13, 5, 7.0f, 0.75D, true);
        def("dragonsteel_warrior", 128, 5, 11, 13, 5, 7f, 1.25D, false);
        def("dragonsteel_mage", 120, 3, 7, 8, 3, 2.5f, 2.0D, false);
        def("dragonsteel_rogue", 124, 4, 10, 12, 4, 4f, 1.0D, false);
        def("dragonsteel_tank", 132, 5, 12, 14, 5, 8.5f, 1.5D, true);
    }

    /**
     * Datapack overrides (data/project_babylon_armors/armor_stats/<set>.json), applied on
     * top of the startup config. Reload-safe: set on server datapack (re)load and synced
     * to clients. Durability and enchantment value entries in datapacks are IGNORED —
     * those bake into items at registration and only the startup JSON controls them.
     */
    private static volatile Map<String, SetStats> runtimeOverrides = Map.of();

    /** Stats to use for gameplay attribute calculations (datapack override or startup config). */
    public static SetStats runtime(String setKey) {
        SetStats override = runtimeOverrides.get(setKey);
        return override != null ? override : get(setKey);
    }

    /** Rebuilds runtime overrides from a JSON document {"<set_key>": {<partial stats>}, ...}. */
    public static void setRuntimeOverridesFromJson(JsonObject root) {
        Map<String, SetStats> overrides = new LinkedHashMap<>();
        for (String key : root.keySet()) {
            if (!DEFAULTS.containsKey(key)) {
                LOGGER.warn("Ignoring armor stats override for unknown set '{}'", key);
                continue;
            }
            overrides.put(key, merge(get(key), root.getAsJsonObject(key)));
        }
        runtimeOverrides = overrides;
        LOGGER.info("Applied datapack armor stat overrides for {} sets", overrides.size());
    }

    public static void clearRuntimeOverrides() {
        runtimeOverrides = Map.of();
    }

    public static SetStats get(String setKey) {
        Map<String, SetStats> stats = loaded;
        if (stats == null) {
            synchronized (PBArmorStats.class) {
                stats = loaded;
                if (stats == null) {
                    stats = load();
                    loaded = stats;
                }
            }
        }

        SetStats result = stats.get(setKey);
        if (result == null) {
            throw new IllegalArgumentException("Unknown armor set key: " + setKey);
        }
        return result;
    }

    private static Map<String, SetStats> load() {
        Path file = FMLPaths.CONFIGDIR.get().resolve(FILE_NAME);
        JsonObject root = null;

        if (Files.exists(file)) {
            try (Reader reader = Files.newBufferedReader(file)) {
                root = JsonParser.parseReader(reader).getAsJsonObject();
            } catch (IOException | RuntimeException exception) {
                LOGGER.error("Could not read {}, using default armor stats", FILE_NAME, exception);
            }
        }

        Map<String, SetStats> result = new LinkedHashMap<>();
        for (Map.Entry<String, SetStats> entry : DEFAULTS.entrySet()) {
            JsonObject setJson = root != null && root.has(entry.getKey()) ? root.getAsJsonObject(entry.getKey()) : null;
            result.put(entry.getKey(), merge(entry.getValue(), setJson));
        }

        if (root == null) {
            writeDefaults(file);
        }

        return result;
    }

    private static SetStats merge(SetStats def, JsonObject json) {
        if (json == null) {
            return def;
        }

        JsonObject defense = json.has("defense") ? json.getAsJsonObject("defense") : new JsonObject();
        JsonObject penalty = json.has("movement_speed_penalty") ? json.getAsJsonObject("movement_speed_penalty") : new JsonObject();
        return new SetStats(
                getInt(json, "durability_multiplier", def.durabilityMultiplier()),
                getInt(json, "enchantment_value", def.enchantmentValue()),
                getInt(defense, "boots", def.defenseBoots()),
                getInt(defense, "leggings", def.defenseLeggings()),
                getInt(defense, "chestplate", def.defenseChestplate()),
                getInt(defense, "helmet", def.defenseHelmet()),
                getFloat(json, "toughness", def.toughness()),
                getFloat(json, "knockback_resistance", def.knockbackResistance()),
                getDouble(json, "magic_armor_bonus", def.magicArmorBonus()),
                getDouble(penalty, "helmet", def.speedPenaltyHelmet()),
                getDouble(penalty, "chestplate", def.speedPenaltyChestplate()),
                getDouble(penalty, "leggings", def.speedPenaltyLeggings()),
                getDouble(penalty, "boots", def.speedPenaltyBoots())
        );
    }

    private static int getInt(JsonObject json, String key, int fallback) {
        return json.has(key) ? json.get(key).getAsInt() : fallback;
    }

    private static float getFloat(JsonObject json, String key, float fallback) {
        return json.has(key) ? json.get(key).getAsFloat() : fallback;
    }

    private static double getDouble(JsonObject json, String key, double fallback) {
        return json.has(key) ? json.get(key).getAsDouble() : fallback;
    }

    private static void writeDefaults(Path file) {
        JsonObject root = new JsonObject();
        for (Map.Entry<String, SetStats> entry : DEFAULTS.entrySet()) {
            SetStats stats = entry.getValue();
            JsonObject setJson = new JsonObject();
            setJson.addProperty("durability_multiplier", stats.durabilityMultiplier());
            setJson.addProperty("enchantment_value", stats.enchantmentValue());
            JsonObject defense = new JsonObject();
            defense.addProperty("helmet", stats.defenseHelmet());
            defense.addProperty("chestplate", stats.defenseChestplate());
            defense.addProperty("leggings", stats.defenseLeggings());
            defense.addProperty("boots", stats.defenseBoots());
            setJson.add("defense", defense);
            setJson.addProperty("toughness", stats.toughness());
            setJson.addProperty("knockback_resistance", stats.knockbackResistance());
            setJson.addProperty("magic_armor_bonus", stats.magicArmorBonus());
            JsonObject penalty = new JsonObject();
            penalty.addProperty("helmet", stats.speedPenaltyHelmet());
            penalty.addProperty("chestplate", stats.speedPenaltyChestplate());
            penalty.addProperty("leggings", stats.speedPenaltyLeggings());
            penalty.addProperty("boots", stats.speedPenaltyBoots());
            setJson.add("movement_speed_penalty", penalty);
            root.add(entry.getKey(), setJson);
        }

        try (Writer writer = Files.newBufferedWriter(file)) {
            GSON.toJson(root, writer);
            LOGGER.info("Wrote default armor stats to {}", file);
        } catch (IOException exception) {
            LOGGER.error("Could not write default {}", FILE_NAME, exception);
        }
    }
}
