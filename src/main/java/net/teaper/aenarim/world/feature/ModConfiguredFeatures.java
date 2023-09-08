package net.teaper.aenarim.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.teaper.aenarim.Aenarim;
import net.teaper.aenarim.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_SICILITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SICILITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SICILITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SICILITE_ORE =
            ConfiguredFeatures.register("sicilite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SICILITE_ORES, 8));

    public static void registerConfiguredFeatures() {
        Aenarim.LOGGER.debug("Registering the ModConfiguredFeatures for " + Aenarim.MOD_ID);
    }
}
