
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.oclotium.item.SmallBulletItem;
import net.mcreator.oclotium.item.RawEnderioriteItem;
import net.mcreator.oclotium.item.PistolItem;
import net.mcreator.oclotium.item.PaxelItem;
import net.mcreator.oclotium.item.EnderioriteIngotItem;
import net.mcreator.oclotium.item.CreamPuffItem;
import net.mcreator.oclotium.NiewiemMod;

public class NiewiemModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NiewiemMod.MODID);
	public static final RegistryObject<Item> ENDERIOTE = block(NiewiemModBlocks.ENDERIOTE);
	public static final RegistryObject<Item> ENDERIORITE_INGOT = REGISTRY.register("enderiorite_ingot", () -> new EnderioriteIngotItem());
	public static final RegistryObject<Item> RAW_ENDERIORITE = REGISTRY.register("raw_enderiorite", () -> new RawEnderioriteItem());
	public static final RegistryObject<Item> ENDER_FLOWER = block(NiewiemModBlocks.ENDER_FLOWER);
	public static final RegistryObject<Item> SKIBIDI_TOILET_FINAL_BOSS_SPAWN_EGG = REGISTRY.register("skibidi_toilet_final_boss_spawn_egg", () -> new ForgeSpawnEggItem(NiewiemModEntities.SKIBIDI_TOILET_FINAL_BOSS, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> SMALL_BULLET = REGISTRY.register("small_bullet", () -> new SmallBulletItem());
	public static final RegistryObject<Item> ENDSTONEGRASSBLOCK = block(NiewiemModBlocks.ENDSTONEGRASSBLOCK);
	public static final RegistryObject<Item> CREAM_PUFF = REGISTRY.register("cream_puff", () -> new CreamPuffItem());
	public static final RegistryObject<Item> END_FLOWER = block(NiewiemModBlocks.END_FLOWER);
	public static final RegistryObject<Item> PAXEL = REGISTRY.register("paxel", () -> new PaxelItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
