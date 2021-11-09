package fr.steduthu.zergunits.entities.hydralisk;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import jdk.nashorn.internal.ir.annotations.Ignore;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import javax.annotation.ParametersAreNonnullByDefault;

public class HydraliskEntityModel<T extends HydraliskEntity> extends EntityModel<T> {

    private final ModelRenderer Torso;
    private final ModelRenderer Head;
    private final ModelRenderer head_ornament_r1;
    private final ModelRenderer head_wide_r1;
    private final ModelRenderer jaw_left;
    private final ModelRenderer Jaw_left_r1;
    private final ModelRenderer jaw_right;
    private final ModelRenderer Jaw_right_r1;
    private final ModelRenderer Arm_right;
    private final ModelRenderer arm;
    private final ModelRenderer Tail;
    private final ModelRenderer Section_1;
    private final ModelRenderer Arm_left;
    private final ModelRenderer arm2;

    public HydraliskEntityModel() {
        texHeight = 64;
        texWidth = 64;

        Torso = new ModelRenderer(this);
        Torso.setPos(0.0F, 24.0F, -4.0F);
        setRotationAngle(Torso, -0.2182F, 0.0F, 0.0F);
        Torso.texOffs(34, 0).addBox(-3.5F, -11.2705F, -0.7796F, 7.0F, 6.0F, 3.0F, 0.0F, false);
        Torso.texOffs(21, 35).addBox(-2.5F, -10.2705F, 0.2204F, 5.0F, 10.0F, 3.0F, 0.0F, false);
        Torso.texOffs(0, 0).addBox(-1.5F, -4.2705F, 3.2204F, 3.0F, 4.0F, 1.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setPos(0.0F, -11.0F, 1.25F);
        Torso.addChild(Head);
        setRotationAngle(Head, 0.5672F, 0.0F, 0.0F);
        Head.texOffs(0, 24).addBox(-1.5F, -3.8505F, -4.918F, 3.0F, 3.0F, 9.0F, 0.0F, false);
        Head.texOffs(17, 12).addBox(-1.5F, -1.6005F, 1.082F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        Head.texOffs(39, 25).addBox(-2.5F, -1.8505F, -0.918F, 5.0F, 4.0F, 2.0F, 0.0F, false);

        head_ornament_r1 = new ModelRenderer(this);
        head_ornament_r1.setPos(3.0F, 1.1495F, -1.918F);
        Head.addChild(head_ornament_r1);
        setRotationAngle(head_ornament_r1, 0.0F, 0.0F, 0.7854F);
        head_ornament_r1.texOffs(37, 35).addBox(-6.1036F, -1.6464F, -1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

        head_wide_r1 = new ModelRenderer(this);
        head_wide_r1.setPos(3.0F, 1.1495F, -1.918F);
        Head.addChild(head_wide_r1);
        setRotationAngle(head_wide_r1, -0.0524F, 0.0F, 0.0F);
        head_wide_r1.texOffs(0, 0).addBox(-6.5F, -4.5F, 0.0F, 7.0F, 2.0F, 9.0F, 0.0F, false);

        jaw_left = new ModelRenderer(this);
        jaw_left.setPos(0.0F, -0.8505F, -3.918F);
        Head.addChild(jaw_left);


        Jaw_left_r1 = new ModelRenderer(this);
        Jaw_left_r1.setPos(0.0F, 0.0F, 0.0F);
        jaw_left.addChild(Jaw_left_r1);
        setRotationAngle(Jaw_left_r1, 0.0F, 0.1222F, 0.0F);
        Jaw_left_r1.texOffs(0, 11).addBox(1.5037F, -1.0F, -3.0609F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        jaw_right = new ModelRenderer(this);
        jaw_right.setPos(3.0F, 1.1495F, -1.918F);
        Head.addChild(jaw_right);


        Jaw_right_r1 = new ModelRenderer(this);
        Jaw_right_r1.setPos(-3.0F, -2.0F, -2.0F);
        jaw_right.addChild(Jaw_right_r1);
        setRotationAngle(Jaw_right_r1, 0.0F, -0.1222F, 0.0F);
        Jaw_right_r1.texOffs(0, 16).addBox(-2.4963F, -1.0F, -2.9391F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        Arm_right = new ModelRenderer(this);
        Arm_right.setPos(-3.0F, -9.0F, 0.0F);
        Torso.addChild(Arm_right);
        setRotationAngle(Arm_right, 0.0F, 0.0F, -1.1781F);
        Arm_right.texOffs(0, 44).addBox(-4.7504F, -1.9832F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        Arm_right.texOffs(37, 42).addBox(-2.0433F, -2.6903F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        arm = new ModelRenderer(this);
        arm.setPos(-4.8519F, -0.7284F, 1.0F);
        Arm_right.addChild(arm);
        setRotationAngle(arm, -0.3927F, -1.9635F, 0.0F);
        arm.texOffs(41, 16).addBox(-4.9268F, -1.2873F, -1.3063F, 5.0F, 2.0F, 2.0F, 0.0F, false);
        arm.texOffs(0, 36).addBox(-4.6768F, -0.7873F, -0.3063F, 1.0F, 1.0F, 7.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setPos(0.0F, 0.0F, 0.0F);
        Torso.addChild(Tail);
        setRotationAngle(Tail, 0.2182F, 0.3927F, 0.0F);
        Tail.texOffs(0, 11).addBox(-1.5216F, -2.0F, 3.1548F, 3.0F, 2.0F, 11.0F, 0.0F, false);
        Tail.texOffs(30, 12).addBox(-0.5216F, -3.0F, 4.1548F, 1.0F, 1.0F, 9.0F, 0.0F, false);

        Section_1 = new ModelRenderer(this);
        Section_1.setPos(0.0F, 0.0F, 13.0F);
        Tail.addChild(Section_1);
        setRotationAngle(Section_1, 0.0F, -0.7854F, 0.0F);
        Section_1.texOffs(16, 12).addBox(-0.5381F, -1.0F, -2.5587F, 1.0F, 1.0F, 12.0F, 0.0F, false);
        Section_1.texOffs(21, 0).addBox(-0.5381F, -2.0F, -2.5587F, 1.0F, 1.0F, 11.0F, 0.0F, false);
        Section_1.texOffs(24, 25).addBox(-1.5381F, -1.0F, -1.5587F, 3.0F, 1.0F, 9.0F, 0.0F, false);

        Arm_left = new ModelRenderer(this);
        Arm_left.setPos(3.0F, -9.0F, 0.0F);
        Torso.addChild(Arm_left);
        setRotationAngle(Arm_left, 0.0F, 0.0F, 1.1781F);
        Arm_left.texOffs(0, 44).addBox(1.7504F, -1.9832F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
        Arm_left.texOffs(37, 42).addBox(-0.9567F, -2.6903F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, true);

        arm2 = new ModelRenderer(this);
        arm2.setPos(4.8519F, -0.7284F, 1.0F);
        Arm_left.addChild(arm2);
        setRotationAngle(arm2, -0.3927F, 1.9635F, 0.0F);
        arm2.texOffs(41, 16).addBox(-0.0732F, -1.2873F, -1.3063F, 5.0F, 2.0F, 2.0F, 0.0F, true);
        arm2.texOffs(0, 36).addBox(3.6768F, -0.7873F, -0.3063F, 1.0F, 1.0F, 7.0F, 0.0F, true);
    }

    @Override
    @ParametersAreNonnullByDefault
    public void setupAnim(HydraliskEntity hydraliskEntity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    @ParametersAreNonnullByDefault
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Torso.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
