package com.gmail.erwannsaintgermain.heartoftheswarm.entities.zergling;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ZerglingEntity extends MonsterEntity
{

    public ZerglingEntity(EntityType<? extends MonsterEntity> e, World w)
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
    protected void registerGoals() {
        super.registerGoals();

        // Target selection
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));

        // Goals
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 2d, false));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
    }
}
