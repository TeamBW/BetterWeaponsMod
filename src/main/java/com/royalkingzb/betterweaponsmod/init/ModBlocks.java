package com.royalkingzb.betterweaponsmod.init;

import com.royalkingzb.betterweaponsmod.block.*;
import com.royalkingzb.betterweaponsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockBW reinforcedDiamondBlock = new BlockReinforcedDiamond();
    public static final BlockBW reinforcedDiamondBlockMk2 = new BlockReinforcedDiamondMk2();
    public static final BlockBW reinforcedDiamondBlockMk3 = new BlockReinforcedDiamondMk3();
    public static final BlockBW reinforcedDiamondBlockMk4 = new BlockReinforcedDiamondMk4();
    public static final BlockBW reinforcedDiamondBlockMk5 = new BlockReinforcedDiamondMk5();

    public static void init() {

        GameRegistry.registerBlock(reinforcedDiamondBlock, "reinforcedDiamondBlock");
        GameRegistry.registerBlock(reinforcedDiamondBlockMk2, "reinforcedDiamondBlockMk2");
        GameRegistry.registerBlock(reinforcedDiamondBlockMk3, "reinforcedDiamondBlockMk3");
        GameRegistry.registerBlock(reinforcedDiamondBlockMk4, "reinforcedDiamondBlockMk4");
        GameRegistry.registerBlock(reinforcedDiamondBlockMk5, "reinforcedDiamondBlockMk5");

    }
}
