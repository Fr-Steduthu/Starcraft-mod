package fr.steduthu.zergunits;

import fr.steduthu.zergunits.entities.hydralisk.HydraliskEntity;
import fr.steduthu.zergunits.entities.hydralisk.HydraliskEntityRenderer;
import fr.steduthu.zergunits.entities.testCube.testCubeEntity;
import fr.steduthu.zergunits.entities.testCube.testCubeEntityModelRenderer;
import fr.steduthu.zergunits.init.EntityTypesInit;
import fr.steduthu.zergunits.init.ModItems;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(ZERGUNITS.MODID)

public class ZERGUNITS{
	
	public static final String MODID = "zergunits";

	public ZERGUNITS() {

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientsetup);

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.ITEMS.register(bus);
		EntityTypesInit.ENTITY_TYPES.register(bus);
	}

	@SuppressWarnings("deprecation")
	private void setup(FMLCommonSetupEvent e){
		MinecraftForge.EVENT_BUS.register(this);
		DeferredWorkQueue.runLater(()->{
			//GlobalEntityTypeAttributes.put(EntityTypesInit.HYDRALISK.get(), HydraliskEntity.setAttributes().build());
			GlobalEntityTypeAttributes.put(EntityTypesInit.CUBE.get(), testCubeEntity.setAttributes().build());
		});
	}

	private void clientsetup(FMLClientSetupEvent e){
		//RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.HYDRALISK.get(), HydraliskEntityRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CUBE.get(), testCubeEntityModelRenderer::new);
	}
}