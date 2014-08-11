package com.ryanv97.blokkit.client.renderer;

import com.ryanv97.blokkit.client.model.ModelBlokkit;
import com.ryanv97.blokkit.entity.EntityBlokkit;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderBlokkit extends RenderLiving
{
    private static final ResourceLocation diamond = new ResourceLocation("blokkit","textures/models/diamondBlokkit.png");
    private static final ResourceLocation glowstone = new ResourceLocation("blokkit","textures/models/glowstoneBlokkit.png");
    private static final ResourceLocation gold = new ResourceLocation("blokkit","textures/models/goldBlokkit.png");
    private static final ResourceLocation grass = new ResourceLocation("blokkit","textures/models/grassBlokkit.png");
    private static final ResourceLocation iron = new ResourceLocation("blokkit","textures/models/ironBlokkit.png");
    private static final ResourceLocation stone = new ResourceLocation("blokkit","textures/models/stoneBlokkit.png");
    private static final ResourceLocation wood = new ResourceLocation("blokkit","textures/models/woodBlokkit.png");

    private String type;

    public RenderBlokkit(String type)
    {
        super(new ModelBlokkit(),0.5F);
        shadowSize=0.5F;
        this.type = type;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        if(type=="diamond")
            return diamond;
        if (type=="glowstone")
            return glowstone;
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