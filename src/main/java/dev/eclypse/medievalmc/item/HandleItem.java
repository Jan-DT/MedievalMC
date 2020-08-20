
package dev.eclypse.medievalmc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import dev.eclypse.medievalmc.itemgroup.MedievalmcPartsItemGroup;
import dev.eclypse.medievalmc.MedievalmcModElements;

@MedievalmcModElements.ModElement.Tag
public class HandleItem extends MedievalmcModElements.ModElement {
	@ObjectHolder("medievalmc:handle")
	public static final Item block = null;
	public HandleItem(MedievalmcModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MedievalmcPartsItemGroup.tab).maxStackSize(16));
			setRegistryName("handle");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
