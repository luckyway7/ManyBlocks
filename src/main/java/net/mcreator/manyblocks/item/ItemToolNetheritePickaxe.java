
package net.mcreator.manyblocks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.manyblocks.creativetab.TabTabManyBlocks;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Set;
import java.util.HashMap;

@ElementsManyblocksMod.ModElement.Tag
public class ItemToolNetheritePickaxe extends ElementsManyblocksMod.ModElement {
	@GameRegistry.ObjectHolder("manyblocks:tool_netherite_pickaxe")
	public static final Item block = null;
	public ItemToolNetheritePickaxe(ElementsManyblocksMod instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("TOOL_NETHERITE_PICKAXE", 1, 2031, 4f, 4f, 15)) {
			{
				this.attackSpeed = -2.8f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("tool_netherite_pickaxe").setRegistryName("tool_netherite_pickaxe").setCreativeTab(TabTabManyBlocks.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("manyblocks:tool_netherite_pickaxe", "inventory"));
	}
}
