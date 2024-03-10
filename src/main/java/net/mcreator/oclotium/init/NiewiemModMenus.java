
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.oclotium.world.inventory.EndVillagerTradeGUIMenu;
import net.mcreator.oclotium.NiewiemMod;

public class NiewiemModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NiewiemMod.MODID);
	public static final RegistryObject<MenuType<EndVillagerTradeGUIMenu>> END_VILLAGER_TRADE_GUI = REGISTRY.register("end_villager_trade_gui", () -> IForgeMenuType.create(EndVillagerTradeGUIMenu::new));
}
