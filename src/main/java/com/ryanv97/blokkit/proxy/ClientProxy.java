package com.ryanv97.blokkit.proxy;

import com.ryanv97.blokkit.client.model.ModelGiantDiamondBlokkit;
import com.ryanv97.blokkit.client.renderer.RenderBigBlokkit;
import com.ryanv97.blokkit.client.renderer.RenderBlokkit;
import com.ryanv97.blokkit.client.renderer.RenderGiantBlokkit;
import com.ryanv97.blokkit.entity.basic.EntityBlokkit;
import com.ryanv97.blokkit.entity.basic.EntityDiamondBlokkit;
import com.ryanv97.blokkit.entity.big.EntityBigDiamondBlokkit;
import com.ryanv97.blokkit.entity.giant.EntityGiantDiamondBlokkit;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityDiamondBlokkit.class, new RenderBlokkit("diamond"));

        RenderingRegistry.registerEntityRenderingHandler(EntityBigDiamondBlokkit.class, new RenderBigBlokkit("diamond"));

        RenderingRegistry.registerEntityRenderingHandler(EntityGiantDiamondBlokkit.class, new RenderGiantBlokkit("diamond", new ModelGiantDiamondBlokkit()));
    }
}
