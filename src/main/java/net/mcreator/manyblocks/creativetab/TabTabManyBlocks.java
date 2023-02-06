
package net.mcreator.manyblocks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.manyblocks.block.BlockBlockManyBlocksIcon;
import net.mcreator.manyblocks.ElementsManyblocksMod;

@ElementsManyblocksMod.ModElement.Tag
public class TabTabManyBlocks extends ElementsManyblocksMod.ModElement {
	public TabTabManyBlocks(ElementsManyblocksMod instance) {
		super(instance, 137);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtab_many_blocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockBlockManyBlocksIcon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
