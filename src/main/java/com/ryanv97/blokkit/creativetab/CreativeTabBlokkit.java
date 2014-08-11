package com.ryanv97.blokkit.creativetab;

import com.ryanv97.blokkit.init.ModItems;
import com.ryanv97.blokkit.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlokkit
{
    public static final CreativeTabs BlokkitTab = new CreativeTabs(Reference.MODID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.grassBlokkit;
        }
    };
}
