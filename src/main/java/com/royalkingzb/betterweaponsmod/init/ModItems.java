package com.royalkingzb.betterweaponsmod.init;

import com.royalkingzb.betterweaponsmod.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemBW reinforcedDiamond = new ItemReinforcedDiamond();
    public static final ItemBW reinforcedDiamondMk2 = new ItemReinforcedDiamondMk2();
    public static final ItemBW reinforcedDiamondMk3 = new ItemReinforcedDiamondMk3();
    public static final ItemBW reinforcedDiamondMk4 = new ItemReinforcedDiamondMk4();
    public static final ItemBW reinforcedDiamondMk5 = new ItemReinforcedDiamondMk5();
    public static final ItemBW reinforcedDiamondPickaxe = new ItemReinforcedDiamondPickaxe();
    public static final ItemBW reinforcedDiamondSword = new ItemReinforcedDiamondSword();
    public static final ItemBW reinforcedDiamondAxe = new ItemReinforcedDiamondAxe();
    public static final ItemBW reinforcedDiamondShovel = new ItemReinforcedDiamondShovel();
    public static final ItemBW reinforcedDiamondHoe = new ItemReinforcedDiamondHoe();

    public static void init() {

        GameRegistry.registerItem(reinforcedDiamond, "reinforcedDiamond");
        GameRegistry.registerItem(reinforcedDiamondMk2, "reinforcedDiamondMk2");
        GameRegistry.registerItem(reinforcedDiamondMk3, "reinforcedDiamondMk3");
        GameRegistry.registerItem(reinforcedDiamondMk4, "reinforcedDiamondMk4");
        GameRegistry.registerItem(reinforcedDiamondMk5, "reinforcedDiamondMk5");
        GameRegistry.registerItem(reinforcedDiamondMk5, "reinforcedDiamondMk5");
        GameRegistry.registerItem(reinforcedDiamondPickaxe, "reinforcedDiamondPickaxe");
        GameRegistry.registerItem(reinforcedDiamondSword, "reinforcedDiamondSword");
        GameRegistry.registerItem(reinforcedDiamondAxe, "reinforcedDiamondAxe");
        GameRegistry.registerItem(reinforcedDiamondShovel, "reinforcedDiamondShovel");
        GameRegistry.registerItem(reinforcedDiamondHoe, "reinforcedDiamondHoe");

    }
}
