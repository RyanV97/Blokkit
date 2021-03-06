package com.ryanv97.blokkit.entity.basic;

import com.ryanv97.blokkit.entity.EntityBlokkit;
import com.ryanv97.blokkit.entity.big.EntityBigGrassBlokkit;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityGrassBlokkit extends EntityBlokkit
{
    public EntityGrassBlokkit(World world)
    {
        super(world);
        setFood(new ItemStack(Blocks.dirt));
        hplvl = 10.0D;
        this.dataWatcher.addObject(20, 100);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
    }

    public void evolve(EntityPlayer player)
    {
        if (!this.worldObj.isRemote)
        {
            EntityBigGrassBlokkit newBlokkit = new EntityBigGrassBlokkit(this.worldObj);
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
