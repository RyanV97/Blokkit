package com.ryanv97.blokkit;

import com.ryanv97.blokkit.handler.ConfigurationHandler;
import com.ryanv97.blokkit.init.ModEntities;
import com.ryanv97.blokkit.init.ModItems;
import com.ryanv97.blokkit.init.Recipes;
import com.ryanv97.blokkit.proxy.CommonProxy;
import com.ryanv97.blokkit.util.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MODID, name = Reference.MODID, version = Reference.VERSION)
public class Blokkit
{
    @Mod.Instance(Reference.MODID)
    public static Blokkit instance;

    @SidedProxy(clientSide = Reference.Client_Proxy, serverSide = Reference.Server_Proxy)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);

        ModItems.init();
        ModEntities.init();
        proxy.initRenderers();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
