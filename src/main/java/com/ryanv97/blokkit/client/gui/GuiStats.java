package com.ryanv97.blokkit.client.gui;

import com.ryanv97.blokkit.entity.EntityBlokkit;
import com.ryanv97.blokkit.util.Reference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiStats extends GuiScreen
{
    private static final ResourceLocation background = new ResourceLocation(Reference.MODID.toLowerCase(), "/textures/gui/guiStats.png");
    private EntityBlokkit entityBlokkit;
    private float field_147033_y;
    private float field_147032_z;
    private GuiButton buttonRename;

    private int texWidth = 256;
    private int texHeight = 256;

    public GuiStats(EntityBlokkit blokkit)
    {
        this.entityBlokkit = blokkit;
        this.allowUserInput = false;
    }

    @Override
    public void initGui() {
        int localWidth = (this.width - this.texWidth + 215) / 2;
        int localHeight = (this.height - this.texHeight + 85) / 2;
        this.buttonList.clear();
        this.buttonList.add(this.buttonRename = new GuiButton(0, localWidth, localHeight, 20, 20, "R"));
    }

    protected void actionPerformed(GuiButton button)
    {
        if (button.enabled)
        {
            if (button.id == 0)
            {
                this.mc.displayGuiScreen(new GuiName(entityBlokkit, this));
            }
        }
    }

    public void drawScreen(int par1, int par2, float par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int localWidth = (this.width - this.texWidth + 75) / 2;
        int localHeight = (this.height - this.texHeight + 50) / 2;
        this.mc.getTextureManager().bindTexture(background);

        this.drawTexturedModalRect(localWidth, localHeight, 0, 0, this.texWidth, this.texHeight);
        GuiInventory.func_147046_a(localWidth + 43, localHeight + 60, 30, (float) (localWidth + 51) - this.field_147033_y, (float) (localHeight + 75 - 50) - this.field_147032_z, this.entityBlokkit);

        this.field_147033_y = (float)par1;
        this.field_147032_z = (float)par2;
        super.drawScreen(par1, par2, par3);
    }
}
