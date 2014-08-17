package com.ryanv97.blokkit.client.model;

import com.ryanv97.blokkit.entity.EntityBlokkit;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBigBlokkit extends ModelBase
{
    ModelRenderer body;
    ModelRenderer leftLeg;
    ModelRenderer leftArm;
    ModelRenderer rightLeg;
    ModelRenderer rightArm;
    ModelRenderer eye1;
    ModelRenderer eye2;
    ModelRenderer eye3;
    ModelRenderer eye4;

    public ModelBigBlokkit()
    {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new ModelRenderer(this, 0, 0);
        this.body.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.body.setRotationPoint(-8.0F, 2.0F, -8.0F);
        this.body.setTextureSize(64, 64);
        this.body.mirror = true;
        setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.leftLeg = new ModelRenderer(this, 20, 47);
        this.leftLeg.addBox(-2.5F, 0.0F, -2.5F, 5, 6, 5);
        this.leftLeg.setRotationPoint(4.0F, 18.0F, 0.0F);
        this.leftLeg.setTextureSize(64, 64);
        this.leftLeg.mirror = true;
        setRotation(this.leftLeg, 0.0F, 0.0F, 0.0F);
        this.leftArm = new ModelRenderer(this, 20, 32);
        this.leftArm.addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5);
        this.leftArm.setRotationPoint(8.0F, 8.0F, 0.0F);
        this.leftArm.setTextureSize(64, 64);
        this.leftArm.mirror = true;
        setRotation(this.leftArm, 0.0F, 0.0F, -0.4363323F);
        this.rightLeg = new ModelRenderer(this, 0, 47);
        this.rightLeg.addBox(-2.5F, 0.0F, -2.5F, 5, 6, 5);
        this.rightLeg.setRotationPoint(-4.0F, 18.0F, 0.0F);
        this.rightLeg.setTextureSize(64, 64);
        this.rightLeg.mirror = true;
        setRotation(this.rightLeg, 0.0F, 0.0F, 0.0F);
        this.rightArm = new ModelRenderer(this, 0, 32);
        this.rightArm.addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5);
        this.rightArm.setRotationPoint(-8.0F, 8.0F, 0.0F);
        this.rightArm.setTextureSize(64, 64);
        this.rightArm.mirror = true;
        setRotation(this.rightArm, 0.0F, 0.0F, 0.4363323F);
        this.eye1 = new ModelRenderer(this, 0, 0);
        this.eye1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.eye1.setRotationPoint(2.8F, 11.0F, -8.3F);
        this.eye1.setTextureSize(64, 64);
        this.eye1.mirror = true;
        setRotation(this.eye1, 0.0F, 0.0F, 0.0F);
        this.eye2 = new ModelRenderer(this, 0, 0);
        this.eye2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.eye2.setRotationPoint(-3.8F, 11.0F, -8.3F);
        this.eye2.setTextureSize(64, 64);
        this.eye2.mirror = true;
        setRotation(this.eye2, 0.0F, 0.0F, 0.0F);
        this.eye3 = new ModelRenderer(this, 0, 0);
        this.eye3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.eye3.setRotationPoint(-4.0F, 11.0F, -8.3F);
        this.eye3.setTextureSize(64, 64);
        this.eye3.mirror = true;
        setRotation(this.eye3, 0.0F, 0.0F, 0.0F);
        this.eye4 = new ModelRenderer(this, 0, 0);
        this.eye4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.eye4.setRotationPoint(3.0F, 11.0F, -8.3F);
        this.eye4.setTextureSize(64, 64);
        this.eye4.mirror = true;
        setRotation(this.eye4, 0.0F, 0.0F, 0.0F);
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

            this.rightArm.rotateAngleX += -((float) Math.PI / 5F);
            this.leftArm.rotateAngleX += -((float) Math.PI / 5F);
            this.rightLeg.rotateAngleX = -((float) Math.PI * 2F / 5F);
            this.leftLeg.rotateAngleX = -((float) Math.PI * 2F / 5F);
            this.rightLeg.rotateAngleY = ((float) Math.PI / 10F);
            this.leftLeg.rotateAngleY = -((float) Math.PI / 10F);
        }
    }
}
