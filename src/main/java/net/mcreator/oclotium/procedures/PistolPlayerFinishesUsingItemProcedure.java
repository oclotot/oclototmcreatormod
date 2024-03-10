package net.mcreator.oclotium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.oclotium.init.NiewiemModParticleTypes;

public class PistolPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NiewiemModParticleTypes.GUNSHOT.get()), x, y, z, 8, 0.1, 0.1, 0.1, 0.5);
	}
}
