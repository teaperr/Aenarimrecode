package net.teaper.aenarim.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.aenarim.Aenarim;
import net.teaper.aenarim.item.custom.*;
import net.teaper.aenarim.item.custom.tooltips.Sicilite_DaggerTooltip;
import net.teaper.aenarim.item.custom.tooltips.Sugar_BreadTooltip;

public class ModItems {

    public static final Item CRYSTAL_BEAM = registerItem("crystal_beam",
            (Item)new ArrowItem(new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item TEST_SWORDBOW = registerItem("test_swordbow",
            new ModSwordBowItem(ModToolMaterials.SICILITE, 10, 2, new FabricItemSettings().group(ItemGroup.COMBAT)));
    // :3
    public static final Item SNAIL_CAT = registerItem("snail_cat",
            new SnailCat(new FabricItemSettings().maxDamage(9999)));

    //material type items start
    public static final Item FIBRE = registerItem("fibre",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item DRIED_FIBRE = registerItem("dried_fibre",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SHARP_BONE = registerItem("sharp_bone",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    //food items
    public static final Item SUGAR_BREAD = registerItem("sugar_bread",
            new Sugar_BreadTooltip(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SUGAR_BREAD)));


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
    public static final Item FLINT_BOW = registerItem("flint_bow",
            new ModBowItemFast(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(125)));
        //shields

        //bone tools
    public static final Item BONE_SWORD = registerItem("bone_sword",
            new SwordItem(ModToolMaterials.SHARP_BONE, (int) 2f, -2.2f, new FabricItemSettings().group(ItemGroup.COMBAT)));
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
    public static final Item SICILITE_SWORD = registerItem("sicilite_sword",
            new SwordItem(ModToolMaterials.SICILITE, (int) 3f, -2.2f, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item SICILITE_DAGGER = registerItem("sicilite_dagger",
            new Sicilite_DaggerTooltip(ModToolMaterials.SICILITE, (int) 1.5f, 1f, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item SICILITE_AXE = registerItem("sicilite_axe",
            new AxeItem(ModToolMaterials.SICILITE, 5f, -3.2f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item SICILITE_PICKAXE = registerItem("sicilite_pickaxe",
            new PickaxeItem(ModToolMaterials.SICILITE, (int) -1f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item SICILITE_SHOVEL = registerItem("sicilite_shovel",
            new ShovelItem(ModToolMaterials.SICILITE, -3f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item SICILITE_HOE = registerItem("sicilite_hoe",
            new ModHoeItem(ModToolMaterials.SICILITE, -3f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item SICILITE_NUGGET = registerItem("sicilite_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item SICILITE_HELMET = registerItem("sicilite_helmet",
            new ModArmorItem(ModArmorMaterials.SICILITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item SICILITE_CHESTPLATE = registerItem("sicilite_chestplate",
            new ArmorItem(ModArmorMaterials.SICILITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item SICILITE_LEGGINGS = registerItem("sicilite_leggings",
            new ArmorItem(ModArmorMaterials.SICILITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item SICILITE_BOOTS = registerItem("sicilite_boots",
            new ArmorItem(ModArmorMaterials.SICILITE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));

    //ferro-sicilite items
    public static final Item FERRO_SICILITE_INGOT = registerItem("ferro_sicilite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item FERRO_SICILITE_SWORD = registerItem("ferro_sicilite_sword",
            new SwordItem(ModToolMaterials.FERRO_SICILITE, (int) 2f, -2.4f, new FabricItemSettings().group(ItemGroup.COMBAT)));
       public static final Item FERRO_SICILITE_AXE = registerItem("ferro_sicilite_axe",
            new AxeItem(ModToolMaterials.FERRO_SICILITE, 5f, -3.2f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FERRO_SICILITE_PICKAXE = registerItem("ferro_sicilite_pickaxe",
            new PickaxeItem(ModToolMaterials.FERRO_SICILITE, (int) -1f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FERRO_SICILITE_SHOVEL = registerItem("ferro_sicilite_shovel",
            new ShovelItem(ModToolMaterials.FERRO_SICILITE, -3f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FERRO_SICILITE_HOE = registerItem("ferro_sicilite_hoe",
            new ModHoeItem(ModToolMaterials.FERRO_SICILITE, -3f, -3f, new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FERRO_SICILITE_NUGGET = registerItem("ferro_sicilite_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item FERRO_SICILITE_HELMET = registerItem("ferro_sicilite_helmet",
            new ModArmorItem(ModArmorMaterials.FERRO_SICILITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item FERRO_SICILITE_CHESTPLATE = registerItem("ferro_sicilite_chestplate",
            new ArmorItem(ModArmorMaterials.FERRO_SICILITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item FERRO_SICILITE_LEGGINGS = registerItem("ferro_sicilite_leggings",
            new ArmorItem(ModArmorMaterials.FERRO_SICILITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item FERRO_SICILITE_BOOTS = registerItem("ferro_sicilite_boots",
            new ArmorItem(ModArmorMaterials.FERRO_SICILITE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));
    //adv items start
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aenarim.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Aenarim.LOGGER.debug("Registering Mod Items for " + Aenarim.MOD_ID);

    }
}
