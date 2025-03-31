package net.addie.kten.entity.client;

import net.addie.kten.entity.custom.KTenEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

public class KTenModel<T extends KTenEntity> extends SinglePartEntityModel<T> {

	private final ModelPart KTen;
	private final ModelPart head;

	public KTenModel(ModelPart root) {
		this.KTen = root.getChild("KTen");
		this.head = KTen.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData KTen = modelPartData.addChild("KTen", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = KTen.addChild("body", ModelPartBuilder.create().uv(20, 41).cuboid(-2.0F, 3.0F, -2.0F, 4.0F, 16.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 16).cuboid(-6.0F, 3.0F, -10.0F, 12.0F, 16.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 8).cuboid(-6.0F, 3.1F, -10.0F, 12.0F, 0.0F, 8.3F, new Dilation(0.0F))
		.uv(40, 9).cuboid(-2.0F, 2.5F, -6.4F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 8).cuboid(-6.0F, 18.9F, -10.0F, 12.0F, 0.0F, 8.3F, new Dilation(0.0F))
		.uv(35, 0).cuboid(-5.0F, 4.2F, -11.2F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(35, 0).cuboid(-5.0F, 15.2F, -11.2F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.2F, -11.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(48, 42).cuboid(-1.0F, -2.6286F, 0.2532F, 1.0F, 4.0F, 1.0F, new Dilation(0.4F)), ModelTransform.of(0.5F, 2.0F, -4.7F, -0.6981F, 0.0F, 0.0F));

		ModelPartData pannel = body.addChild("pannel", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 11.0F, -2.0F));

		ModelPartData body_r2 = pannel.addChild("body_r2", ModelPartBuilder.create().uv(22, 20).cuboid(0.0F, -7.0F, -2.5F, 0.0F, 14.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(1.783F, 0.2F, -3.1939F, 0.0F, -0.4363F, 0.0F));

		ModelPartData body_r3 = pannel.addChild("body_r3", ModelPartBuilder.create().uv(0, 41).cuboid(-0.7F, -8.0F, -9.0F, 1.0F, 0.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(-0.7F, 8.0F, -9.0F, 1.0F, 0.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(0.0F, -8.0F, -9.0F, 0.0F, 16.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		ModelPartData pannel2 = body.addChild("pannel2", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 11.0F, -2.0F));

		ModelPartData body_r4 = pannel2.addChild("body_r4", ModelPartBuilder.create().uv(0, 41).mirrored().cuboid(-0.3F, -8.0F, -9.0F, 1.0F, 0.0F, 9.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 41).mirrored().cuboid(-0.3F, 8.0F, -9.0F, 1.0F, 0.0F, 9.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 16).mirrored().cuboid(0.0F, -8.0F, -9.0F, 0.0F, 16.0F, 9.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		ModelPartData body_r5 = pannel2.addChild("body_r5", ModelPartBuilder.create().uv(22, 20).mirrored().cuboid(0.0662F, -7.2F, -1.6482F, 0.0F, 14.0F, 7.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-2.083F, 0.0F, -3.9939F, 0.0F, -0.4363F, 3.1416F));

		ModelPartData head = KTen.addChild("head", ModelPartBuilder.create().uv(36, 32).cuboid(-2.5F, -5.0F, -3.0F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F))
		.uv(40, 14).cuboid(-2.5F, -4.1F, -3.2F, 5.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 48).cuboid(-1.5F, -2.02F, -4.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 55).cuboid(-0.5F, -2.02F, -4.2F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -8.2F, -10.0F));

		ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(42, 48).mirrored().cuboid(0.4F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.0F, -1.02F, -3.5F, 0.0465F, 0.2577F, 0.1806F));

		ModelPartData head_r2 = head.addChild("head_r2", ModelPartBuilder.create().uv(42, 48).cuboid(-3.4F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -1.02F, -3.5F, 0.0465F, -0.2577F, -0.1806F));

		ModelPartData head_r3 = head.addChild("head_r3", ModelPartBuilder.create().uv(36, 48).mirrored().cuboid(-2.5F, -1.5F, 0.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(3.5F, -6.5F, -0.5F, 0.0692F, 0.2527F, 0.2706F));

		ModelPartData head_r4 = head.addChild("head_r4", ModelPartBuilder.create().uv(36, 48).cuboid(-0.5F, -1.5F, 0.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, -6.5F, -0.5F, 0.0692F, -0.2527F, -0.2706F));

		ModelPartData tail = KTen.addChild("tail", ModelPartBuilder.create(), ModelTransform.of(0.0F, -7.7F, 7.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData tail_r1 = tail.addChild("tail_r1", ModelPartBuilder.create().uv(38, 42).cuboid(-2.5F, 4.7F, 3.6F, 5.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.5F, -0.3491F, 0.0F, 0.0F));

		ModelPartData tail_r2 = tail.addChild("tail_r2", ModelPartBuilder.create().uv(28, 42).cuboid(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.5F, 0.3054F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(KTenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		KTen.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return KTen;
	}
}