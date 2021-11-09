package fr.steduthu.zergunits.init;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import fr.steduthu.zergunits.ZergUnits;
import fr.steduthu.zergunits.entities.hydralisk.HydraliskEntity;
import fr.steduthu.zergunits.entities.hydralisk.HydraliskNeedleEntity;

import fr.steduthu.zergunits.entities.zergling.ZerglingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ZergUnits.MODID);

    public static final RegistryObject<EntityType<HydraliskNeedleEntity>> HYDRALISK_NEEDLE =
            ENTITY_TYPES.register("hydralisk_needle", () ->
                    EntityType.Builder.<HydraliskNeedleEntity>of(HydraliskNeedleEntity::new, EntityClassification.MISC)
                    .sized(1F, 1F)
                    .setShouldReceiveVelocityUpdates(false)
                    .build("hydralisk_needle_projectile"));

    public static final RegistryObject<EntityType<HydraliskEntity>> HYDRALISK =
           ENTITY_TYPES.register("hydralisk",() ->
                   EntityType.Builder.of(HydraliskEntity::new, EntityClassification.MONSTER)
                   .sized(1.0f,1.0f)
                   .build(new ResourceLocation(ZergUnits.MODID, "hydralisk").toString())
            );
    public static final RegistryObject<EntityType<ZerglingEntity>> ZERGLING =
            ENTITY_TYPES.register("zergling",() ->
                    EntityType.Builder.of(ZerglingEntity::new, EntityClassification.MONSTER)
                    .sized(1f,1f)
                    .build(new ResourceLocation(ZergUnits.MODID, "zergling").toString())
            );

    /*
    public static final RegistryObject<EntityType<testCubeEntity>> CUBE =
           ENTITY_TYPES.register("cube",() ->
                   EntityType.Builder.of(testCubeEntity::new, EntityClassification.MONSTER)
                    .sized(1.0f,1.0f)
                    .build(new ResourceLocation(ZergUnits.MODID, "cube").toString())
            );
    */

}
