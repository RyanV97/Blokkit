package com.ryanv97.blokkit.init;

import com.ryanv97.blokkit.Blokkit;
import com.ryanv97.blokkit.entity.EntityBlokkit;
import com.ryanv97.blokkit.entity.EntityDiamondBlokkit;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities
{
    public static void init()
    {
        EntityRegistry.registerModEntity(EntityDiamondBlokkit.class, "diamondBlokkit", EntityRegistry.findGlobalUniqueEntityId(), Blokkit.instance, 80, 3, true);
    }
}
