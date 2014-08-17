package com.ryanv97.blokkit.init;

import com.ryanv97.blokkit.Blokkit;
import com.ryanv97.blokkit.entity.basic.*;
import com.ryanv97.blokkit.entity.big.*;
import com.ryanv97.blokkit.entity.giant.*;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities
{
    public static void init()
    {
        EntityRegistry.registerModEntity(EntityDiamondBlokkit.class, "diamondBlokkit", 0, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityBigDiamondBlokkit.class, "bigDiamondBlokkit", 1, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityGiantDiamondBlokkit.class, "giantDiamondBlokkit", 2, Blokkit.instance, 80, 3, true);

        EntityRegistry.registerModEntity(EntityGoldBlokkit.class, "goldBlokkit", 3, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityBigGoldBlokkit.class, "bigGolddBlokkit", 4, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityGiantGoldBlokkit.class, "giantGoldBlokkit", 5, Blokkit.instance, 80, 3, true);

        EntityRegistry.registerModEntity(EntityGrassBlokkit.class, "grassBlokkit", 6, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityBigGrassBlokkit.class, "bigGrassdBlokkit", 7, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityGiantGrassBlokkit.class, "giantGrassBlokkit", 8, Blokkit.instance, 80, 3, true);

        EntityRegistry.registerModEntity(EntityIronBlokkit.class, "ironBlokkit", 9, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityBigIronBlokkit.class, "bigIrondBlokkit", 10, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityGiantIronBlokkit.class, "giantIronBlokkit", 11, Blokkit.instance, 80, 3, true);

        EntityRegistry.registerModEntity(EntityStoneBlokkit.class, "stoneBlokkit", 12, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityBigStoneBlokkit.class, "bigStonedBlokkit", 13, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityGiantStoneBlokkit.class, "giantStoneBlokkit", 14, Blokkit.instance, 80, 3, true);

        EntityRegistry.registerModEntity(EntityWoodBlokkit.class, "woodBlokkit", 15, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityBigWoodBlokkit.class, "bigWooddBlokkit", 16, Blokkit.instance, 80, 3, true);
        EntityRegistry.registerModEntity(EntityGiantWoodBlokkit.class, "giantWoodBlokkit", 17, Blokkit.instance, 80, 3, true);
    }
}
