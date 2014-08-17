package com.ryanv97.blokkit.client.renderer.basic;

import com.ryanv97.blokkit.client.model.ModelBlokkit;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderWoodBlokkit extends RenderLiving
{
    private static final ResourceLocation texture = new ResourceLocation("blokkit", "textures/models/woodBlokkit.png");

    public RenderWoodBlokkit()
    {
        super(new ModelBlokkit(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1)
    {
        return texture;
    }
}