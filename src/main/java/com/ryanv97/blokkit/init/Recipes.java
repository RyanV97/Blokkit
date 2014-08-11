package com.ryanv97.blokkit.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.diamondBlokkit),"DDD","DRD","DDD",'D', new ItemStack(Items.diamond),'R', new ItemStack(Items.redstone));
        GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneBlokkit),"GGG","GRG","GGG",'G', new ItemStack(Items.glowstone_dust),'R', new ItemStack(Items.redstone));
        GameRegistry.addRecipe(new ItemStack(ModItems.goldBlokkit),"GGG","GRG","GGG",'G', new ItemStack(Items.gold_ingot),'R', new ItemStack(Items.redstone));
        GameRegistry.addRecipe(new ItemStack(ModItems.grassBlokkit),"DDD","DRD","DDD",'D', new ItemStack(Blocks.dirt),'R', new ItemStack(Items.redstone));
        GameRegistry.addRecipe(new ItemStack(ModItems.ironBlokkit),"III","IRI","III",'I', new ItemStack(Items.iron_ingot),'R', new ItemStack(Items.redstone));
        GameRegistry.addRecipe(new ItemStack(ModItems.stoneBlokkit),"SSS","SRS","SSS",'S', new ItemStack(Blocks.stone),'R', new ItemStack(Items.redstone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.woodBlokkit),"WWW","WRW","WWW",'W', "logWood",'R', new ItemStack(Items.redstone)));
    }
}
