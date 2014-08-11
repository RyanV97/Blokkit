package com.ryanv97.blokkit.item;

import com.ryanv97.blokkit.creativetab.CreativeTabBlokkit;
import com.ryanv97.blokkit.util.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBlokkit extends Item
{
    public ItemBlokkit()
    {
        super();
        this.setCreativeTab(CreativeTabBlokkit.BlokkitTab);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.ResourceLocation, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.ResourceLocation, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
}
