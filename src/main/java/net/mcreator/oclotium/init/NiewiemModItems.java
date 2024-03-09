
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.oclotium.item.RawEnderioriteItem;
import net.mcreator.oclotium.item.EnderioriteIngotItem;
import net.mcreator.oclotium.NiewiemMod;

public class NiewiemModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NiewiemMod.MODID);
	public static final RegistryObject<Item> ENDERIOTE = block(NiewiemModBlocks.ENDERIOTE);
	public static final RegistryObject<Item> ENDERIORITE_INGOT = REGISTRY.register("enderiorite_ingot", () -> new EnderioriteIngotItem());
	public static final RegistryObject<Item> RAW_ENDERIORITE = REGISTRY.register("raw_enderiorite", () -> new RawEnderioriteItem());
	public static final RegistryObject<Item> ENDER_FLOWER = block(NiewiemModBlocks.ENDER_FLOWER);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
