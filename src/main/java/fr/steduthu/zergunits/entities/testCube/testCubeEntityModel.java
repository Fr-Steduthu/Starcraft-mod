package fr.steduthu.zergunits.entities.testCube;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import javax.annotation.ParametersAreNonnullByDefault;

public class testCubeEntityModel<T extends testCubeEntity> extends EntityModel<T> {

    private final ModelRenderer bb_main;

    public testCubeEntityModel() {
        texHeight = 16;
        texWidth = 16;

        bb_main = new ModelRenderer(this);
        bb_main.setPos(0.0F, 0.0F, 0.0F);
        bb_main.texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
    }

    @Override
    @ParametersAreNonnullByDefault
    public void setupAnim(testCubeEntity testCubeEntity, float v, float v1, float v2, float v3, float v4) {

    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    //@Override
    //@ParametersAreNonnullByDefault
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    @ParametersAreNonnullByDefault
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {
        render(matrixStack, iVertexBuilder, i, i1, v, v1, v2, v3);
    }
}