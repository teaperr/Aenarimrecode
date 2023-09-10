package net.teaper.aenarim.item.custom.tooltips;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class Sugar_BreadTooltip extends Item {
    public Sugar_BreadTooltip(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.aenarim.sugar_bread.tooltip").formatted(Formatting.ITALIC));
    }
}
