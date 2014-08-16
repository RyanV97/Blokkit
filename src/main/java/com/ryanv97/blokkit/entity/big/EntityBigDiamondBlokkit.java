package com.ryanv97.blokkit.entity.big;

import com.ryanv97.blokkit.entity.basic.EntityBlokkit;
import net.minecraft.world.World;

public class EntityBigDiamondBlokkit extends EntityBigBlokkit
{
    public EntityBigDiamondBlokkit(World world, int maxExp, double hplvl, int dmglvl)
    {
        super(world);
        this.setFood("diamond");
        this.dataWatcher.updateObject(20, this.getMaxExp());
        this.hplvl = hplvl;
        this.dmglvl = dmglvl;
        this.type = "diamond";
    }
}