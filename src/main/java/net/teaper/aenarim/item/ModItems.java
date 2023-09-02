package net.teaper.aenarim.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.aenarim.Aenarim;
import net.teaper.aenarim.item.custom.ModHoeItem;

public class ModItems {

    //material type items start
    public static final Item FIBRE = registerItem("fibre",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item DRIED_FIBRE = registerItem("dried_fibre",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //tool items start
    public static final Item FLINT_KNIFE = registerItem("flint_knife",
            new SwordItem(ModToolMaterial.FLINT, 1, 1.8f, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item FLINT_HATCHET = registerItem("flint_hatchet",
            new AxeItem(ModToolMaterial.FLINT, 2, 1f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
            new PickaxeItem(ModToolMaterial.FLINT, 1, 1f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            new ShovelItem(ModToolMaterial.FLINT, 0.5F, 1.5f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            new ModHoeItem(ModToolMaterial.FLINT, 0, 2f, new FabricItemSettings().group(ItemGroup.TOOLS)));

    //adv items start

    //adv items end
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aenarim.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Aenarim.LOGGER.debug("Registering Mod Items for " + Aenarim.MOD_ID);

    }
}
