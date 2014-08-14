package com.ryanv97.blokkit.client.gui;

import com.ryanv97.blokkit.entity.EntityBlokkit;
import com.ryanv97.blokkit.util.Reference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.DataWatcher;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiStats extends GuiScreen
{
    private static final ResourceLocation background = new ResourceLocation(Reference.MODID.toLowerCase(), "textures/gui/guiStats.png");
    private EntityBlokkit entityBlokkit;
    private float field_147033_y;
    private float field_147032_z;
    private GuiButton buttonHp;
    DataWatcher dw;

    private int texWidth = 256;
    private int texHeight = 256;

    public GuiStats(EntityBlokkit blokkit)
    {
        this.entityBlokkit = blokkit;
        this.allowUserInput = false;
        dw = entityBlokkit.getDataWatcher();
    }

    public void drawScreen(int par1, int par2, float par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int localWidth = (this.width - this.texWidth + 75) / 2;
        int localHeight = (this.height - this.texHeight + 100) / 2;
        this.mc.getTextureManager().bindTexture(background);
        this.drawTexturedModalRect(localWidth, localHeight, 0, 0, this.texWidth, this.texHeight);
        GuiInventory.func_147046_a(localWidth + 43, localHeight + 60, 30, (float) (localWidth + 51) - this.field_147033_y, (float) (localHeight + 75 - 50) - this.field_147032_z, this.entityBlokkit);

        int colour = 0xFFFFFF;
        if(entityBlokkit.getHealth()>(entityBlokkit.getMaxHealth()/2))
            colour = 0x00CC00;
        if(entityBlokkit.getHealth()<=(entityBlokkit.getMaxHealth()/2))
            colour = 0xFF9933;
        if(entityBlokkit.getHealth()<=(entityBlokkit.getMaxHealth()/4))
            colour = 0xCC0000;

        this.drawString(fontRendererObj,EnumChatFormatting.WHITE+"HP: "+EnumChatFormatting.RESET +(int)entityBlokkit.getHealth()+"/"+(int)entityBlokkit.getMaxHealth(),localWidth+73,localHeight+20,colour);
        this.drawString(fontRendererObj,"Level: "+entityBlokkit.getLevel(),localWidth+73,localHeight+32,0xffFFFFFF);
        this.drawString(fontRendererObj,"EXP: "+entityBlokkit.getExp()+"/"+entityBlokkit.maxExp,localWidth+73,localHeight+45,0xffFFFFFF);

        this.field_147033_y = (float)par1;
        this.field_147032_z = (float)par2;
        super.drawScreen(par1, par2, par3);
    }
}
