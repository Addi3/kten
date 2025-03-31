// In ModModelLayers.java
package net.addie.kten.entity.client;

import net.addie.kten.Kten;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer K_TEN =
            new EntityModelLayer(new Identifier(Kten.MOD_ID, "kten"), "main");
}