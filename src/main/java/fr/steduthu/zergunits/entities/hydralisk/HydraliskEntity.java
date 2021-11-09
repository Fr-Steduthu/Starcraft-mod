package fr.steduthu.zergunits.entities.hydralisk;

import fr.steduthu.zergunits.entities.CustomMobEntity;
import fr.steduthu.zergunits.entities.IRanged;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;

public class HydraliskEntity extends /*MobEntity,*/ CustomMobEntity implements IRanged {

    public HydraliskEntity(EntityType<? extends CreatureEntity> e, World w) {
        super(e, w);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes() {
        return MobEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 30.0f)
                .add(Attributes.ATTACK_SPEED, 0.5f)
                .add(Attributes.MOVEMENT_SPEED, 0.5f)
                .add(Attributes.ATTACK_DAMAGE, 5.0f)
                .add(Attributes.JUMP_STRENGTH, 1.6f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
/*
        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.goalSelector.addGoal(3, new RangedAttackGoal(this, 3.0f, 1, 1, 1.0f));*/
        //this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 0.6f, true));

        this.goalSelector.addGoal(4, new RangedAttackGoal(this, 4, 6, 10));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    public ThrowableEntity getProjectile() {
        return new HydraliskNeedleEntity(this.level, this);
    }
/*
    @Override
    public void performRangedAttack(LivingEntity target, float distanceFactor) {
        /*HydraliskNeedleEntity projectile = new HydraliskNeedleEntity(this.level, this);

        double d0 = target.getEyeY() - 1.100000023841858D;
        double d1 = target.getX() - this.getX();
        double d2 = d0 - projectile.getY();
        double d3 = target.getZ() - this.getZ();

        float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;

        projectile.shoot(d1, d2 + (double)f, d3, 1.6F, 12.0F);
        this.playSound(SoundEvents.SNOW_GOLEM_SHOOT, 1.0F, 0.4F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
        this.level.addFreshEntity(projectile);
    }*/
}


