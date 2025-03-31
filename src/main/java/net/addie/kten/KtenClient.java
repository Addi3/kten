// In KtenClient.java
package net.addie.kten;

import net.addie.kten.entity.ModEntities;
import net.addie.kten.entity.client.KTenEntityModel;
import net.addie.kten.entity.client.KTenEntityRenderer;
import net.addie.kten.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

public class KtenClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.KTEN_ENTITY, KTenEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.K_TEN, KTenEntityModel::getTexturedModelData);
    }
}