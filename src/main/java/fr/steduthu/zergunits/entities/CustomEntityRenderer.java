package fr.steduthu.zergunits.entities;

import fr.steduthu.zergunits.ZergUnits;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public abstract class CustomEntityRenderer<entity extends CustomProjectileEntity>  extends EntityRenderer<entity> {

    private /*final*/ ResourceLocation TEXTURE;

    protected CustomEntityRenderer(EntityRendererManager manager, String texturePath) {
        super(manager);
        this.TEXTURE = new ResourceLocation(ZergUnits.MODID,texturePath);
    }

    @Override
    @ParametersAreNonnullByDefault
    @Nonnull
    public ResourceLocation getTextureLocation(entity e) {
        return TEXTURE;
    }
}
