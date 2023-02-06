
package net.mcreator.manyblocks.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.manyblocks.creativetab.TabTabManyBlocks;
import net.mcreator.manyblocks.ElementsManyblocksMod;

@ElementsManyblocksMod.ModElement.Tag
public class BlockBlockDeepslateCoalOre extends ElementsManyblocksMod.ModElement {
	@GameRegistry.ObjectHolder("manyblocks:block_deepslate_coal_ore")
	public static final Block block = null;
	public BlockBlockDeepslateCoalOre(ElementsManyblocksMod instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("block_deepslate_coal_ore"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("manyblocks:block_deepslate_coal_ore", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("block_deepslate_coal_ore");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTabManyBlocks.tab);
		}
	}
}
