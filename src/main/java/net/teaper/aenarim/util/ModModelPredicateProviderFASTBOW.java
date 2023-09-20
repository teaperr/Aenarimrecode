package net.teaper.aenarim.util;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.teaper.aenarim.item.ModItems;

public class ModModelPredicateProviderFASTBOW {
    public static void registerModModels() {
        registerBow(ModItems.FLINT_BOW);
        registerBow(ModItems.SNAIL_CAT);
    }

    private static void registerBow(Item bow) {
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                                                                                // THIS CHANGES THE BOW DRAW SPEED
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 15.0f;
                });

        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem()
                        && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
}