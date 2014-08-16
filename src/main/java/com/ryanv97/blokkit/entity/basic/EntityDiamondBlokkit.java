package com.ryanv97.blokkit.entity.basic;

import net.minecraft.world.World;

public class EntityDiamondBlokkit extends EntityBlokkit {
    public EntityDiamondBlokkit(World world) {
        super(world);
        this.setFood("diamond");
        this.hplvl = 40.0D;
        this.evolvelvl = 15;
        this.type = "diamond";
    }
}
