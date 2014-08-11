package com.ryanv97.blokkit.entity;

import com.ryanv97.blokkit.Blokkit;
import com.ryanv97.blokkit.client.gui.GuiName;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityBlokkit extends EntityTameable
{
    private int exp;
    private int level;
    String name = "Blokkit";
    private boolean canLevel = false;

    public EntityBlokkit(World world)
    {
        super(world);
        setSize(0.6F, 0.8F);
        this.isImmuneToFire = true;
        this.tasks.addTask(1, this.aiSit);
        this.tasks.addTask(2, new EntityAILeapAtTarget(this, 0.2F));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(4, new EntityAIFollowOwner(this, 1.5D, 2.0F, 0.0F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAITempt(this, 1.0D, Items.baked_potato, false));
        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        setTamed(false);

        this.exp=0;
        this.level=1;
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    private void generateRandomParticles(String par1Str)
    {
        for (int i = 0; i < 5; i++)
        {
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            double d2 = this.rand.nextGaussian() * 0.02D;
            this.worldObj.spawnParticle(par1Str, this.posX + this.rand.nextFloat() * this.width * 2.0F - this.width, this.posY + 0.5D + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0F - this.width, d0, d1, d2);
        }
    }

    protected void updateAITasks()
    {
        super.updateAITasks();
        if(canLevel)
        {
            this.setCustomNameTag(EnumChatFormatting.GOLD+"!"+EnumChatFormatting.WHITE+ name +EnumChatFormatting.GOLD+"!");
        }
    }

    public void levelUp()
    {
        //this.health = getHealth();
        EntityPlayer entityplayer = (EntityPlayer)this.getOwner();
        this.worldObj.playSoundAtEntity(entityplayer, "random.levelup", 1.0F, 1.0F);
        this.level += 1;
        this.exp = 0;
        this.canLevel = true;

        //getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(this.hplvl + 5.0D);
        //this.maxhealth += 5.0F;
        //heal(this.maxhealth);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.27D);
    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        int i = isTamed() ? 6 : 2;
        return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), i);
    }

    public void onKillEntity(EntityLivingBase entity) {
        EntityPlayer player = (EntityPlayer)this.getOwner();
        int xp = 10;
        if(entity instanceof EntityMob)
            xp=20;
        if(entity instanceof EntityAnimal)
            xp=5;
        this.exp+=xp;
        if(this.exp>=200)
            levelUp();
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        ItemStack itemStack = par1EntityPlayer.getCurrentEquippedItem();
        if(!par1EntityPlayer.isSneaking())
        {
            if(!isTamed())
            {
                if (!this.worldObj.isRemote)
                {
                    setTamed(true);
                    setAlwaysRenderNameTag(true);
                    setCustomNameTag(name);
                    setPathToEntity((PathEntity)null);
                    this.aiSit.setSitting(false);
                    setHealth(40.0F);
                    setOwner(par1EntityPlayer.getCommandSenderName());
                    playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)7);
                }
                return true;
            }
            else
            {
                if(itemStack!=null && itemStack.getItem()==Items.apple)
                {
                    if (!par1EntityPlayer.capabilities.isCreativeMode)
                    {
                        itemStack.stackSize -= 1;
                    }

                    heal(5.0F);
                    generateRandomParticles("heart");

                    if (itemStack.stackSize <= 0)
                    {
                        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                    }

                    return true;
                }
                if ((par1EntityPlayer.getCommandSenderName().equalsIgnoreCase(getOwnerName())) && (!this.worldObj.isRemote))
                {
                    this.aiSit.setSitting(!isSitting());
                    this.isJumping = false;
                    setPathToEntity((PathEntity)null);
                    setTarget((Entity)null);
                }
            }
        }else
        if(isTamed()&&par1EntityPlayer.getCommandSenderName().equalsIgnoreCase(getOwnerName()))
        {
            par1EntityPlayer.openGui(Blokkit.instance,0,par1EntityPlayer.getEntityWorld(),this.getEntityId(),0,0);
        }
        return true;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable var1)
    {
        return null;
    }

    public void setBlokkitName(String name)
    {
        this.setCustomNameTag(name);
    }
}