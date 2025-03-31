
package net.addie.kten;

import net.addie.kten.entity.ModEntities;
import net.addie.kten.entity.custom.KTenEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kten implements ModInitializer {
	public static final String MOD_ID = "kten";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Register your entities and other objects here
		FabricDefaultAttributeRegistry.register(ModEntities.KTEN_ENTITY, KTenEntity.createKtenAttributes());
	}
}