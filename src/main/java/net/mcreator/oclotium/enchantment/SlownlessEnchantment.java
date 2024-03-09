
package net.mcreator.oclotium.enchantment;

public class SlownlessEnchantment extends Enchantment {

	public SlownlessEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMinLevel() {
		return 29;
	}

	@Override
	public int getMaxLevel() {
		return 38;
	}

}
