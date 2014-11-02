package com.royalkingzb.betterweaponsmod.block;

import net.minecraft.block.material.Material;

public class BlockReinforcedDiamond extends BlockBW {

    public BlockReinforcedDiamond() {

        super(Material.iron);
        this.setBlockName("reinforcedDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
    }
}
