package com.ryanv97.blokkit.client.renderer;

import com.ryanv97.blokkit.client.model.ModelBlokkit;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderGiantBlokkit extends RenderLiving
{
    private static final ResourceLocation diamond = new ResourceLocation("blokkit","textures/models/giant/diamondBlokkit.png");
    private static final ResourceLocation gold = new ResourceLocation("blokkit","textures/models/giant/goldBlokkit.png");
    private static final ResourceLocation grass = new ResourceLocation("blokkit","textures/models/giant/grassBlokkit.png");
    private static final ResourceLocation iron = new ResourceLocation("blokkit","textures/models/giant/ironBlokkit.png");
    private static final ResourceLocation stone = new ResourceLocation("blokkit","textures/models/giant/stoneBlokkit.png");
    private static final ResourceLocation wood = new ResourceLocation("blokkit","textures/models/giant/woodBlokkit.png");

    private static String type;

    public RenderGiantBlokkit(String type, ModelBase model)
    {
        super(model,0.5F);
        this.type = type;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        if(type=="diamond")
            return diamond;
        if (type=="gold")
            return gold;
        if (type=="grass")
            return grass;
        if (type=="iron")
            return iron;
        if (type=="stone")
            return stone;
        if (type=="wood")
            return wood;
        else
            return wood;
    }
}