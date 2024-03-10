
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.oclotium.client.model.Modelssmallbullet;
import net.mcreator.oclotium.client.model.Modelsmallbullet;
import net.mcreator.oclotium.client.model.Modelbullets;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NiewiemModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbullets.LAYER_LOCATION, Modelbullets::createBodyLayer);
		event.registerLayerDefinition(Modelssmallbullet.LAYER_LOCATION, Modelssmallbullet::createBodyLayer);
		event.registerLayerDefinition(Modelsmallbullet.LAYER_LOCATION, Modelsmallbullet::createBodyLayer);
	}
}
