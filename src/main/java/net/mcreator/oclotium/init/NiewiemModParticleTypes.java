
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.oclotium.NiewiemMod;

public class NiewiemModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, NiewiemMod.MODID);
	public static final RegistryObject<SimpleParticleType> ENDBIOMEPARTICLE = REGISTRY.register("endbiomeparticle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ENDGRASSPARTICLE = REGISTRY.register("endgrassparticle", () -> new SimpleParticleType(false));
}
