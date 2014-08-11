package com.ryanv97.blokkit.init;

import com.ryanv97.blokkit.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemDiamondBlokkit diamondBlokkit = new ItemDiamondBlokkit();
    public static final ItemGlowstoneBlokkit glowstoneBlokkit = new ItemGlowstoneBlokkit();
    public static final ItemGoldBlokkit goldBlokkit = new ItemGoldBlokkit();
    public static final ItemGrassBlokkit grassBlokkit = new ItemGrassBlokkit();
    public static final ItemIronBlokkit ironBlokkit = new ItemIronBlokkit();
    public static final ItemStoneBlokkit stoneBlokkit = new ItemStoneBlokkit();
    public static final ItemWoodBlokkit woodBlokkit = new ItemWoodBlokkit();

    public static void init()
    {
        GameRegistry.registerItem(diamondBlokkit,"diamondBlokkit");
        GameRegistry.registerItem(glowstoneBlokkit,"glowstoneBlokkit");
        GameRegistry.registerItem(goldBlokkit,"goldBlokkit");
        GameRegistry.registerItem(grassBlokkit,"grassBlokkit");
        GameRegistry.registerItem(ironBlokkit,"ironBlokkit");
        GameRegistry.registerItem(stoneBlokkit,"stoneBlokkit");
        GameRegistry.registerItem(woodBlokkit,"woodBlokkit");
    }
}
