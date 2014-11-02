package com.royalkingzb.betterweaponsmod;


import com.royalkingzb.betterweaponsmod.handler.ConfigurationHandler;
import com.royalkingzb.betterweaponsmod.init.ModBlocks;
import com.royalkingzb.betterweaponsmod.init.ModItems;
import com.royalkingzb.betterweaponsmod.init.Recipes;
import com.royalkingzb.betterweaponsmod.item.*;
import com.royalkingzb.betterweaponsmod.proxy.IProxy;
import com.royalkingzb.betterweaponsmod.reference.Reference;
import com.royalkingzb.betterweaponsmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class BetterWeaponsMod {

    @Mod.Instance(Reference.MOD_ID)
    public static BetterWeaponsMod instance;

    /*@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;*/

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {


        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        Recipes.init();

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete");
    }

}
