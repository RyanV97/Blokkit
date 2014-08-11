package com.ryanv97.blokkit.handler;

import com.ryanv97.blokkit.util.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File config)
    {
        if(configuration==null) {
            configuration = new Configuration(config);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MODID)){
            loadConfig();
        }
    }

    private static void loadConfig()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Example config value.");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
