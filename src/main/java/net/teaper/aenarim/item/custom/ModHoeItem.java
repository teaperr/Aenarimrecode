package net.teaper.aenarim.item.custom;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class ModHoeItem extends HoeItem {
    public ModHoeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, (int) attackDamage, attackSpeed, settings);
    }
}
