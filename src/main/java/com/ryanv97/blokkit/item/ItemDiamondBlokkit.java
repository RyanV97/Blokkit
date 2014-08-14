package com.ryanv97.blokkit.item;

import com.ryanv97.blokkit.entity.EntityBlokkit;
import com.ryanv97.blokkit.entity.EntityDiamondBlokkit;
import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemDiamondBlokkit extends ItemBlokkit
{
    public ItemDiamondBlokkit()
    {
        super();
        this.setUnlocalizedName("diamondBlokkit");
        this.setMaxStackSize(1);
    }

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par3World.isRemote)
        {
            return true;
        }
        else
        {
            Block block = par3World.getBlock(par4, par5, par6);
            par4 += Facing.offsetsXForSide[par7];
            par5 += Facing.offsetsYForSide[par7];
            par6 += Facing.offsetsZForSide[par7];
            double d0 = 0.0D;

            if (par7 == 1 && block.getRenderType() == 11)
            {
                d0 = 0.5D;
            }
            if(spawnCreature(par3World, (double)par4 + 0.5D, (double)par5 + d0, (double)par6 + 0.5D)!=null)
            {
                par1ItemStack.stackSize-=1;
            }
            return true;
        }
    }

    public static Entity spawnCreature(World par0World, double x, double y, double z)
    {
            Entity entity = null;

            for (int j = 0; j < 1; ++j)
            {
                EntityDiamondBlokkit blokkit = new EntityDiamondBlokkit(par0World);
                entity = blokkit;

                if (entity != null && entity instanceof EntityLivingBase)
                {
                    EntityLiving entityliving = (EntityLiving)entity;
                    entity.setLocationAndAngles(x, y, z, MathHelper.wrapAngleTo180_float(par0World.rand.nextFloat() * 360.0F), 0.0F);
                    entityliving.rotationYawHead = entityliving.rotationYaw;
                    entityliving.renderYawOffset = entityliving.rotationYaw;
                    par0World.spawnEntityInWorld(entity);
                    entityliving.playLivingSound();
                }
            }

            return entity;
    }
}