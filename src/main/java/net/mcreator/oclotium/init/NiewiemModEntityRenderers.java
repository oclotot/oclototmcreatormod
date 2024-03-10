
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.oclotium.client.renderer.SkibidiToiletFinalBossRenderer;
import net.mcreator.oclotium.client.renderer.PociskRenderer;
import net.mcreator.oclotium.client.renderer.EndVillagerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NiewiemModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NiewiemModEntities.SKIBIDI_TOILET_FINAL_BOSS.get(), SkibidiToiletFinalBossRenderer::new);
		event.registerEntityRenderer(NiewiemModEntities.POCISK.get(), PociskRenderer::new);
		event.registerEntityRenderer(NiewiemModEntities.END_VILLAGER.get(), EndVillagerRenderer::new);
	}
}
