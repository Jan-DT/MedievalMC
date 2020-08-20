
package dev.eclypse.medievalmc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import dev.eclypse.medievalmc.itemgroup.MedievalmcWeaponsItemGroup;
import dev.eclypse.medievalmc.MedievalmcModElements;

@MedievalmcModElements.ModElement.Tag
public class IronBattleaxeItem extends MedievalmcModElements.ModElement {
	@ObjectHolder("medievalmc:iron_battleaxe")
	public static final Item block = null;
	public IronBattleaxeItem(MedievalmcModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 580;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT, (int) (1)));
			}
		}, 1, -3.1f, new Item.Properties().group(MedievalmcWeaponsItemGroup.tab)) {
		}.setRegistryName("iron_battleaxe"));
	}
}
