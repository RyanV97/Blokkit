package com.ryanv97.blokkit.client.model;


import com.ryanv97.blokkit.entity.EntityBlokkit;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBlokkit extends ModelBase
{
    //fields
    ModelRenderer body = new ModelRenderer(this, 0, 0);
    ;
    ModelRenderer leftLeg;
    ModelRenderer leftArm;
    ModelRenderer rightLeg;
    ModelRenderer rightArm;
    ModelRenderer eye1;
    ModelRenderer eye2;
    ModelRenderer eye3;
    ModelRenderer eye4;

    public ModelBlokkit()
    {
        textureWidth = 64;
        textureHeight = 32;

        body = new ModelRenderer(this, 0, 0);
        body.addBox(0F, 0F, 0F, 10, 10, 10);
        body.setRotationPoint(-5F, 9F, -5F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);

        leftLeg = new ModelRenderer(this, 36, 20);
        leftLeg.addBox(-1.5F, 0F, -1.5F, 3, 5, 3);
        leftLeg.setRotationPoint(2.5F, 19F, 0F);
        leftLeg.setTextureSize(64, 32);
        leftLeg.mirror = true;
        setRotation(leftLeg, 0F, 0F, 0F);

        leftArm = new ModelRenderer(this, 12, 20);
        leftArm.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
        leftArm.setRotationPoint(5F, 13F, 0F);
        leftArm.setTextureSize(64, 32);
        leftArm.mirror = true;
        setRotation(leftArm, 0F, 0F, -0.4363323F);

        rightLeg = new ModelRenderer(this, 24, 20);
        rightLeg.addBox(-1.5F, 0F, -1.5F, 3, 5, 3);
        rightLeg.setRotationPoint(-2.5F, 19F, 0F);
        rightLeg.setTextureSize(64, 32);
        rightLeg.mirror = true;
        setRotation(rightLeg, 0F, 0F, 0F);

        rightArm = new ModelRenderer(this, 0, 20);
        rightArm.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
        rightArm.setRotationPoint(-5F, 13F, 0F);
        rightArm.setTextureSize(64, 32);
        rightArm.mirror = true;
        setRotation(rightArm, 0F, 0F, 0.4363323F);

        eye1 = new ModelRenderer(this, 0, 0);
        eye1.addBox(0F, 0F, 0F, 1, 1, 1);
        eye1.setRotationPoint(1.5F, 14.5F, -5.3F);
        eye1.setTextureSize(64, 32);
        eye1.mirror = true;
        setRotation(eye1, 0F, 0F, 0F);

        eye2 = new ModelRenderer(this, 0, 0);
        eye2.addBox(0F, 0F, 0F, 1, 1, 1);
        eye2.setRotationPoint(1.5F, 14.7F, -5.3F);
        eye2.setTextureSize(64, 32);
        eye2.mirror = true;
        setRotation(eye2, 0F, 0F, 0F);

        eye3 = new ModelRenderer(this, 0, 0);
        eye3.addBox(0F, 0F, 0F, 1, 1, 1);
        eye3.setRotationPoint(-2.5F, 14.5F, -5.3F);
        eye3.setTextureSize(64, 32);
        eye3.mirror = true;
        setRotation(eye3, 0F, 0F, 0F);

        eye4 = new ModelRenderer(this, 0, 0);
        eye4.addBox(0F, 0F, 0F, 1, 1, 1);
        eye4.setRotationPoint(-2.5F, 14.7F, -5.3F);
        eye4.setTextureSize(64, 32);
        eye4.mirror = true;
        setRotation(eye4, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        body.render(f5);
        leftLeg.render(f5);
        leftArm.render(f5);
        rightLeg.render(f5);
        rightArm.render(f5);
        eye1.render(f5);
        eye2.render(f5);
        eye3.render(f5);
        eye4.render(f5);
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