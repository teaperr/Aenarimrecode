package net.teaper.aenarim.entity.armor;

import net.teaper.aenarim.item.custom.ModSkullArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ModSkullArmorRenderer extends GeoArmorRenderer<ModSkullArmor> {
    public ModSkullArmorRenderer() {
        super(new ModSkullArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
