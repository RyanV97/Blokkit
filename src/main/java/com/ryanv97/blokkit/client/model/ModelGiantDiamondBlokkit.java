package com.ryanv97.blokkit.client.model;

import com.ryanv97.blokkit.entity.basic.EntityBlokkit;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGiantDiamondBlokkit extends ModelBase
{
    ModelRenderer leftLeg;
    ModelRenderer leftArm;
    ModelRenderer rightLeg;
    ModelRenderer rightArm;
    ModelRenderer eye1;
    ModelRenderer eye2;
    ModelRenderer eye3;
    ModelRenderer eye4;
    ModelRenderer body;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;

    public ModelGiantDiamondBlokkit()
    {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.leftLeg = new ModelRenderer(this, 28, 61);
        this.leftLeg.addBox(-3.5F, 0.0F, -3.5F, 7, 7, 7);
        this.leftLeg.setRotationPoint(5.0F, 17.0F, 0.0F);
        this.leftLeg.setTextureSize(128, 128);
        this.leftLeg.mirror = true;
        setRotation(this.leftLeg, 0.0F, 0.0F, 0.0F);
        this.leftArm = new ModelRenderer(this, 28, 40);
        this.leftArm.addBox(-3.5F, 0.0F, -3.5F, 7, 14, 7);
        this.leftArm.setRotationPoint(10.0F, 4.0F, 0.0F);
        this.leftArm.setTextureSize(128, 128);
        this.leftArm.mirror = true;
        setRotation(this.leftArm, 0.0F, 0.0F, -0.4363323F);
        this.rightLeg = new ModelRenderer(this, 0, 61);
        this.rightLeg.addBox(-3.5F, 0.0F, -3.5F, 7, 7, 7);
        this.rightLeg.setRotationPoint(-5.0F, 17.0F, 0.0F);
        this.rightLeg.setTextureSize(128, 128);
        this.rightLeg.mirror = true;
        setRotation(this.rightLeg, 0.0F, 0.0F, 0.0F);
        this.rightArm = new ModelRenderer(this, 0, 40);
        this.rightArm.addBox(-3.5F, 0.0F, -3.5F, 7, 14, 7);
        this.rightArm.setRotationPoint(-10.0F, 4.0F, 0.0F);
        this.rightArm.setTextureSize(128, 128);
        this.rightArm.mirror = true;
        setRotation(this.rightArm, 0.0F, 0.0F, 0.4363323F);
        this.eye1 = new ModelRenderer(this, 0, 0);
        this.eye1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.eye1.setRotationPoint(4.4F, 8.0F, -10.3F);
        this.eye1.setTextureSize(128, 128);
        this.eye1.mirror = true;
        setRotation(this.eye1, 0.0F, 0.0F, 0.0F);
        this.eye2 = new ModelRenderer(this, 0, 0);
        this.eye2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.eye2.setRotationPoint(3.8F, 8.0F, -10.3F);
        this.eye2.setTextureSize(128, 128);
        this.eye2.mirror = true;
        setRotation(this.eye2, 0.0F, 0.0F, 0.0F);
        this.eye3 = new ModelRenderer(this, 0, 0);
        this.eye3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.eye3.setRotationPoint(-4.8F, 8.0F, -10.3F);
        this.eye3.setTextureSize(128, 128);
        this.eye3.mirror = true;
        setRotation(this.eye3, 0.0F, 0.0F, 0.0F);
        this.eye4 = new ModelRenderer(this, 0, 0);
        this.eye4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.eye4.setRotationPoint(-5.5F, 8.0F, -10.3F);
        this.eye4.setTextureSize(128, 128);
        this.eye4.mirror = true;
        setRotation(this.eye4, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 88, 85);
        this.body.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
        this.body.setRotationPoint(7.0F, 5.0F, -11.0F);
        this.body.setTextureSize(128, 128);
        this.body.mirror = true;
        setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 0);
        this.body1.addBox(0.0F, 0.0F, 0.0F, 20, 20, 20);
        this.body1.setRotationPoint(-10.0F, -3.0F, -10.0F);
        this.body1.setTextureSize(128, 128);
        this.body1.mirror = true;
        setRotation(this.body1, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 80, 95);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 1, 11, 22);
        this.body2.setRotationPoint(10.0F, -4.0F, -11.0F);
        this.body2.setTextureSize(128, 128);
        this.body2.mirror = true;
        setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 0, 110);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 20, 1, 1);
        this.body3.setRotationPoint(-10.0F, 9.0F, 10.0F);
        this.body3.setTextureSize(128, 128);
        this.body3.mirror = true;
        setRotation(this.body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 96, 85);
        this.body4.addBox(0.0F, 0.0F, 0.0F, 6, 4, 1);
        this.body4.setRotationPoint(-3.0F, 5.0F, -11.0F);
        this.body4.setTextureSize(128, 128);
        this.body4.mirror = true;
        setRotation(this.body4, 0.0F, 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 80, 85);
        this.body5.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
        this.body5.setRotationPoint(-10.0F, 5.0F, -11.0F);
        this.body5.setTextureSize(128, 128);
        this.body5.mirror = true;
        setRotation(this.body5, 0.0F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 0, 75);
        this.body6.addBox(0.0F, 0.0F, 0.0F, 20, 1, 20);
        this.body6.setRotationPoint(-10.0F, -4.0F, -10.0F);
        this.body6.setTextureSize(128, 128);
        this.body6.mirror = true;
        setRotation(this.body6, 0.0F, 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 0, 112);
        this.body7.addBox(0.0F, 0.0F, 0.0F, 1, 2, 6);
        this.body7.setRotationPoint(10.0F, 7.0F, 5.0F);
        this.body7.setTextureSize(128, 128);
        this.body7.mirror = true;
        setRotation(this.body7, 0.0F, 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 80, 75);
        this.body8.addBox(0.0F, 0.0F, 0.0F, 20, 9, 1);
        this.body8.setRotationPoint(-10.0F, -4.0F, -11.0F);
        this.body8.setTextureSize(128, 128);
        this.body8.mirror = true;
        setRotation(this.body8, 0.0F, 0.0F, 0.0F);
        this.body9 = new ModelRenderer(this, 80, 95);
        this.body9.addBox(0.0F, 0.0F, 0.0F, 1, 11, 22);
        this.body9.setRotationPoint(-11.0F, -4.0F, -11.0F);
        this.body9.setTextureSize(128, 128);
        this.body9.mirror = true;
        setRotation(this.body9, 0.0F, 0.0F, 0.0F);
        this.body10 = new ModelRenderer(this, 14, 112);
        this.body10.addBox(0.0F, 0.0F, 0.0F, 1, 2, 6);
        this.body10.setRotationPoint(-11.0F, 7.0F, 5.0F);
        this.body10.setTextureSize(128, 128);
        this.body10.mirror = true;
        setRotation(this.body10, 0.0F, 0.0F, 0.0F);
        this.body11 = new ModelRenderer(this, 0, 96);
        this.body11.addBox(0.0F, 0.0F, 0.0F, 20, 13, 1);
        this.body11.setRotationPoint(-10.0F, -4.0F, 10.0F);
        this.body11.setTextureSize(128, 128);
        this.body11.mirror = true;
        setRotation(this.body11, 0.0F, 0.0F, 0.0F);
    }

    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        this.body.render(par7);
        this.rightLeg.render(par7);
        this.leftLeg.render(par7);
        this.rightArm.render(par7);
        this.leftArm.render(par7);
        this.eye1.render(par7);
        this.eye2.render(par7);
        this.eye3.render(par7);
        this.eye4.render(par7);
        this.body1.render(par7);
        this.body2.render(par7);
        this.body3.render(par7);
        this.body4.render(par7);
        this.body5.render(par7);
        this.body6.render(par7);
        this.body7.render(par7);
        this.body8.render(par7);
        this.body9.render(par7);
        this.body10.render(par7);
        this.body11.render(par7);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        EntityBlokkit entityBlokkit = (EntityBlokkit)entity;

        this.body.offsetY=0F;
        this.rightArm.offsetY=0F;
        this.rightLeg.offsetY=0F;
        this.leftArm.offsetY=0F;
        this.leftLeg.offsetY=0F;
        this.eye1.offsetY=0F;
        this.eye2.offsetY=0F;
        this.eye3.offsetY=0F;
        this.eye4.offsetY=0F;

        this.rightLeg.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1 * 0.5F);
        this.leftArm.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1 * 0.5F);
        this.leftLeg.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1 * 0.5F);
        this.rightLeg.rotateAngleY = 0.0F;
        this.leftArm.rotateAngleY = 0.0F;
        this.leftLeg.rotateAngleY = 0.0F;
        this.rightArm.rotateAngleY = 0.0F;
        this.rightArm.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1 * 0.5F);

        if(entityBlokkit.isSitting()||entityBlokkit.isSneaking())
        {
            float offset = 0.15F;
            this.body.offsetY=offset;
            this.rightArm.offsetY=offset;
            this.rightLeg.offsetY=offset;
            this.leftArm.offsetY=offset;
            this.leftLeg.offsetY=offset;
            this.eye1.offsetY=offset;
            this.eye2.offsetY=offset;
            this.eye3.offsetY=offset;
            this.eye4.offsetY=offset;

            this.rightArm.rotateAngleX += -((float)Math.PI / 5F);
            this.leftArm.rotateAngleX += -((float)Math.PI / 5F);
            this.rightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.leftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.rightLeg.rotateAngleY = ((float)Math.PI / 10F);
            this.leftLeg.rotateAngleY = -((float)Math.PI / 10F);
        }
    }
}
