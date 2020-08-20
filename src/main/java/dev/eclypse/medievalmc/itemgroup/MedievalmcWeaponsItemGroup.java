
package dev.eclypse.medievalmc.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import dev.eclypse.medievalmc.item.IronBattleaxeItem;
import dev.eclypse.medievalmc.MedievalmcModElements;

@MedievalmcModElements.ModElement.Tag
public class MedievalmcWeaponsItemGroup extends MedievalmcModElements.ModElement {
	public MedievalmcWeaponsItemGroup(MedievalmcModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmedievalmc_weapons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IronBattleaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
