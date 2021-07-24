package fr.steduthu.zergunits.entities.hydralisk;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRendersAsItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.ParametersAreNonnullByDefault;

@OnlyIn(value = Dist.CLIENT, _interface = IRendersAsItem.class)
public class HydraliskNeedle extends ProjectileEntity {

    public HydraliskNeedle(EntityType<? extends ProjectileEntity> type, World world, LivingEntity thrower) {
        super(type, thrower, world);
    }

    /*public HydraliskNeedle(EntityType<? extends HydraliskNeedle> type, World world) {
        super(type, world);
    }*/

    /*public HydraliskNeedle(EntityType<? extends ThrowableEntity> entityType, World world) {
        this(entityType, world, null);
    }*/


    @Override
    protected void defineSynchedData() {

    }

    @Override
    public void tick() {
        super.tick();
        makeTrail();
    }

    @Override
    protected float getGravity() {
        return 0.003F;
    }

    private void makeTrail() {
        for (int i = 0; i < 5; i++) {
            double dx = getX() + 0.5 * (random.nextDouble() - random.nextDouble());
            double dy = getY() + 0.5 * (random.nextDouble() - random.nextDouble());
            double dz = getZ() + 0.5 * (random.nextDouble() - random.nextDouble());
            level.addParticle(ParticleTypes.CRIT, dx, dy, dz, 0.0D, 0.0D, 0.0D);
        }
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void handleEntityEvent(byte id) {
        if (id == 3) {
            IParticleData particle = new ItemParticleData(ParticleTypes.ITEM, new ItemStack(Items.PAPER));
            for (int i = 0; i < 8; ++i) {
                this.level.addParticle(particle, false, this.getX(), this.getY(), this.getZ(), random.nextGaussian() * 0.05D, random.nextDouble() * 0.2D, random.nextGaussian() * 0.05D);
            }
        } else {
            super.handleEntityEvent(id);
        }
    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return null;
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void onHit(RayTraceResult result) {
        if (!this.level.isClientSide) {
            this.level.broadcastEntityEvent(this, (byte) 3);
            this.remove();
        }
    }
}

