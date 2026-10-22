package com.example.smartvillager;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("smartvillager")
public class SmartVillagerMod {
    public SmartVillagerMod(IEventBus eventBus) {
        eventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Initialization code
    }
}