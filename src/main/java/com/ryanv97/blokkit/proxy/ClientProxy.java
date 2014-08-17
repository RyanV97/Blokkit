package com.ryanv97.blokkit.proxy;

import com.ryanv97.blokkit.client.model.ModelGiantBlokkit;
import com.ryanv97.blokkit.client.model.ModelGiantDiamondBlokkit;
import com.ryanv97.blokkit.client.model.ModelGiantGoldBlokkit;
import com.ryanv97.blokkit.client.model.ModelGiantIronBlokkit;
import com.ryanv97.blokkit.client.renderer.basic.*;
import com.ryanv97.blokkit.client.renderer.big.*;
import com.ryanv97.blokkit.client.renderer.giant.*;
import com.ryanv97.blokkit.entity.basic.*;
import com.ryanv97.blokkit.entity.big.*;
import com.ryanv97.blokkit.entity.giant.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityDiamondBlokkit.class, new RenderDiamondBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityGoldBlokkit.class, new RenderGoldBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityGrassBlokkit.class, new RenderGrassBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityIronBlokkit.class, new RenderIronBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityStoneBlokkit.class, new RenderStoneBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityWoodBlokkit.class, new RenderWoodBlokkit());

        RenderingRegistry.registerEntityRenderingHandler(EntityBigDiamondBlokkit.class, new RenderBigDiamondBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityBigGoldBlokkit.class, new RenderBigGoldBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityBigGrassBlokkit.class, new RenderBigGrassBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityBigIronBlokkit.class, new RenderBigIronBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityBigStoneBlokkit.class, new RenderBigStoneBlokkit());
        RenderingRegistry.registerEntityRenderingHandler(EntityBigWoodBlokkit.class, new RenderBigWoodBlokkit());

        RenderingRegistry.registerEntityRenderingHandler(EntityGiantDiamondBlokkit.class, new RenderGiantDiamondBlokkit(new ModelGiantDiamondBlokkit()));
        RenderingRegistry.registerEntityRenderingHandler(EntityGiantGoldBlokkit.class, new RenderGiantGoldBlokkit(new ModelGiantGoldBlokkit()));
        RenderingRegistry.registerEntityRenderingHandler(EntityGiantGrassBlokkit.class, new RenderGiantGrassBlokkit(new ModelGiantBlokkit()));
        RenderingRegistry.registerEntityRenderingHandler(EntityGiantIronBlokkit.class, new RenderGiantIronBlokkit(new ModelGiantIronBlokkit()));
        RenderingRegistry.registerEntityRenderingHandler(EntityGiantStoneBlokkit.class, new RenderGiantStoneBlokkit(new ModelGiantBlokkit()));
        RenderingRegistry.registerEntityRenderingHandler(EntityGiantWoodBlokkit.class, new RenderGiantWoodBlokkit(new ModelGiantBlokkit()));
    }
}
