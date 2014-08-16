package com.ryanv97.blokkit.client.model;

import com.ryanv97.blokkit.entity.basic.EntityBlokkit;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGiantBlokkit extends ModelBase
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
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;

    public ModelGiantBlokkit()
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
        this.body = new ModelRenderer(this, 0, 0);
        this.body.addBox(0.0F, 0.0F, 0.0F, 20, 20, 20);
        this.body.setRotationPoint(-10.0F, -3.0F, -10.0F);
        this.body.setTextureSize(128, 128);
        this.body.mirror = true;
        setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 60, 12);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Shape1.setRotationPoint(3.0F, -6.0F, 1.0F);
        this.Shape1.setTextureSize(128, 128);
        this.Shape1.mirror = true;
        setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 60, 14);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1);
        this.Shape2.setRotationPoint(0.0F, -10.0F, 1.0F);
        this.Shape2.setTextureSize(128, 128);
        this.Shape2.mirror = true;
        setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 68, 17);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
        this.Shape3.setRotationPoint(-1.0F, -11.0F, 1.0F);
        this.Shape3.setTextureSize(128, 128);
        this.Shape3.mirror = true;
        setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 60, 6);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
        this.Shape4.setRotationPoint(-1.0F, -6.0F, 1.0F);
        this.Shape4.setTextureSize(128, 128);
        this.Shape4.mirror = true;
        setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 60, 17);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Shape5.setRotationPoint(4.0F, -9.0F, 1.0F);
        this.Shape5.setTextureSize(128, 128);
        this.Shape5.mirror = true;
        setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 60, 0);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1);
        this.Shape6.setRotationPoint(1.0F, -8.0F, 1.0F);
        this.Shape6.setTextureSize(128, 128);
        this.Shape6.mirror = true;
        setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 60, 8);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Shape7.setRotationPoint(0.0F, -5.0F, 1.0F);
        this.Shape7.setTextureSize(128, 128);
        this.Shape7.mirror = true;
        setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 64, 17);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Shape8.setRotationPoint(-1.0F, -9.0F, 1.0F);
        this.Shape8.setTextureSize(128, 128);
        this.Shape8.mirror = true;
        setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
        this.Shape9 = new ModelRenderer(this, 60, 10);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
        this.Shape9.setRotationPoint(3.0F, -7.0F, 1.0F);
        this.Shape9.setTextureSize(128, 128);
        this.Shape9.mirror = true;
        setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
        this.Shape10 = new ModelRenderer(this, 74, 17);
        this.Shape10.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1);
        this.Shape10.setRotationPoint(2.0F, -11.0F, 1.0F);
        this.Shape10.setTextureSize(128, 128);
        this.Shape10.mirror = true;
        setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
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
        this.Shape1.render(par7);
        this.Shape2.render(par7);
        this.Shape3.render(par7);
        this.Shape4.render(par7);
        this.Shape5.render(par7);
        this.Shape6.render(par7);
        this.Shape7.render(par7);
        this.Shape8.render(par7);
        this.Shape9.render(par7);
        this.Shape10.render(par7);
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
        this.rightLeg.offsetY=0F;
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
        this.rightLeg.rotateAngleY = 0.0F;
        this.rightLeg.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1 * 0.5F);

        if(entityBlokkit.isSitting()||entityBlokkit.isSneaking())
        {
            float offset = 0.15F;
            this.body.offsetY=offset;
            this.rightLeg.offsetY=offset;
            this.rightLeg.offsetY=offset;
            this.leftArm.offsetY=offset;
            this.leftLeg.offsetY=offset;
            this.eye1.offsetY=offset;
            this.eye2.offsetY=offset;
            this.eye3.offsetY=offset;
            this.eye4.offsetY=offset;

            this.rightLeg.rotateAngleX += -((float)Math.PI / 5F);
            this.leftArm.rotateAngleX += -((float)Math.PI / 5F);
            this.rightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.leftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.rightLeg.rotateAngleY = ((float)Math.PI / 10F);
            this.leftLeg.rotateAngleY = -((float)Math.PI / 10F);
        }
    }
}
