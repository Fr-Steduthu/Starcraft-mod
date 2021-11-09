package fr.steduthu.zergunits.entities.hydralisk;

import fr.steduthu.zergunits.entities.CustomEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;

public class HydraliskNeedleEntityRenderer extends CustomEntityRenderer<HydraliskNeedleEntity> {

    public HydraliskNeedleEntityRenderer(EntityRendererManager manager) {
        super(manager, "textures/entity/hydralisk_needle.png");
    }
}