package com.royalkingzb.betterweaponsmod.item;

import com.royalkingzb.betterweaponsmod.proxy.ClientProxy;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemReinforcedDiamondSword extends ItemBW {

    public ItemReinforcedDiamondSword() {

        super();
        this.setMaxStackSize(1);
        this.setMaxDamage(2750);
        this.setUnlocalizedName("reinforcedDiamondSword");

    }
}

