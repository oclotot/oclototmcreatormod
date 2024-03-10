
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
import net.mcreator.oclotium.item.EnderioriteArmorItem;
import net.mcreator.oclotium.item.CreamPuffItem;
import net.mcreator.oclotium.NiewiemMod;

public class NiewiemModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NiewiemMod.MODID);
	public static final RegistryObject<Item> ENDERIOTE = block(NiewiemModBlocks.ENDERIOTE);
	public static final RegistryObject<Item> ENDERIORITE_INGOT = REGISTRY.register("enderiorite_ingot", () -> new EnderioriteIngotItem());
	public static final RegistryObject<Item> RAW_ENDERIORITE = REGISTRY.register("raw_enderiorite", () -> new RawEnderioriteItem());
	public static final RegistryObject<Item> SKIBIDI_TOILET_FINAL_BOSS_SPAWN_EGG = REGISTRY.register("skibidi_toilet_final_boss_spawn_egg", () -> new ForgeSpawnEggItem(NiewiemModEntities.SKIBIDI_TOILET_FINAL_BOSS, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> SMALL_BULLET = REGISTRY.register("small_bullet", () -> new SmallBulletItem());
	public static final RegistryObject<Item> ENDSTONEGRASSBLOCK = block(NiewiemModBlocks.ENDSTONEGRASSBLOCK);
	public static final RegistryObject<Item> CREAM_PUFF = REGISTRY.register("cream_puff", () -> new CreamPuffItem());
	public static final RegistryObject<Item> END_FLOWER = block(NiewiemModBlocks.END_FLOWER);
	public static final RegistryObject<Item> END_STEM = block(NiewiemModBlocks.END_STEM);
	public static final RegistryObject<Item> END_SHROOM = block(NiewiemModBlocks.END_SHROOM);
	public static final RegistryObject<Item> END_VILLAGER_SPAWN_EGG = REGISTRY.register("end_villager_spawn_egg", () -> new ForgeSpawnEggItem(NiewiemModEntities.END_VILLAGER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> PAXEL = REGISTRY.register("paxel", () -> new PaxelItem());
	public static final RegistryObject<Item> ENDERIORITE_ARMOR_HELMET = REGISTRY.register("enderiorite_armor_helmet", () -> new EnderioriteArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERIORITE_ARMOR_CHESTPLATE = REGISTRY.register("enderiorite_armor_chestplate", () -> new EnderioriteArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERIORITE_ARMOR_LEGGINGS = REGISTRY.register("enderiorite_armor_leggings", () -> new EnderioriteArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERIORITE_ARMOR_BOOTS = REGISTRY.register("enderiorite_armor_boots", () -> new EnderioriteArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
