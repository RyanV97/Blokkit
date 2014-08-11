package com.ryanv97.blokkit.client.gui;

import com.ryanv97.blokkit.entity.EntityBlokkit;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;
import org.lwjgl.input.Keyboard;

public class GuiName extends GuiScreen
{
    private GuiTextField input;
    private GuiButton buttonDone;
    private GuiButton buttonCancel;
    private final EntityBlokkit blokkit;
    private GuiScreen prevGui;
    
    public GuiName(EntityBlokkit entity)
    {
        this.blokkit = entity;
    }

    public GuiName(EntityBlokkit entity, GuiScreen prevGui)
    {
        this.blokkit = entity;
        this.prevGui = prevGui;
    }

    public void updateScreen()
    {
        this.input.updateCursorCounter();
    }

    public void initGui()
    {
        Keyboard.enableRepeatEvents(true);
        this.buttonList.clear();
        this.buttonList.add(this.buttonDone = new GuiButton(0, this.width / 2 - 4 - 150, this.height / 4 + 120 + 12, 150, 20, I18n.format("gui.done", new Object[0])));
        this.buttonList.add(this.buttonCancel = new GuiButton(1, this.width / 2 + 4, this.height / 4 + 120 + 12, 150, 20, I18n.format("gui.cancel", new Object[0])));
        this.input = new GuiTextField(this.fontRendererObj, this.width / 2 - 150, 50, 300, 20);
        this.input.setMaxStringLength(32767);
        this.input.setFocused(true);

        this.buttonDone.enabled = this.input.getText().trim().length() > 0;
    }

    public void onGuiClosed()
    {
        Keyboard.enableRepeatEvents(false);
    }

    protected void actionPerformed(GuiButton button)
    {
        if (button.enabled)
        {
            if (button.id == 1)
            {
                this.mc.displayGuiScreen(this.prevGui);
            }
            else if (button.id == 0)
            {
                String name = input.getText();
                blokkit.setBlokkitName(name);
                this.mc.displayGuiScreen(this.prevGui);
            }
        }
    }

    protected void keyTyped(char par1, int par2)
    {
        this.input.textboxKeyTyped(par1, par2);
        this.buttonDone.enabled = this.input.getText().trim().length() > 0;

        if (par2 != 28 && par2 != 156)
        {
            if (par2 == 1)
            {
                this.actionPerformed(this.buttonCancel);
            }
        }
        else
        {
            this.actionPerformed(this.buttonDone);
        }
    }

    protected void mouseClicked(int par1, int par2, int par3)
    {
        super.mouseClicked(par1, par2, par3);
        this.input.mouseClicked(par1, par2, par3);
    }

    public void drawScreen(int par1, int par2, float par3)
    {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, "Name your Blokkit!", this.width / 2, 20, 16777215);
        this.input.drawTextBox();
        super.drawScreen(par1, par2, par3);
    }
}
