package com.ryanv97.blokkit.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGrassBlokkit extends ItemBlokkit
{
    public ItemGrassBlokkit()
    {
        super();
        this.setUnlocalizedName("grassBlokkit");
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick (ItemStack stack, World world, EntityPlayer player)
    {
        return stack;
    }
}
