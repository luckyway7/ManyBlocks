
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
public class ItemArmorNetheriteArmor extends ElementsManyblocksMod.ModElement {
	@GameRegistry.ObjectHolder("manyblocks:armor_netherite_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("manyblocks:armor_netherite_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("manyblocks:armor_netherite_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("manyblocks:armor_netherite_armorboots")
	public static final Item boots = null;
	public ItemArmorNetheriteArmor(ElementsManyblocksMod instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ARMOR_NETHERITE_ARMOR", "manyblocks:netherite_", 25, new int[]{3, 6, 8, 3}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("armor_netherite_armorhelmet")
				.setRegistryName("armor_netherite_armorhelmet").setCreativeTab(TabTabManyBlocks.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("armor_netherite_armorbody")
				.setRegistryName("armor_netherite_armorbody").setCreativeTab(TabTabManyBlocks.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("armor_netherite_armorlegs")
				.setRegistryName("armor_netherite_armorlegs").setCreativeTab(TabTabManyBlocks.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("armor_netherite_armorboots")
				.setRegistryName("armor_netherite_armorboots").setCreativeTab(TabTabManyBlocks.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("manyblocks:armor_netherite_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("manyblocks:armor_netherite_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("manyblocks:armor_netherite_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("manyblocks:armor_netherite_armorboots", "inventory"));
	}
}
