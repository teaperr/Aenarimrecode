package net.teaper.aenarim.entity;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;

public class ModArrowEntity extends EntityType<Entity> {
    private final RegistryEntry.Reference<EntityType<?>> registryEntry = Registry.ENTITY_TYPE.createEntry(this);
    public static final EntityType<ArrowEntity> CRYSTAL_BEAM = EntityType.ARROW("crystal_beam", EntityType.Builder.create(ArrowEntity::new, SpawnGroup.MISC).setDimensions(0.5f, 0.5f).maxTrackingRange(4).trackingTickInterval(20));

    public ModArrowEntity(EntityFactory<Entity> factory, SpawnGroup spawnGroup, boolean saveable, boolean summonable, boolean fireImmune, boolean spawnableFarFromPlayer, ImmutableSet<Block> canSpawnInside, EntityDimensions dimensions, int maxTrackDistance, int trackTickInterval) {
        super(factory, spawnGroup, saveable, summonable, fireImmune, spawnableFarFromPlayer, canSpawnInside, dimensions, maxTrackDistance, trackTickInterval);
    }
}