package com.ryanv97.blokkit.item;

import com.ryanv97.blokkit.entity.basic.EntityWoodBlokkit;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemWoodBlokkit extends ItemBlokkit
{
    public ItemWoodBlokkit()
    {
        super();
        this.setUnlocalizedName("woodBlokkit");
        this.setMaxStackSize(1);
    }

    public static Entity spawnCreature(World par0World, double x, double y, double z)
    {
        EntityWoodBlokkit blokkit = new EntityWoodBlokkit(par0World);
        blokkit.setLocationAndAngles(x, y, z, MathHelper.wrapAngleTo180_float(par0World.rand.nextFloat() * 360.0F), 0.0F);
        blokkit.rotationYawHead = blokkit.rotationYaw;
        blokkit.renderYawOffset = blokkit.rotationYaw;
        par0World.spawnEntityInWorld(blokkit);

        return blokkit;
    }

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par3World.isRemote)
        {
            return true;
        } else
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
            if (spawnCreature(par3World, (double) par4 + 0.5D, (double) par5 + d0, (double) par6 + 0.5D) != null)
            {
                par1ItemStack.stackSize -= 1;
            }
            return true;
        }
    }
}
