package com.rave.projectbabylonarmors;

import com.mojang.logging.LogUtils;
import com.rave.projectbabylonarmors.config.PBConfig;
import com.rave.projectbabylonarmors.init.PBArmorEffects;
import com.rave.projectbabylonarmors.init.PBArmorItems;
import com.rave.projectbabylonarmors.init.PBCreativeTabs;
import com.rave.projectbabylonarmors.setbonus.ArmorSetRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ProjectBabylonArmors.MODID)
public class ProjectBabylonArmors {
    public static final String MODID = "project_babylon_armors";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ProjectBabylonArmors(FMLJavaModLoadingContext context) {
        IEventBus modBus = context.getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, PBConfig.SPEC);
        PBArmorEffects.EFFECTS.register(modBus);
        PBArmorItems.ITEMS.register(modBus);
        PBCreativeTabs.TABS.register(modBus);
        ArmorSetRegistry.bootstrap();
    }
}
