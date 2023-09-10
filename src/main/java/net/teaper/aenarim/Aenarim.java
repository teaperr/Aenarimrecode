package net.teaper.aenarim;

import net.fabricmc.api.ModInitializer;
import net.teaper.aenarim.block.ModBlocks;
import net.teaper.aenarim.item.ModItems;
import net.teaper.aenarim.world.feature.ModConfiguredFeatures;
import net.teaper.aenarim.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aenarim implements ModInitializer {
	public static final String MOD_ID = "aenarim";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		ModOreGeneration.generateOres();
	}
}
