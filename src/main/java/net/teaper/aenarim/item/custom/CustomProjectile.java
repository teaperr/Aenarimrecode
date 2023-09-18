package net.teaper.aenarim.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CustomProjectile extends PersistentProjectileEntity {
    public CustomProjectile(EntityType<? extends ArrowEntity> entityType, World world) {
        super((EntityType<? extends PersistentProjectileEntity>)entityType, world);
    }
    public CustomProjectile(World world, double x, double y, double z) {
        super(EntityType.ARROW, x, y, z, world);
    }

    public CustomProjectile(World world, LivingEntity owner) {
        super(EntityType.ARROW, owner, world);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
    }


    @Override
    protected ItemStack asItemStack() {
        return null;
    }


}
