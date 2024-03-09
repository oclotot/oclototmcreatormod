package net.mcreator.oclotium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.oclotium.entity.SkibidiToiletFinalBossEntity;

public class SkibidiToiletFinalBossModel extends GeoModel<SkibidiToiletFinalBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkibidiToiletFinalBossEntity entity) {
		return new ResourceLocation("niewiem", "animations/skibiditoilet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkibidiToiletFinalBossEntity entity) {
		return new ResourceLocation("niewiem", "geo/skibiditoilet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkibidiToiletFinalBossEntity entity) {
		return new ResourceLocation("niewiem", "textures/entities/" + entity.getTexture() + ".png");
	}

}
