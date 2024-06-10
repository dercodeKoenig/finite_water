package com;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = "finite_water")
public class WaterControlConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<List<? extends String>> infiniteBiomes;

    static {
        infiniteBiomes = BUILDER
                .comment("Biomes where water should be infinite")
                .defineList("infiniteBiomes", Arrays.asList("minecraft:ocean", "minecraft:deep_ocean", "minecraft:frozen_ocean", "minecraft:beach", "minecraft:stone_beach", "minecraft:cold_beach", "minecraft:beaches", "minecraft:river", "minecraft:frozen_river", "minecraft:mushroom_island_shore"), obj -> obj instanceof String);

        SPEC = BUILDER.build();
    }
}
