package fr.steduthu.zergunits.entities.testCube;

import fr.steduthu.zergunits.ZergUnits;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class testCubeEntityModelRenderer extends MobRenderer<testCubeEntity, testCubeEntityModel<testCubeEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(ZergUnits.MODID, "textures/entity/cube.png");

    public testCubeEntityModelRenderer(EntityRendererManager manager) {
        super(manager, new testCubeEntityModel<>(), 0.7f);
    }

    @Override
    @ParametersAreNonnullByDefault
    @Nonnull
    public ResourceLocation getTextureLocation(testCubeEntity p_110775_1_) {
        return TEXTURE;
    }
}