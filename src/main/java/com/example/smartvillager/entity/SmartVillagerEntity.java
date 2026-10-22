package com.example.smartvillager.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.Level;

public class SmartVillagerEntity extends Villager {
    public SmartVillagerEntity(EntityType<? extends Villager> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new Goal() {
            @Override
            public boolean canUse() {
                return true;
            }

            @Override
            public void tick() {
                // Custom behavior
            }
        });
    }
}