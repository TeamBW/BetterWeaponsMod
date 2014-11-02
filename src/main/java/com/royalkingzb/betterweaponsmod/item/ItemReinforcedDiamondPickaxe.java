package com.royalkingzb.betterweaponsmod.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemReinforcedDiamondPickaxe extends ItemBW {

    public ItemReinforcedDiamondPickaxe() {

        super();
        this.setMaxStackSize(1);
        this.setMaxDamage(2750);
        this.setUnlocalizedName("reinforcedDiamondPickaxe");

    }

    public Item setFull3D() {
        this.bFull3D = true;
        return this;
    }

    public boolean showDurabilityBar(ItemStack stack)
    {
        return stack.isItemDamaged();
    }

    public float getDigSpeed(ItemStack itemstack, Block block, int metadata) {
        return func_150893_a(itemstack, block);

    }
}
