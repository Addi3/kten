// In KTenEntityRenderer.java
package net.addie.kten.entity.client;

import net.addie.kten.entity.custom.KTenEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class KTenEntityRenderer extends MobEntityRenderer<KTenEntity, KTenEntityModel<KTenEntity>> {

    public KTenEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new KTenEntityModel<>(context.getPart(ModModelLayers.K_TEN)), 0.5f);
    }

    @Override
    public Identifier getTexture(KTenEntity entity) {
        return new Identifier("kten", "textures/entity/kten_entity.png");
    }
}