// In ModEntities.java
package net.addie.kten.entity;

import net.addie.kten.entity.custom.KTenEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModEntities {
 public static final EntityType<KTenEntity> KTEN_ENTITY = Registry.register(
         Registries.ENTITY_TYPE,
         new Identifier("kten", "kten_entity"),
         FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, KTenEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
 );
}