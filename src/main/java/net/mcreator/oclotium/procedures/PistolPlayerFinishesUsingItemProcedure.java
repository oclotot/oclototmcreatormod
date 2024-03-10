package net.mcreator.oclotium.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PistolPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NiewiemModParticleTypes.DELETED_MOD_ELEMENT.get()), x, (y + 1), z, 1, 0.1, 0.1, 0.1, 0.5);
	}
}
