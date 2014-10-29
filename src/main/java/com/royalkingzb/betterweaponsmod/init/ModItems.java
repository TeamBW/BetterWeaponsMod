package com.royalkingzb.betterweaponsmod.init;

import com.royalkingzb.betterweaponsmod.item.ItemBW;
import com.royalkingzb.betterweaponsmod.item.ItemReiforcedDiamond;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemBW reinforcedDiamond = new ItemReiforcedDiamond();

    public static void init() {

        GameRegistry.registerItem(reinforcedDiamond, "reinforcedDiamond");

    }
}
