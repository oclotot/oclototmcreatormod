
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.oclotium.NiewiemMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NiewiemModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NiewiemMod.MODID);
	public static final RegistryObject<CreativeModeTab> OCLOTOTITEMUS = REGISTRY.register("oclototitemus",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.niewiem.oclototitemus")).icon(() -> new ItemStack(NiewiemModBlocks.END_FLOWER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NiewiemModBlocks.ENDSTONEGRASSBLOCK.get().asItem());
				tabData.accept(NiewiemModItems.CREAM_PUFF.get());
				tabData.accept(NiewiemModBlocks.END_FLOWER.get().asItem());
				tabData.accept(NiewiemModBlocks.END_STEM.get().asItem());
				tabData.accept(NiewiemModBlocks.END_SHROOM.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(NiewiemModItems.PISTOL.get());
			tabData.accept(NiewiemModItems.SMALL_BULLET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NiewiemModItems.SKIBIDI_TOILET_FINAL_BOSS_SPAWN_EGG.get());
			tabData.accept(NiewiemModItems.END_VILLAGER_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NiewiemModItems.ENDERIORITE_INGOT.get());
			tabData.accept(NiewiemModItems.RAW_ENDERIORITE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NiewiemModBlocks.ENDERIOTE.get().asItem());
		}
	}
}
