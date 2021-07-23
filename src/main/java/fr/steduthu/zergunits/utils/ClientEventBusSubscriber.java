package fr.steduthu.zergunits.utils;

import fr.steduthu.zergunits.ZergUnits;
import fr.steduthu.zergunits.entities.hydralisk.HydraliskEntityRenderer;
import fr.steduthu.zergunits.entities.testCube.testCubeEntityModelRenderer;
import fr.steduthu.zergunits.init.EntityTypesInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ZergUnits.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.HYDRALISK.get(), HydraliskEntityRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CUBE.get(), testCubeEntityModelRenderer::new);
    }
}
