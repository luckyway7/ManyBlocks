
package net.mcreator.manyblocks.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.NonNullList;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.manyblocks.procedure.ProcedureBlockRespawnAnchorOnBlockRightClicked;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Map;
import java.util.HashMap;

@ElementsManyblocksMod.ModElement.Tag
public class BlockBlockRespawnAnchorTwoStageActive extends ElementsManyblocksMod.ModElement {
	@GameRegistry.ObjectHolder("manyblocks:block_respawn_anchor_two_stage_active")
	public static final Block block = null;
	public BlockBlockRespawnAnchorTwoStageActive(ElementsManyblocksMod instance) {
		super(instance, 169);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("block_respawn_anchor_two_stage_active"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("manyblocks:block_respawn_anchor_two_stage_active", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("block_respawn_anchor_two_stage_active");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0.466666666667F);
			setLightOpacity(255);
			setCreativeTab(null);
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockBlockRespawnAnchor.block, (int) (1));
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(BlockBlockRespawnAnchor.block, (int) (1)));
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction,
				float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureBlockRespawnAnchorOnBlockRightClicked.executeProcedure($_dependencies);
			}
			return true;
		}
	}
}
