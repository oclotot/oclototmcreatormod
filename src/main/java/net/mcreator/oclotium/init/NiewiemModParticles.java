
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.oclotium.client.particle.EndgrassparticleParticle;
import net.mcreator.oclotium.client.particle.EndbiomeparticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NiewiemModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(NiewiemModParticleTypes.ENDBIOMEPARTICLE.get(), EndbiomeparticleParticle::provider);
		event.registerSpriteSet(NiewiemModParticleTypes.ENDGRASSPARTICLE.get(), EndgrassparticleParticle::provider);
	}
}
