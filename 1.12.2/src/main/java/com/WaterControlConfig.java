package com;

import java.util.HashSet;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Ignore;

@Config(
        modid = "finite_water"
)
public class WaterControlConfig {
    @Comment({"Biomes in which these fluids should be infinite"})
    public static String[] infiniteBiomes = new String[]{"minecraft:ocean", "minecraft:deep_ocean", "minecraft:frozen_ocean", "minecraft:beach", "minecraft:stone_beach", "minecraft:cold_beach", "minecraft:beaches", "minecraft:river", "minecraft:frozen_river", "minecraft:mushroom_island_shore"};
    @Ignore
    public static HashSet<String> infiniteBiomeSet = null;
}