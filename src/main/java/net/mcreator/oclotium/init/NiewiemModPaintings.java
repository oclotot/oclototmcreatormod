
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.oclotium.NiewiemMod;

public class NiewiemModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, NiewiemMod.MODID);
	public static final RegistryObject<PaintingVariant> SIUREK = REGISTRY.register("siurek", () -> new PaintingVariant(128, 128));
}
