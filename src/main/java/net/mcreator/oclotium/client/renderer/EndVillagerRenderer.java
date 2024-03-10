
package net.mcreator.oclotium.client.renderer;

public class EndVillagerRenderer extends GeoEntityRenderer<EndVillagerEntity> {
	public EndVillagerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EndVillagerModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(EndVillagerEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, EndVillagerEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}