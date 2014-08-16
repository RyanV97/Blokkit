package com.ryanv97.blokkit.entity.basic;

import com.ryanv97.blokkit.Blokkit;
import com.ryanv97.blokkit.entity.big.EntityBigBlokkit;
import com.ryanv97.blokkit.entity.big.EntityBigDiamondBlokkit;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityBlokkit extends EntityTameable
{
    public double hplvl = 20.0D;
    public int dmglvl = 2;
    public int evolvelvl = 5;
    public String type;
    public static Item food;

    public EntityBlokkit(World world)
    {
        super(world);
        setSize(0.6F, 0.8F);
        this.getNavigator().setAvoidsWater(true);
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

        this.dataWatcher.addObject(18,1); //Level
        this.dataWatcher.addObject(19,0); //Exp
        this.dataWatcher.addObject(20,100); //MaxExp
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
    }

    public void levelUp()
    {
        EntityPlayer entityplayer = (EntityPlayer)this.getOwner();
        this.worldObj.playSoundAtEntity(entityplayer, "random.levelup", 1.0F, 1.0F);
        this.dataWatcher.updateObject(18, this.getLevel() + 1);
        if(getLevel()>=evolvelvl){
            evolve(entityplayer);
        }else{
            this.dataWatcher.updateObject(19, 0);
            this.hplvl += 2.0D;
            this.dmglvl += 1;
            this.dataWatcher.updateObject(20, getMaxExp()+40);
            getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.hplvl);
            heal((float)this.hplvl);
        }
    }

    public void evolve(EntityPlayer player)
    {
        if(!this.worldObj.isRemote)
        {
            EntityBigBlokkit newBlokkit = determineNewEntity();

            newBlokkit.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rand.nextFloat() * 180.0F, 0.0F);
            newBlokkit.setTamed(true);
            newBlokkit.setPathToEntity((PathEntity) null);
            newBlokkit.heal(newBlokkit.getMaxHealth());
            newBlokkit.setOwner(player.getCommandSenderName());
            newBlokkit.playTameEffect(false);
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD + "Your Blokkit Evolved into a Big Blokkit!"));
            this.worldObj.spawnEntityInWorld(newBlokkit);
            this.setDead();
        }
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.27D);
    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        int i = isTamed() ? dmglvl : 2;
        return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), i);
    }

    public void onKillEntity(EntityLivingBase entity) {
        EntityPlayer player = (EntityPlayer)this.getOwner();
            int xp = 10;
            if (entity instanceof EntityMob)
                xp = 20;
            if (entity instanceof EntityAnimal)
                xp = 5;
            this.dataWatcher.updateObject(19, this.getExp()+xp);
            if (this.getExp() >= this.getMaxExp())
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
                    setPathToEntity((PathEntity) null);
                    this.aiSit.setSitting(false);
                    setOwner(par1EntityPlayer.getCommandSenderName());
                    playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)7);
                }
                return true;
            }
            else
            {
                if(this.getHealth()<this.getMaxHealth() && itemStack!=null && itemStack.getItem().equals(this.food))
                {
                    if (!par1EntityPlayer.capabilities.isCreativeMode)
                    {
                        itemStack.stackSize -= 1;
                    }

                    heal(10.0F);
                    levelUp();
                    generateRandomParticles("magicCrit");

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
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.hplvl = compound.getFloat("hp");
        this.dataWatcher.updateObject(18, compound.getInteger("lvl"));
        this.dataWatcher.updateObject(19, compound.getInteger("exp"));
        this.dataWatcher.updateObject(20, compound.getInteger("maxExp"));
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setDouble("hp",hplvl);
        compound.setInteger("lvl", this.dataWatcher.getWatchableObjectInt(18));
        compound.setInteger("exp", this.dataWatcher.getWatchableObjectInt(19));
        compound.setInteger("maxExp", this.dataWatcher.getWatchableObjectInt(20));
    }

    public int getLevel()
    {
        return this.dataWatcher.getWatchableObjectInt(18);
    }

    public int getExp()
    {
        return this.dataWatcher.getWatchableObjectInt(19);
    }

    public int getMaxExp()
    {
        return this.dataWatcher.getWatchableObjectInt(20);
    }

    public void setFood(String item)
    {
        this.food = (Item)Item.itemRegistry.getObject(item);
    }

    public EntityBigBlokkit determineNewEntity()
    {
        if(this.type=="diamond")
        {
            return new EntityBigDiamondBlokkit(this.worldObj, this.getMaxExp(), this.hplvl, this.dmglvl);
        }


        else {
            return null;
        }
    }

    @Override
    protected String getHurtSound() {
        return "step.stone";
    }

    @Override
    protected String getDeathSound() {
        return "dig.stone";
    }

    @Override
    public EntityAgeable createChild(EntityAgeable var1)
    {
        return null;
    }
}