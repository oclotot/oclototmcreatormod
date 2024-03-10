
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.oclotium.enchantment.SlownlessEnchantment;
import net.mcreator.oclotium.enchantment.PoisonEnchantment;
import net.mcreator.oclotium.NiewiemMod;

public class NiewiemModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, NiewiemMod.MODID);
	public static final RegistryObject<Enchantment> SLOWNLESS = REGISTRY.register("slownless", () -> new SlownlessEnchantment());
	public static final RegistryObject<Enchantment> POISON = REGISTRY.register("poison", () -> new PoisonEnchantment());
}
