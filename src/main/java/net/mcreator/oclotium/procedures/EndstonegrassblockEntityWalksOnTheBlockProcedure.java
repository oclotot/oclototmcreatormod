package net.mcreator.oclotium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.oclotium.init.NiewiemModParticleTypes;

public class EndstonegrassblockEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NiewiemModParticleTypes.ENDGRASSPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 1, 0.2, 1, 0.5);
	}
}
