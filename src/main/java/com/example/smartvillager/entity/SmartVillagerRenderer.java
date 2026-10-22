package com.example.smartvillager.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VillagerRenderer;
import net.minecraft.resources.ResourceLocation;

public class SmartVillagerRenderer extends VillagerRenderer {
    public SmartVillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(SmartVillagerEntity entity) {
        return new ResourceLocation("smartvillager:textures/entity/smart_villager.png");
    }
}