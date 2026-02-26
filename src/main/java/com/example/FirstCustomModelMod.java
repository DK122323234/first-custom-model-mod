package com.example;

import com.example.block.RegisterBlock;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstCustomModelMod implements ModInitializer {
    public static final String MODID = "first_custom_model_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        RegisterBlock.register();
        LOGGER.info("Hello Fabric world!");
    }
}