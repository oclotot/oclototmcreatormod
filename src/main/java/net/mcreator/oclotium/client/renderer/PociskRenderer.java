package net.mcreator.oclotium.client.renderer;

import com.mojang.math.Axis;

public class PociskRenderer extends EntityRenderer<PociskEntity> {

	private static final ResourceLocation texture = new ResourceLocation("niewiem:textures/entities/rrrrrrrrrr.png");

	private final Modelsmallbullet model;

	public PociskRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelsmallbullet(context.bakeLayer(Modelsmallbullet.LAYER_LOCATION));
	}

	@Override
	public void render(PociskEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(PociskEntity entity) {
		return texture;
	}

}
