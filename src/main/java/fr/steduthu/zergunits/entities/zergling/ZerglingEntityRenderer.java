package fr.steduthu.zergunits.entities.zergling;

import fr.steduthu.zergunits.entities.CustomMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;

public class ZerglingEntityRenderer extends CustomMobRenderer<ZerglingEntity, ZerglingEntityModel<ZerglingEntity>> {

    public ZerglingEntityRenderer(EntityRendererManager manager) {
        super(manager, new ZerglingEntityModel<>(), 0.7f, "textures/entity/hydralisk.png");
    }
}
