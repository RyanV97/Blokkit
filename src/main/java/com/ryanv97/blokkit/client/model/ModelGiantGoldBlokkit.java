package com.ryanv97.blokkit.client.model;


import com.ryanv97.blokkit.entity.EntityBlokkit;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGiantGoldBlokkit extends ModelBase
{
    ModelRenderer leftLeg;
    ModelRenderer leftArm;
    ModelRenderer rightLeg;
    ModelRenderer rightArm;
    ModelRenderer eye1;
    ModelRenderer eye2;
    ModelRenderer eye3;
    ModelRenderer eye4;
    ModelRenderer body2;
    ModelRenderer body;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer body12;
    ModelRenderer body13;
    ModelRenderer body14;
    ModelRenderer body15;
    ModelRenderer body16;
    ModelRenderer body17;
    ModelRenderer body18;
    ModelRenderer body19;
    ModelRenderer body20;
    ModelRenderer body21;
    ModelRenderer body22;
    ModelRenderer body23;
    ModelRenderer body24;
    ModelRenderer body25;

    public ModelGiantGoldBlokkit()
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
        this.eye1.setRotationPoint(4.2F, 8.0F, -10.3F);
        this.eye1.setTextureSize(128, 128);
        this.eye1.mirror = true;
        setRotation(this.eye1, 0.0F, 0.0F, 0.0F);
        this.eye2 = new ModelRenderer(this, 0, 0);
        this.eye2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.eye2.setRotationPoint(3.5F, 8.0F, -10.3F);
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
        this.body2 = new ModelRenderer(this, 84, 0);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9);
        this.body2.setRotationPoint(6.0F, -7.0F, -2.0F);
        this.body2.setTextureSize(128, 128);
        this.body2.mirror = true;
        setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.addBox(0.0F, 0.0F, 0.0F, 20, 20, 20);
        this.body.setRotationPoint(-10.0F, -3.0F, -10.0F);
        this.body.setTextureSize(128, 128);
        this.body.mirror = true;
        setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 60, 0);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 11, 4, 1);
        this.body3.setRotationPoint(-4.0F, -7.0F, 7.0F);
        this.body3.setTextureSize(128, 128);
        this.body3.mirror = true;
        setRotation(this.body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 64, 5);
        this.body4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1);
        this.body4.setRotationPoint(0.0F, -8.0F, 7.0F);
        this.body4.setTextureSize(128, 128);
        this.body4.mirror = true;
        setRotation(this.body4, 0.0F, 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 84, 0);
        this.body5.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9);
        this.body5.setRotationPoint(-4.0F, -7.0F, -2.0F);
        this.body5.setTextureSize(128, 128);
        this.body5.mirror = true;
        setRotation(this.body5, 0.0F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 60, 0);
        this.body6.addBox(0.0F, 0.0F, 0.0F, 11, 4, 1);
        this.body6.setRotationPoint(-4.0F, -7.0F, -3.0F);
        this.body6.setTextureSize(128, 128);
        this.body6.mirror = true;
        setRotation(this.body6, 0.0F, 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 72, 5);
        this.body7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
        this.body7.setRotationPoint(6.0F, -8.0F, 1.0F);
        this.body7.setTextureSize(128, 128);
        this.body7.mirror = true;
        setRotation(this.body7, 0.0F, 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 60, 5);
        this.body8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body8.setRotationPoint(-4.0F, -9.0F, 2.0F);
        this.body8.setTextureSize(128, 128);
        this.body8.mirror = true;
        setRotation(this.body8, 0.0F, 0.0F, 0.0F);
        this.body9 = new ModelRenderer(this, 60, 10);
        this.body9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
        this.body9.setRotationPoint(-4.0F, -8.0F, 6.0F);
        this.body9.setTextureSize(128, 128);
        this.body9.mirror = true;
        setRotation(this.body9, 0.0F, 0.0F, 0.0F);
        this.body10 = new ModelRenderer(this, 64, 5);
        this.body10.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1);
        this.body10.setRotationPoint(0.0F, -8.0F, -3.0F);
        this.body10.setTextureSize(128, 128);
        this.body10.mirror = true;
        setRotation(this.body10, 0.0F, 0.0F, 0.0F);
        this.body11 = new ModelRenderer(this, 60, 5);
        this.body11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body11.setRotationPoint(-3.0F, -8.0F, 7.0F);
        this.body11.setTextureSize(128, 128);
        this.body11.mirror = true;
        setRotation(this.body11, 0.0F, 0.0F, 0.0F);
        this.body12 = new ModelRenderer(this, 60, 5);
        this.body12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body12.setRotationPoint(1.0F, -9.0F, 7.0F);
        this.body12.setTextureSize(128, 128);
        this.body12.mirror = true;
        setRotation(this.body12, 0.0F, 0.0F, 0.0F);
        this.body13 = new ModelRenderer(this, 60, 5);
        this.body13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body13.setRotationPoint(6.0F, -9.0F, 2.0F);
        this.body13.setTextureSize(128, 128);
        this.body13.mirror = true;
        setRotation(this.body13, 0.0F, 0.0F, 0.0F);
        this.body14 = new ModelRenderer(this, 72, 5);
        this.body14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
        this.body14.setRotationPoint(-4.0F, -8.0F, 1.0F);
        this.body14.setTextureSize(128, 128);
        this.body14.mirror = true;
        setRotation(this.body14, 0.0F, 0.0F, 0.0F);
        this.body15 = new ModelRenderer(this, 60, 5);
        this.body15.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body15.setRotationPoint(1.0F, -9.0F, -3.0F);
        this.body15.setTextureSize(128, 128);
        this.body15.mirror = true;
        setRotation(this.body15, 0.0F, 0.0F, 0.0F);
        this.body16 = new ModelRenderer(this, 60, 5);
        this.body16.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body16.setRotationPoint(-4.0F, -9.0F, 7.0F);
        this.body16.setTextureSize(128, 128);
        this.body16.mirror = true;
        setRotation(this.body16, 0.0F, 0.0F, 0.0F);
        this.body17 = new ModelRenderer(this, 60, 5);
        this.body17.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body17.setRotationPoint(-3.0F, -8.0F, -3.0F);
        this.body17.setTextureSize(128, 128);
        this.body17.mirror = true;
        setRotation(this.body17, 0.0F, 0.0F, 0.0F);
        this.body18 = new ModelRenderer(this, 60, 7);
        this.body18.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
        this.body18.setRotationPoint(-4.0F, -8.0F, -3.0F);
        this.body18.setTextureSize(128, 128);
        this.body18.mirror = true;
        setRotation(this.body18, 0.0F, 0.0F, 0.0F);
        this.body19 = new ModelRenderer(this, 60, 5);
        this.body19.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body19.setRotationPoint(-4.0F, -9.0F, -3.0F);
        this.body19.setTextureSize(128, 128);
        this.body19.mirror = true;
        setRotation(this.body19, 0.0F, 0.0F, 0.0F);
        this.body20 = new ModelRenderer(this, 60, 7);
        this.body20.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
        this.body20.setRotationPoint(6.0F, -8.0F, -3.0F);
        this.body20.setTextureSize(128, 128);
        this.body20.mirror = true;
        setRotation(this.body20, 0.0F, 0.0F, 0.0F);
        this.body21 = new ModelRenderer(this, 60, 5);
        this.body21.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body21.setRotationPoint(6.0F, -9.0F, -3.0F);
        this.body21.setTextureSize(128, 128);
        this.body21.mirror = true;
        setRotation(this.body21, 0.0F, 0.0F, 0.0F);
        this.body22 = new ModelRenderer(this, 60, 5);
        this.body22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body22.setRotationPoint(5.0F, -8.0F, -3.0F);
        this.body22.setTextureSize(128, 128);
        this.body22.mirror = true;
        setRotation(this.body22, 0.0F, 0.0F, 0.0F);
        this.body23 = new ModelRenderer(this, 60, 5);
        this.body23.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body23.setRotationPoint(5.0F, -8.0F, 7.0F);
        this.body23.setTextureSize(128, 128);
        this.body23.mirror = true;
        setRotation(this.body23, 0.0F, 0.0F, 0.0F);
        this.body24 = new ModelRenderer(this, 60, 10);
        this.body24.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
        this.body24.setRotationPoint(6.0F, -8.0F, 6.0F);
        this.body24.setTextureSize(128, 128);
        this.body24.mirror = true;
        setRotation(this.body24, 0.0F, 0.0F, 0.0F);
        this.body25 = new ModelRenderer(this, 60, 5);
        this.body25.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.body25.setRotationPoint(6.0F, -9.0F, 7.0F);
        this.body25.setTextureSize(128, 128);
        this.body25.mirror = true;
        setRotation(this.body25, 0.0F, 0.0F, 0.0F);
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
        this.body12.render(par7);
        this.body13.render(par7);
        this.body14.render(par7);
        this.body15.render(par7);
        this.body16.render(par7);
        this.body17.render(par7);
        this.body18.render(par7);
        this.body19.render(par7);
        this.body20.render(par7);
        this.body21.render(par7);
        this.body22.render(par7);
        this.body23.render(par7);
        this.body24.render(par7);
        this.body25.render(par7);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        EntityBlokkit entityBlokkit = (EntityBlokkit) entity;

        this.body.offsetY = 0F;
        this.rightArm.offsetY = 0F;
        this.rightLeg.offsetY = 0F;
        this.leftArm.offsetY = 0F;
        this.leftLeg.offsetY = 0F;
        this.eye1.offsetY = 0F;
        this.eye2.offsetY = 0F;
        this.eye3.offsetY = 0F;
        this.eye4.offsetY = 0F;
        this.body2.offsetY = 0F;
        this.body3.offsetY = 0F;
        this.body4.offsetY = 0F;
        this.body5.offsetY = 0F;
        this.body6.offsetY = 0F;
        this.body7.offsetY = 0F;
        this.body8.offsetY = 0F;
        this.body9.offsetY = 0F;
        this.body10.offsetY = 0F;
        this.body11.offsetY = 0F;
        this.body12.offsetY = 0F;
        this.body13.offsetY = 0F;
        this.body14.offsetY = 0F;
        this.body15.offsetY = 0F;
        this.body16.offsetY = 0F;
        this.body17.offsetY = 0F;
        this.body18.offsetY = 0F;
        this.body19.offsetY = 0F;
        this.body20.offsetY = 0F;
        this.body21.offsetY = 0F;
        this.body22.offsetY = 0F;
        this.body23.offsetY = 0F;
        this.body24.offsetY = 0F;
        this.body25.offsetY = 0F;

        this.rightLeg.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1 * 0.5F);
        this.leftArm.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1 * 0.5F);
        this.leftLeg.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1 * 0.5F);
        this.rightLeg.rotateAngleY = 0.0F;
        this.leftArm.rotateAngleY = 0.0F;
        this.leftLeg.rotateAngleY = 0.0F;
        this.rightArm.rotateAngleY = 0.0F;
        this.rightArm.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1 * 0.5F);

        if (entityBlokkit.isSitting() || entityBlokkit.isSneaking())
        {
            float offset = 0.15F;
            this.body.offsetY = offset;
            this.rightArm.offsetY = offset;
            this.rightLeg.offsetY = offset;
            this.leftArm.offsetY = offset;
            this.leftLeg.offsetY = offset;
            this.eye1.offsetY = offset;
            this.eye2.offsetY = offset;
            this.eye3.offsetY = offset;
            this.eye4.offsetY = offset;
            this.body2.offsetY = offset;
            this.body3.offsetY = offset;
            this.body4.offsetY = offset;
            this.body5.offsetY = offset;
            this.body6.offsetY = offset;
            this.body7.offsetY = offset;
            this.body8.offsetY = offset;
            this.body9.offsetY = offset;
            this.body10.offsetY = offset;
            this.body11.offsetY = offset;
            this.body12.offsetY = offset;
            this.body13.offsetY = offset;
            this.body14.offsetY = offset;
            this.body15.offsetY = offset;
            this.body16.offsetY = offset;
            this.body17.offsetY = offset;
            this.body18.offsetY = offset;
            this.body19.offsetY = offset;
            this.body20.offsetY = offset;
            this.body21.offsetY = offset;
            this.body22.offsetY = offset;
            this.body23.offsetY = offset;
            this.body24.offsetY = offset;
            this.body25.offsetY = offset;

            this.rightArm.rotateAngleX += -((float) Math.PI / 5F);
            this.leftArm.rotateAngleX += -((float) Math.PI / 5F);
            this.rightLeg.rotateAngleX = -((float) Math.PI * 2F / 5F);
            this.leftLeg.rotateAngleX = -((float) Math.PI * 2F / 5F);
            this.rightLeg.rotateAngleY = ((float) Math.PI / 10F);
            this.leftLeg.rotateAngleY = -((float) Math.PI / 10F);
        }
    }
}
