package com.royalkingzb.betterweaponsmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.reinforcedDiamond), new ItemStack(Item.getItemById(264)), new ItemStack(Item.getItemById(264)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.reinforcedDiamondBlock), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamond), new ItemStack(ModItems.reinforcedDiamond));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.reinforcedDiamondBlockMk2), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk2), new ItemStack(ModItems.reinforcedDiamondMk2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.reinforcedDiamondBlockMk3), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk3), new ItemStack(ModItems.reinforcedDiamondMk3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.reinforcedDiamondBlockMk4), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk4), new ItemStack(ModItems.reinforcedDiamondMk4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.reinforcedDiamondBlockMk5), new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk5), new ItemStack(ModItems.reinforcedDiamondMk5));
    }
}

