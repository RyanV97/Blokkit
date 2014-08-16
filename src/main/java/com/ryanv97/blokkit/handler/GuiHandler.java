package com.ryanv97.blokkit.handler;

import com.ryanv97.blokkit.client.gui.GuiStats;
import com.ryanv97.blokkit.entity.basic.EntityBlokkit;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

    @Override
    public Object getServerGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    @Override
    public Object getClientGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID==0) {
            Entity entity = world.getEntityByID(x);
            if (entity instanceof EntityBlokkit)
                return new GuiStats((EntityBlokkit)entity);
        }

        return null;
    }
}
