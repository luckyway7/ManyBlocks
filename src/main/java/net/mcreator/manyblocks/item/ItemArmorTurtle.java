
package net.mcreator.manyblocks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.manyblocks.creativetab.TabTabManyBlocks;
import net.mcreator.manyblocks.ElementsManyblocksMod;

@ElementsManyblocksMod.ModElement.Tag
public class ItemArmorTurtle extends ElementsManyblocksMod.ModElement {
	@GameRegistry.ObjectHolder("manyblocks:armor_turtlehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("manyblocks:armor_turtlebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("manyblocks:armor_turtlelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("manyblocks:armor_turtleboots")
	public static final Item boots = null;
	public ItemArmorTurtle(ElementsManyblocksMod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ARMOR_TURTLE", "manyblocks:turtle_", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("armor_turtlehelmet")
				.setRegistryName("armor_turtlehelmet").setCreativeTab(TabTabManyBlocks.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("manyblocks:armor_turtlehelmet", "inventory"));
	}
}
