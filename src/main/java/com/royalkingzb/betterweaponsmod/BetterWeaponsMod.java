package com.royalkingzb.betterweaponsmod;

import com.chaka.betterstorage.handler.ConfigurationHandler;
import com.chaka.betterstorage.init.ModBlocks;
import com.chaka.betterstorage.init.ModItems;
import com.chaka.betterstorage.init.Recipes;
import com.chaka.betterstorage.proxy.IProxy;
import com.chaka.betterstorage.reference.Reference;
import com.chaka.betterstorage.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class BetterStorage {

    @Mod.Instance(Reference.MOD_ID)
    public static BetterStorage instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        Recipes.init();

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete");
    }
}
