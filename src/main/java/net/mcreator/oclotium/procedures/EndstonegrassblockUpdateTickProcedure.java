package net.mcreator.oclotium.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.oclotium.init.NiewiemModBlocks;

public class EndstonegrassblockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.VOID_AIR) && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == NiewiemModBlocks.ENDSTONEGRASSBLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.END_STONE.defaultBlockState(), 3);
		}
	}
}
