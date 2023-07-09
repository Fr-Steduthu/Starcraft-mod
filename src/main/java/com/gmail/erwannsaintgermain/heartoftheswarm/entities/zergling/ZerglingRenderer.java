package com.gmail.erwannsaintgermain.heartoftheswarm.entities.zergling;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import static com.gmail.erwannsaintgermain.heartoftheswarm.HeartOfTheSwarm.MODID;

public class ZerglingRenderer extends MobRenderer<ZerglingEntity, ZerglingModel> {

    public ZerglingRenderer(EntityRendererManager manager)
    {
        super(manager, new ZerglingModel(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(ZerglingEntity p_110775_1_)
    {
        return new ResourceLocation(MODID, "textures/entity/hydralisk.png");
    }
}
