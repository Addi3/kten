package net.addie.kten.entity;

import net.addie.kten.entity.custom.KTenEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
public class ModEntities {

 public static final EntityType<KTenEntity> K_TEN_ENTITY_ENTITY_TYPE = FabricEntityTypeBuilder.create(
            SpawnGroup.MISC, KTenEntity::new).dimensions(EntityDimensions.changing(0.8f, 0.8f)).build();

}
