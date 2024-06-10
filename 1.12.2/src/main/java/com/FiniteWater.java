package com;

import java.util.HashSet;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = "finite_water",
        name = "Finite Water",
        version = "1.0"
)
public class FiniteWater {
    @Instance
    public static FiniteWater instance;
    public static Logger logger;

    @net.minecraftforge.fml.common.Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        WaterControlConfig.infiniteBiomeSet = new HashSet();
        String[] var1 = WaterControlConfig.infiniteBiomes;
        int var2 = var1.length;
        int var3;
        String fluid;
        for(var3 = 0; var3 < var2; ++var3) {
            fluid = var1[var3];
            WaterControlConfig.infiniteBiomeSet.add(fluid);
        }
    }
}
    