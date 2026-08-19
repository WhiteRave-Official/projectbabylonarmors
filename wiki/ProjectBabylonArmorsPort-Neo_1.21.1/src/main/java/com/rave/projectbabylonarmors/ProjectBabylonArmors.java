package com.rave.projectbabylonarmors;

import com.mojang.logging.LogUtils;
import com.rave.projectbabylonarmors.config.PBConfig;
import com.rave.projectbabylonarmors.init.PBArmorEffects;
import com.rave.projectbabylonarmors.init.PBArmorItems;
import com.rave.projectbabylonarmors.init.PBArmorMaterials;
import com.rave.projectbabylonarmors.init.PBCreativeTabs;
import com.rave.projectbabylonarmors.setbonus.ArmorSetRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(ProjectBabylonArmors.MODID)
public class ProjectBabylonArmors {
    public static final String MODID = "project_babylon_armors";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ProjectBabylonArmors(IEventBus modBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, PBConfig.SPEC);
        PBArmorEffects.EFFECTS.register(modBus);
        PBArmorMaterials.ARMOR_MATERIALS.register(modBus);
        PBArmorItems.ITEMS.register(modBus);
        PBCreativeTabs.TABS.register(modBus);
        ArmorSetRegistry.bootstrap();
    }
}
