package com;

import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BlockEvent.CreateFluidSourceEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

@EventBusSubscriber
public class EventHandler {
    @SubscribeEvent
    public static void handleSourcePlacement(CreateFluidSourceEvent event) {
        IBlockState state = event.getState();
        World world = event.getWorld();
        Biome biome = world.getBiomeForCoordsBody(event.getPos());
        String biomeName = biome.getRegistryName().toString();
        if (!WaterControlConfig.infiniteBiomeSet.contains(biomeName)) {
            event.setResult(Result.DENY);
        }
    }
}
