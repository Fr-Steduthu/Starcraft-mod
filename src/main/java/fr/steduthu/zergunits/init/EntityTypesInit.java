package fr.steduthu.zergunits.init;

import fr.steduthu.zergunits.ZergUnits;
import fr.steduthu.zergunits.entities.hydralisk.HydraliskEntity;
import fr.steduthu.zergunits.entities.testCube.testCubeEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {

    public static  final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ZergUnits.MODID);

    public static final RegistryObject<EntityType<HydraliskEntity>> HYDRALISK =
           ENTITY_TYPES.register("hydralisk",() -> EntityType.Builder.of(HydraliskEntity::new, EntityClassification.MONSTER)
                    .sized(2.0f,2.0f)
                    .build(new ResourceLocation(ZergUnits.MODID, "hydralisk").toString())
            );

    public static final RegistryObject<EntityType<testCubeEntity>> CUBE =
           ENTITY_TYPES.register("cube",() -> EntityType.Builder.of(testCubeEntity::new, EntityClassification.MONSTER)
                    .sized(1.0f,1.0f)
                    .build(new ResourceLocation(ZergUnits.MODID, "cube").toString())
            );
}
