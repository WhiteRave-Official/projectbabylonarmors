package com.rave.projectbabylonarmors;

import com.mojang.logging.LogUtils;
import com.rave.projectbabylonarmors.init.PBArmorItems;
import com.rave.projectbabylonarmors.init.PBCreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ProjectBabylonArmors.MODID)
public class ProjectBabylonArmors {
    public static final String MODID = "project_babylon_armors";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ProjectBabylonArmors(FMLJavaModLoadingContext context) {
        IEventBus modBus = context.getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        PBArmorItems.ITEMS.register(modBus);
        PBCreativeTabs.TABS.register(modBus);

    }
}
