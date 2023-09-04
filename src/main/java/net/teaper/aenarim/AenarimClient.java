package net.teaper.aenarim;

import net.fabricmc.api.ClientModInitializer;
import net.teaper.aenarim.entity.armor.ModSkullArmorRenderer;
import net.teaper.aenarim.item.ModItems;
import net.teaper.aenarim.util.ModModelPredicateProvider;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AenarimClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoArmorRenderer.registerArmorRenderer(new ModSkullArmorRenderer(), ModItems.BONE_HELMET);

        ModModelPredicateProvider.registerModModels();
    }
}
