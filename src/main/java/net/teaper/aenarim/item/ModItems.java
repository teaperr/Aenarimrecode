package net.teaper.aenarim.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.aenarim.Aenarim;

public class ModItems {

    private static final Item FIBRE = registerItem("fibre",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    private static final Item DRIED_FIBRE = registerItem("dried_fibre",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aenarim.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Aenarim.LOGGER.debug("Registering Mod Items for " + Aenarim.MOD_ID);

    }
}
