package fr.steduthu.zergunits;

import fr.steduthu.zergunits.entities.hydralisk.HydraliskEntity;
import fr.steduthu.zergunits.entities.hydralisk.HydraliskEntityRenderer;
import fr.steduthu.zergunits.entities.testCube.testCubeEntity;
import fr.steduthu.zergunits.entities.testCube.testCubeEntityModelRenderer;
import fr.steduthu.zergunits.init.EntityTypesInit;
import fr.steduthu.zergunits.init.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(ZergUnits.MODID)

public class ZergUnits{
	
	public static final String MODID = "zergunits";

	public ZergUnits() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::setup);

		ModItems.ITEMS.register(bus);
		EntityTypesInit.ENTITY_TYPES.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SuppressWarnings("deprecation")
	private void setup(FMLCommonSetupEvent e){
		DeferredWorkQueue.runLater(()->{
			GlobalEntityTypeAttributes.put(EntityTypesInit.HYDRALISK.get(), HydraliskEntity.setAttributes().build());
			GlobalEntityTypeAttributes.put(EntityTypesInit.CUBE.get(), testCubeEntity.setAttributes().build());
		});
	}
}