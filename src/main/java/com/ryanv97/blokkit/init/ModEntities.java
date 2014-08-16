package com.ryanv97.blokkit.init;

import com.ryanv97.blokkit.Blokkit;
import com.ryanv97.blokkit.entity.basic.EntityDiamondBlokkit;
import com.ryanv97.blokkit.entity.big.EntityBigDiamondBlokkit;
import com.ryanv97.blokkit.entity.giant.EntityGiantDiamondBlokkit;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities
{
    public static void init()
    {
        EntityRegistry.registerModEntity(EntityDiamondBlokkit.class, "diamondBlokkit", EntityRegistry.findGlobalUniqueEntityId(), Blokkit.instance, 80, 3, true);

        EntityRegistry.registerModEntity(EntityBigDiamondBlokkit.class, "bigDiamondBlokkit", EntityRegistry.findGlobalUniqueEntityId(), Blokkit.instance, 80, 3, true);

        EntityRegistry.registerModEntity(EntityGiantDiamondBlokkit.class, "giantDiamondBlokkit", EntityRegistry.findGlobalUniqueEntityId(), Blokkit.instance, 80, 3, true);
    }
}
