package com.gmail.erwannsaintgermain.heartoftheswarm.init;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gmail.erwannsaintgermain.heartoftheswarm.HeartOfTheSwarm.MODID;

import java.util.function.Supplier;

import com.gmail.erwannsaintgermain.heartoftheswarm.ModItemGroups;
import com.gmail.erwannsaintgermain.heartoftheswarm.entities.hydralisk.HydraliskEntity;
import com.gmail.erwannsaintgermain.heartoftheswarm.entities.zergling.ZerglingEntity;

public class Registration
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static void init()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Registration.BLOCKS.register(modEventBus);
        Registration.ITEMS.register(modEventBus);
        Registration.ENTITIES.register(modEventBus);
    }

    /* --- Entities --- */

    public static final RegistryObject<EntityType<HydraliskEntity>> HYDRALISK = Registration.ENTITIES.register(
        "hydralisk",
        (Supplier<? extends EntityType<HydraliskEntity>>) () ->
            EntityType.Builder.of(HydraliskEntity::new, EntityClassification.MONSTER)
            .sized(0.5f, 0.5f)
            .setShouldReceiveVelocityUpdates(false)
            .build(new ResourceLocation(MODID, "hydralisk").toString())
    );

    public static final RegistryObject<EntityType<ZerglingEntity>> ZERGLING = Registration.ENTITIES.register(
        "zergling",
        (Supplier<? extends EntityType<ZerglingEntity>>) () ->
            EntityType.Builder.of(ZerglingEntity::new, EntityClassification.MONSTER)
            .sized(0.5f, 0.5f)
            .setShouldReceiveVelocityUpdates(false)
            .build(new ResourceLocation(MODID, "zergling").toString())
    );

    /* --- Items --- */

    public static final RegistryObject<Item> ZERG_FLESH = Registration.ITEMS.register(
        "zerg_flesh",
        ()-> new Item(new Item.Properties().tab(ModItemGroups.zergunits_tab).stacksTo(16))
    );

    
}
