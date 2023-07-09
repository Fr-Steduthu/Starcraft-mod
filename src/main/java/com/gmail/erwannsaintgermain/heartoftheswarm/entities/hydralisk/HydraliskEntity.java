package com.gmail.erwannsaintgermain.heartoftheswarm.entities.hydralisk;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class HydraliskEntity extends MonsterEntity implements IRangedAttackMob
{

    public HydraliskEntity(EntityType<? extends MonsterEntity> e, World w)
    {
        super(e, w);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes()
    {
        return MonsterEntity.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 5.0f)

                .add(Attributes.ATTACK_DAMAGE, 5.0f)
                .add(Attributes.ATTACK_SPEED, 1f)

                .add(Attributes.MOVEMENT_SPEED, 0.45f)
                .add(Attributes.JUMP_STRENGTH, 1.6f)
        ;
    }

    @Override
    protected void registerGoals()
    {
        super.registerGoals();

        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));

        this.goalSelector.addGoal(4, new RangedAttackGoal(this, 4, 6, 10));
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 0.6d, true));

        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
    }

    @Override
    public void performRangedAttack(LivingEntity target, float distanceFactor)
    {
        ArrowEntity projectile = new ArrowEntity(this.level, this);

        double d0 = target.getEyeY() - 1.100000023841858D;
        double d1 = target.getX() - this.getX();
        double d2 = d0 - projectile.getY();
        double d3 = target.getZ() - this.getZ();

        float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;

        projectile.shoot(d1, d2 + (double)f, d3, 1.6F, 12.0F);
        this.playSound(SoundEvents.SNOW_GOLEM_SHOOT, 1.0F, 0.4F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
        this.level.addFreshEntity(projectile);
        
    }
}


