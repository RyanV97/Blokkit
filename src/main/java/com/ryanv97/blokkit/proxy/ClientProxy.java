package com.ryanv97.blokkit.proxy;

import com.ryanv97.blokkit.client.renderer.RenderBlokkit;
import com.ryanv97.blokkit.entity.EntityBlokkit;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityBlokkit.class, new RenderBlokkit("diamond"));
    }
}
