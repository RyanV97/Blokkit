package com.ryanv97.blokkit.entity.big;

import com.ryanv97.blokkit.entity.basic.EntityGoldBlokkit;
import com.ryanv97.blokkit.entity.giant.EntityGiantGoldBlokkit;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityBigGoldBlokkit extends EntityGoldBlokkit
{
    public EntityBigGoldBlokkit(World world)
    {
        super(world);
        setSize(1.2F, 1.6F);
    }

    public void evolve(EntityPlayer player)
    {
        if (!this.worldObj.isRemote)
        {
            EntityGiantGoldBlokkit newBlokkit = new EntityGiantGoldBlokkit(this.worldObj);
            newBlokkit.dataWatcher.updateObject(20, this.getMaxExp());
            newBlokkit.hplvl = hplvl;
            newBlokkit.evolvelvl = evolvelvl;
            newBlokkit.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(hplvl);
            newBlokkit.heal(newBlokkit.getMaxHealth());
            newBlokkit.dmglvl = dmglvl;
            newBlokkit.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rand.nextFloat() * 180.0F, 0.0F);
            newBlokkit.setTamed(true);
            newBlokkit.setPathToEntity((PathEntity) null);
            newBlokkit.heal(newBlokkit.getMaxHealth());
            newBlokkit.setOwner(player.getCommandSenderName());
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD + "Your Blokkit Evolved!"));
            this.worldObj.spawnEntityInWorld(newBlokkit);
            this.setDead();
        }
    }
}
