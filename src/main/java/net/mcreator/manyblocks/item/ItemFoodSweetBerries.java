
package net.mcreator.manyblocks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.manyblocks.creativetab.TabTabManyBlocks;
import net.mcreator.manyblocks.ElementsManyblocksMod;

@ElementsManyblocksMod.ModElement.Tag
public class ItemFoodSweetBerries extends ElementsManyblocksMod.ModElement {
	@GameRegistry.ObjectHolder("manyblocks:food_sweet_berries")
	public static final Item block = null;
	public ItemFoodSweetBerries(ElementsManyblocksMod instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("manyblocks:food_sweet_berries", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 0.3f, false);
			setUnlocalizedName("food_sweet_berries");
			setRegistryName("food_sweet_berries");
			setCreativeTab(TabTabManyBlocks.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
