package net.mcreator.oclotium.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class EndVillagerModel extends GeoModel<EndVillagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(EndVillagerEntity entity) {
		return new ResourceLocation("niewiem", "animations/endvillager.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndVillagerEntity entity) {
		return new ResourceLocation("niewiem", "geo/endvillager.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndVillagerEntity entity) {
		return new ResourceLocation("niewiem", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(EndVillagerEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}