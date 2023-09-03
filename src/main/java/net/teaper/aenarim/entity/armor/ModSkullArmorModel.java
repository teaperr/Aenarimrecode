package net.teaper.aenarim.entity.armor;

import net.minecraft.util.Identifier;
import net.teaper.aenarim.Aenarim;
import net.teaper.aenarim.item.custom.ModSkullArmor;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModSkullArmorModel extends AnimatedGeoModel<ModSkullArmor> {
    @Override
    public Identifier getModelResource(ModSkullArmor object) {
        return new Identifier(Aenarim.MOD_ID, "geo/bone_helmet.geo.json");
    }

    @Override
    public Identifier getTextureResource(ModSkullArmor object) {
        return new Identifier(Aenarim.MOD_ID, "textures/armor/bone_helmet.png");
    }

    @Override
    public Identifier getAnimationResource(ModSkullArmor animatable) {
        return new Identifier(Aenarim.MOD_ID, "animations/bone_helmet.animation.json");
    }
}
