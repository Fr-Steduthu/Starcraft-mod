package com.gmail.erwannsaintgermain.heartoftheswarm.entities.hydralisk;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import static com.gmail.erwannsaintgermain.heartoftheswarm.HeartOfTheSwarm.MODID;

public class HydraliskRenderer extends MobRenderer<HydraliskEntity, HydraliskModel>
{

    public HydraliskRenderer(EntityRendererManager manager) {
        super(manager, new HydraliskModel(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(HydraliskEntity p_110775_1_)
    {
        return new ResourceLocation(MODID, "textures/entity/hydralisk.png");
    }
}