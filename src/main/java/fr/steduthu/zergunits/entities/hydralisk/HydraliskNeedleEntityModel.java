package fr.steduthu.zergunits.entities.hydralisk;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import javax.annotation.ParametersAreNonnullByDefault;

public class HydraliskNeedleEntityModel<T extends HydraliskNeedleEntity> extends EntityModel<T> {
    private final ModelRenderer bb_main;

    public HydraliskNeedleEntityModel() {
        texHeight = 16;
        texWidth = 16;

        bb_main = new ModelRenderer(this);
        bb_main.setPos(0.0F, 24.0F, 0.0F);
        bb_main.setTexSize(0, 0).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);
        bb_main.setTexSize(0, 7).addBox(-0.5F, -1.5F, -8.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
    }

    @Override
    @ParametersAreNonnullByDefault
    public void setupAnim(HydraliskNeedleEntity hydraliskEntity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    @ParametersAreNonnullByDefault
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
