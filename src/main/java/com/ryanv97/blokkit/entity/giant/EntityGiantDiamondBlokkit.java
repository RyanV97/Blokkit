package com.ryanv97.blokkit.entity.giant;

import com.ryanv97.blokkit.entity.basic.EntityBlokkit;
import net.minecraft.world.World;

public class EntityGiantDiamondBlokkit extends EntityBlokkit
{
    public EntityGiantDiamondBlokkit(World world, int maxExp, double hplvl, int dmglvl)
    {
        super(world);
        this.dataWatcher.updateObject(20, this.getMaxExp());
        this.hplvl = hplvl;
        this.dmglvl = dmglvl;
    }
}