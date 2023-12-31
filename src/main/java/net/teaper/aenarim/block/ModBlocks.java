package net.teaper.aenarim.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.teaper.aenarim.Aenarim;

public class ModBlocks {
    //sicilite
    public static final Block SICILITE_BLOCK = registerBlock("sicilite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block SICILITE_ORE = registerBlock("sicilite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(1, 4)), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_SICILITE_ORE = registerBlock("deepslate_sicilite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(2, 5)), ItemGroup.BUILDING_BLOCKS);
    //ferro sicilite
    public static final Block FERRO_SICILITE_BLOCK = registerBlock("ferro_sicilite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Aenarim.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Aenarim.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Aenarim.LOGGER.debug("Registering ModBlocks for " + Aenarim.MOD_ID);
    }
}