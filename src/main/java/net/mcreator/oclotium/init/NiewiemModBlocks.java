
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.oclotium.block.EnderioteBlock;
import net.mcreator.oclotium.NiewiemMod;

public class NiewiemModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NiewiemMod.MODID);
	public static final RegistryObject<Block> ENDERIOTE = REGISTRY.register("enderiote", () -> new EnderioteBlock());
}
