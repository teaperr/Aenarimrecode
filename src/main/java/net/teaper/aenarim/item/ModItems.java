package net.teaper.aenarim.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.aenarim.Aenarim;
import net.teaper.aenarim.item.custom.ModBowItemSlow;
import net.teaper.aenarim.item.custom.ModHoeItem;
import net.teaper.aenarim.item.custom.ModSkullArmor;
import net.teaper.aenarim.item.custom.ModTooltip;

public class ModItems {

    //material type items start
    public static final Item FIBRE = registerItem("fibre",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item DRIED_FIBRE = registerItem("dried_fibre",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SHARP_BONE = registerItem("sharp_bone",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    //food items
    public static final Item SUGAR_BREAD = registerItem("sugar_bread",
            new ModTooltip(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SUGAR_BREAD)));


    //tool items start
        //flint tools
    public static final Item FLINT_KNIFE = registerItem("flint_knife",
            new SwordItem(ModToolMaterials.FLINT, 2, -2.4f, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item FLINT_HATCHET = registerItem("flint_hatchet",
            new AxeItem(ModToolMaterials.FLINT, 4, -3.2f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
            new PickaxeItem(ModToolMaterials.FLINT, 0, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            new ShovelItem(ModToolMaterials.FLINT, 1.5f, -2.4f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            new ModHoeItem(ModToolMaterials.FLINT, -1, -2f, new FabricItemSettings().group(ItemGroup.TOOLS)));
        //shields

        //bone tools
    public static final Item BONE_SWORD = registerItem("bone_sword",
            new SwordItem(ModToolMaterials.SHARP_BONE, (int) 4f, -2.2f, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item BONE_AXE = registerItem("bone_axe",
            new AxeItem(ModToolMaterials.SHARP_BONE, 6.5f, -3.6f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe",
            new PickaxeItem(ModToolMaterials.SHARP_BONE, (int) -3f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item BONE_SHOVEL = registerItem("bone_shovel",
            new ShovelItem(ModToolMaterials.SHARP_BONE, -2.5f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item BONE_HOE = registerItem("bone_hoe",
            new ModHoeItem(ModToolMaterials.SHARP_BONE, -2.5f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item BONE_HELMET = registerItem("bone_helmet",
            new ModSkullArmor(ModArmorMaterials.BONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item BONE_BOW = registerItem("bone_bow",
            new ModBowItemSlow(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(400)));
    //woven armour
    public static final Item WOVEN_BRIGANDINE_CHESTPLATE = registerItem("woven_brigandine_chestplate",
            new ArmorItem(ModArmorMaterials.WOVEN, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item WOVEN_BRIGANDINE_LEGGINGS = registerItem("woven_brigandine_leggings",
            new ArmorItem(ModArmorMaterials.WOVEN, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    //sicilite items
    public static final Item SICILITE_CRYSTAL = registerItem("sicilite_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SICILITE_INGOT = registerItem("sicilite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //adv items start

    //adv items end
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aenarim.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Aenarim.LOGGER.debug("Registering Mod Items for " + Aenarim.MOD_ID);

    }
}
