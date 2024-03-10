
package net.mcreator.oclotium.client.renderer;

public class SkibidiToiletFinalBossRenderer extends GeoEntityRenderer<SkibidiToiletFinalBossEntity> {
	public SkibidiToiletFinalBossRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SkibidiToiletFinalBossModel());
		this.shadowRadius = 0.8f;
	}

	@Override
	public RenderType getRenderType(SkibidiToiletFinalBossEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, SkibidiToiletFinalBossEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(SkibidiToiletFinalBossEntity entityLivingBaseIn) {
		return 0.0F;
	}
}