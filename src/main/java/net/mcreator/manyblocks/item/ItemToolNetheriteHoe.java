
package net.mcreator.manyblocks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.manyblocks.creativetab.TabTabManyBlocks;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Set;
import java.util.HashMap;

@ElementsManyblocksMod.ModElement.Tag
public class ItemToolNetheriteHoe extends ElementsManyblocksMod.ModElement {
	@GameRegistry.ObjectHolder("manyblocks:tool_netherite_hoe")
	public static final Item block = null;
	public ItemToolNetheriteHoe(ElementsManyblocksMod instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("TOOL_NETHERITE_HOE", 4, 2031, 4f, 3f, 2)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("tool_netherite_hoe").setRegistryName("tool_netherite_hoe").setCreativeTab(TabTabManyBlocks.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("manyblocks:tool_netherite_hoe", "inventory"));
	}
}
