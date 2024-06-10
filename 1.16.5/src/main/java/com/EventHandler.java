package com;

import net.minecraft.block.BlockState;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "finite_water", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {

    @SubscribeEvent
    public static void handleSourcePlacement(BlockEvent.CreateFluidSourceEvent event) {
        BlockState state = event.getState();
        World world = (World) event.getWorld();
        Biome biome = world.getBiome(event.getPos());
        String biomeName = biome.getRegistryName().toString();
        boolean isinfinite = false;
        for (String i : WaterControlConfig.infiniteBiomes.get()) {
            if (biomeName.equals(i)) {
                isinfinite = true;
                break;
            }
        }
        if (!isinfinite) {
            event.setResult(Event.Result.DENY);
        }
    }
}
