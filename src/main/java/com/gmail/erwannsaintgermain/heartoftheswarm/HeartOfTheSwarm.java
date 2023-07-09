package com.gmail.erwannsaintgermain.heartoftheswarm;

import com.gmail.erwannsaintgermain.heartoftheswarm.entities.hydralisk.*;
import com.gmail.erwannsaintgermain.heartoftheswarm.entities.zergling.*;
import com.gmail.erwannsaintgermain.heartoftheswarm.init.*;

import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(HeartOfTheSwarm.MODID)
public class HeartOfTheSwarm
{
	
	public static final String MODID = "heartoftheswarm";

	public HeartOfTheSwarm()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::setup);
		bus.addListener(this::clientSetup);

		Registration.init();

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SuppressWarnings("deprecation")
	private void setup(FMLCommonSetupEvent e)
	{
		DeferredWorkQueue.runLater(()->{
			GlobalEntityTypeAttributes.put(Registration.HYDRALISK.get(), HydraliskEntity.setAttributes().build());
			GlobalEntityTypeAttributes.put(Registration.ZERGLING.get(), ZerglingEntity.setAttributes().build());
		});
	}

	private void clientSetup(FMLClientSetupEvent event)
	{
		// RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.HYDRALISK_NEEDLE.get(), HydraliskNeedleEntityRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(Registration.HYDRALISK.get(), HydraliskRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(Registration.ZERGLING.get(), ZerglingRenderer::new);
	}
}