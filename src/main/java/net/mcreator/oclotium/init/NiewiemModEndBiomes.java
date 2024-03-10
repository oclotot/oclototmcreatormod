package net.mcreator.oclotium.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.oclotium.endbiomes.TheEndBiomes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NiewiemModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("niewiem:end_biome_01")), 0.8d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("niewiem:end_biome_01")), ResourceKey.create(Registries.BIOME, new ResourceLocation("niewiem:end_biome_01")), 0.8d);
		});
	}
}
