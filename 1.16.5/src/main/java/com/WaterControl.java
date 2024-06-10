package com;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.ModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("finite_water")
public class WaterControl {
    private static final Logger LOGGER = LogManager.getLogger();

    public WaterControl() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, WaterControlConfig.SPEC);
    }
}



