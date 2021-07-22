package fr.steduthu.zergunits.entities.hydralisk;

import fr.steduthu.zergunits.ZERGUNITS;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class HydraliskEntityRenderer extends MobRenderer<HydraliskEntity, HydraliskEntityModel<HydraliskEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(ZERGUNITS.MODID, "textures/entity/hydralisk.png");

    public HydraliskEntityRenderer(EntityRendererManager manager) {
        super(manager, new HydraliskEntityModel<>(), 0.7f);
    }

    @Override
    @ParametersAreNonnullByDefault
    @Nonnull
    public ResourceLocation getTextureLocation(HydraliskEntity hydralisk) {
        return TEXTURE;
    }
}
