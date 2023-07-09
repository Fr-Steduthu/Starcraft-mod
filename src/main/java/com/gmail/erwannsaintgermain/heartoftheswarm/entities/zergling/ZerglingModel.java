package com.gmail.erwannsaintgermain.heartoftheswarm.entities.zergling;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ZerglingModel extends EntityModel<ZerglingEntity> {
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer tail;
    private final ModelRenderer segmentTwo;
    private final ModelRenderer attackLimbs;
    private final ModelRenderer midRight;
    private final ModelRenderer foreArm2;
    private final ModelRenderer midLeft;
    private final ModelRenderer foreArm;
    private final ModelRenderer backLegs;
    private final ModelRenderer backRight;
    private final ModelRenderer backRight_forearm;

    public ZerglingModel()
    {
        texHeight = 32;
        texWidth = 32;

        body = new ModelRenderer(this);
        body.setPos(0.0F, 24.0F, 0.0F);
        body.texOffs(0, 0).addBox(-3.0F, -7.0F, -5.0F, 6.0F, 4.0F, 11.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, -6.0F, -5.0F);
        body.addChild(head);
        setRotationAngle(head, 0.6981F, 0.0F, 0.0F);
        head.texOffs(0, 0).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, -5.5F, 6.0F);
        body.addChild(tail);
        setRotationAngle(tail, -0.48F, 0.0F, 0.0F);
        tail.texOffs(0, 0).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 6.0F, 0.0F, false);

        segmentTwo = new ModelRenderer(this);
        segmentTwo.setPos(0.0F, 2.0F, 5.0F);
        tail.addChild(segmentTwo);
        setRotationAngle(segmentTwo, 0.2618F, 0.0F, 0.0F);
        segmentTwo.texOffs(0, 0).addBox(-1.0F, -2.4039F, -0.37F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        attackLimbs = new ModelRenderer(this);
        attackLimbs.setPos(0.0F, 0.0F, 0.0F);
        body.addChild(attackLimbs);


        midRight = new ModelRenderer(this);
        midRight.setPos(2.5F, -7.0F, -3.5F);
        attackLimbs.addChild(midRight);
        setRotationAngle(midRight, -0.4363F, 0.0F, 0.2618F);
        midRight.texOffs(0, 0).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

        foreArm2 = new ModelRenderer(this);
        foreArm2.setPos(0.0F, -4.0F, -0.5F);
        midRight.addChild(foreArm2);
        setRotationAngle(foreArm2, 0.2182F, 0.0F, 0.0F);
        foreArm2.texOffs(0, 0).addBox(-0.5F, -1.0F, -7.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        foreArm2.texOffs(0, 0).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        foreArm2.texOffs(0, 0).addBox(-0.5F, -0.75F, -5.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        midLeft = new ModelRenderer(this);
        midLeft.setPos(-2.5F, -7.0F, -3.5F);
        attackLimbs.addChild(midLeft);
        setRotationAngle(midLeft, -0.4363F, 0.0F, -0.2618F);
        midLeft.texOffs(0, 0).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

        foreArm = new ModelRenderer(this);
        foreArm.setPos(0.0F, -4.0F, -0.5F);
        midLeft.addChild(foreArm);
        setRotationAngle(foreArm, 0.2182F, 0.0F, 0.0F);
        foreArm.texOffs(0, 0).addBox(-0.5F, -1.0F, -7.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        foreArm.texOffs(0, 0).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        foreArm.texOffs(0, 0).addBox(-0.5F, -0.75F, -5.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        backLegs = new ModelRenderer(this);
        backLegs.setPos(0.0F, 0.0F, 0.0F);
        body.addChild(backLegs);


        backRight = new ModelRenderer(this);
        backRight.setPos(2.25F, -5.25F, 4.5F);
        backLegs.addChild(backRight);
        backRight.texOffs(0, 0).addBox(-0.25F, -1.75F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, false);

        backRight_forearm = new ModelRenderer(this);
        backRight_forearm.setPos(-2.25F, 5.25F, -4.5F);
        backRight.addChild(backRight_forearm);

    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void setupAnim(
        ZerglingEntity p_225597_1_,
        float p_225597_2_,
        float p_225597_3_,
        float p_225597_4_,
        float p_225597_5_,
        float p_225597_6_
    )
    {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setupAnim'");
    }

    @Override
    public void renderToBuffer(
        MatrixStack matrixStack,
        IVertexBuilder buffer,
        int packedLight,
        int packedOverlay,
        float red, float green, float blue, float alpha
     )
    {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'renderToBuffer'");
        body.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
