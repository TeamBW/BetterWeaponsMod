package com.royalkingzb.betterweaponsmod.init;

import com.royalkingzb.betterweaponsmod.item.ItemBW;
import com.royalkingzb.betterweaponsmod.item.ItemReinforcedDiamond;
import com.royalkingzb.betterweaponsmod.item.ItemReinforcedDiamondMk2;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemBW reinforcedDiamond = new ItemReinforcedDiamond();
    public static final ItemBW reinforcedDiamondMk2 = new ItemReinforcedDiamondMk2();

    public static void init() {

        GameRegistry.registerItem(reinforcedDiamond, "reinforcedDiamond");
        GameRegistry.registerItem(reinforcedDiamondMk2, "reinforcedDiamondMk2");

    }
}
