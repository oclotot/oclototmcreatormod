
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oclotium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.oclotium.entity.SkibidiToiletFinalBossEntity;
import net.mcreator.oclotium.entity.PociskEntity;
import net.mcreator.oclotium.entity.EndVillagerEntity;
import net.mcreator.oclotium.NiewiemMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NiewiemModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NiewiemMod.MODID);
	public static final RegistryObject<EntityType<SkibidiToiletFinalBossEntity>> SKIBIDI_TOILET_FINAL_BOSS = register("skibidi_toilet_final_boss",
			EntityType.Builder.<SkibidiToiletFinalBossEntity>of(SkibidiToiletFinalBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(SkibidiToiletFinalBossEntity::new)

					.sized(0.8f, 1.7f));
	public static final RegistryObject<EntityType<PociskEntity>> POCISK = register("projectile_pocisk",
			EntityType.Builder.<PociskEntity>of(PociskEntity::new, MobCategory.MISC).setCustomClientFactory(PociskEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EndVillagerEntity>> END_VILLAGER = register("end_villager",
			EntityType.Builder.<EndVillagerEntity>of(EndVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndVillagerEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SkibidiToiletFinalBossEntity.init();
			EndVillagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SKIBIDI_TOILET_FINAL_BOSS.get(), SkibidiToiletFinalBossEntity.createAttributes().build());
		event.put(END_VILLAGER.get(), EndVillagerEntity.createAttributes().build());
	}
}
