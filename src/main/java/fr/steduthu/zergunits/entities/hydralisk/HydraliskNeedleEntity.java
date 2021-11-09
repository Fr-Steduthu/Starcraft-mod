package fr.steduthu.zergunits.entities.hydralisk;

import fr.steduthu.zergunits.entities.CustomProjectileEntity;
import fr.steduthu.zergunits.init.EntityTypesInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

/*@OnlyIn(value = Dist.CLIENT/*, _interface = IRendersAsItem.class)*/
public class HydraliskNeedleEntity extends CustomProjectileEntity {

    public HydraliskNeedleEntity(World level, LivingEntity owner) {
        super(EntityTypesInit.HYDRALISK_NEEDLE.get(), owner, level);
        this.setUp(null, 5.0f);
    }

    public HydraliskNeedleEntity(EntityType<HydraliskNeedleEntity> type, World world) {
        super(EntityTypesInit.HYDRALISK_NEEDLE.get(), world);
        this.setUp(null, 5.0f);
    }
}