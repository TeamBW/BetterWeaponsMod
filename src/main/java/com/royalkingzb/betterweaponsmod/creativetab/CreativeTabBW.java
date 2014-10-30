package com.royalkingzb.betterweaponsmod.creativetab;

import com.royalkingzb.betterweaponsmod.init.ModBlocks;
import com.royalkingzb.betterweaponsmod.init.ModItems;
import com.royalkingzb.betterweaponsmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBW {

    public static final CreativeTabs BW_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.reinforcedDiamond;
        }
    };
}
