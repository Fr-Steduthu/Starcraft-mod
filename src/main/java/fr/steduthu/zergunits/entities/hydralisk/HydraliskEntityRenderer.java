package fr.steduthu.zergunits.entities.hydralisk;

import fr.steduthu.zergunits.entities.CustomMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;


public class HydraliskEntityRenderer extends CustomMobRenderer<HydraliskEntity, HydraliskEntityModel<HydraliskEntity>>{

    public HydraliskEntityRenderer(EntityRendererManager manager) {
        super(manager, new HydraliskEntityModel<>(), 0.7f, "textures/entity/hydralisk.png");
    }
}