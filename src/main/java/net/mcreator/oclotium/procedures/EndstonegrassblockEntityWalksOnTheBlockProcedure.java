package net.mcreator.oclotium.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EndstonegrassblockEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NiewiemModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 1, 0.2, 1, 0.5);
	}
}
