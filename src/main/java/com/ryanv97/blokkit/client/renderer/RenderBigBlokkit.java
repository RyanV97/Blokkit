package com.ryanv97.blokkit.client.renderer;

import com.ryanv97.blokkit.client.model.ModelBigBlokkit;
import com.ryanv97.blokkit.client.model.ModelBlokkit;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderBigBlokkit extends RenderLiving
{
    private static final ResourceLocation diamond = new ResourceLocation("blokkit","textures/models/big/diamondBlokkit.png");
    private static final ResourceLocation gold = new ResourceLocation("blokkit","textures/models/big/goldBlokkit.png");
    private static final ResourceLocation grass = new ResourceLocation("blokkit","textures/models/big/grassBlokkit.png");
    private static final ResourceLocation iron = new ResourceLocation("blokkit","textures/models/big/ironBlokkit.png");
    private static final ResourceLocation stone = new ResourceLocation("blokkit","textures/models/big/stoneBlokkit.png");
    private static final ResourceLocation wood = new ResourceLocation("blokkit","textures/models/big/woodBlokkit.png");

    private static String type;

    public RenderBigBlokkit(String type)
    {
        super(new ModelBigBlokkit(),0.5F);
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