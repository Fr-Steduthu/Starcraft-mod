package fr.steduthu.zergunits.entities.hydralisk;

import fr.steduthu.zergunits.init.EntityTypesInit;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

public class HydraliskEntity extends /*MobEntity,*/ CreatureEntity implements IRangedAttackMob {

    public HydraliskEntity(EntityType<? extends CreatureEntity> e, World w) {
        super(e, w);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes() {
        return MobEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 0.5f)
                .add(Attributes.ATTACK_SPEED, 0.5f)
                .add(Attributes.MOVEMENT_SPEED, 0.5f)
                .add(Attributes.ATTACK_DAMAGE, 5.0f)
                .add(Attributes.JUMP_STRENGTH, 1.6f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.goalSelector.addGoal(3, new RangedAttackGoal(this, 3.0f, 1, 1, 1.0f));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 0.6f, true));
    }

    /*@Override
    @ParametersAreNonnullByDefault
    public void performRangedAttack(LivingEntity livingEntity, float v) {
        HydraliskNeedle projectile = new EntityTypesInit.HYDRALISK_NEEDLE(this.level, this);
        double lvt_3_1_ = livingEntity.getX() - this.getX();
        double lvt_5_1_ = livingEntity.getY(0.3333333333333333D) - projectile.getY();
        double lvt_7_1_ = livingEntity.getZ() - this.getZ();
        float lvt_9_1_ = MathHelper.sqrt(lvt_3_1_ * lvt_3_1_ + lvt_7_1_ * lvt_7_1_) * 0.2F;
        projectile.shoot(lvt_3_1_, lvt_5_1_ + (double)lvt_9_1_, lvt_7_1_, 1.5F, 10.0F);
        if (!this.isSilent()) {
            this.level.playSound((PlayerEntity)null, this.getX(), this.getY(), this.getZ(), SoundEvents.LLAMA_SPIT, this.getSoundSource(), 1.0F, 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
        }

        this.level.addFreshEntity(projectile);
        //this.didSpit = true;
    }*/
    @Override
    public void performRangedAttack(LivingEntity target, float distanceFactor) {
        ThrowableEntity projectile = new HydraliskNeedle(EntityTypesInit.HYDRALISK_NEEDLE.get(), this.level, this);
        double tx = target.getX() - this.getX();
        double ty = target.getY() + target.getEyeHeight() - 1.100000023841858D - projectile.getY();
        double tz = target.getZ() - this.getZ();
        float heightOffset = MathHelper.sqrt(tx * tx + tz * tz) * 0.2F;
        projectile.shoot(tx, ty + heightOffset, tz, 0.6F, 6.0F);
        this.level.addFreshEntity(projectile);
    }
}
