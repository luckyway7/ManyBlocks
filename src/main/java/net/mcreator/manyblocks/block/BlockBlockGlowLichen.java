
package net.mcreator.manyblocks.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.Block;

import net.mcreator.manyblocks.creativetab.TabTabManyBlocks;
import net.mcreator.manyblocks.ElementsManyblocksMod;

@ElementsManyblocksMod.ModElement.Tag
public class BlockBlockGlowLichen extends ElementsManyblocksMod.ModElement {
	@GameRegistry.ObjectHolder("manyblocks:block_glow_lichen")
	public static final Block block = null;
	public BlockBlockGlowLichen(ElementsManyblocksMod instance) {
		super(instance, 173);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("block_glow_lichen"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("manyblocks:block_glow_lichen", "inventory"));
	}
	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public BlockCustom() {
			super(Material.PLANTS);
			setUnlocalizedName("block_glow_lichen");
			setSoundType(SoundType.PLANT);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0.466666666667F);
			setLightOpacity(0);
			setCreativeTab(TabTabManyBlocks.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing) state.getValue(FACING)) {
				case SOUTH :
				default :
					return new AxisAlignedBB(0, 0, 0, 0, 0, 0).union(new AxisAlignedBB(1, 1, 0.0625, 1, 1, 0.0625));
				case NORTH :
					return new AxisAlignedBB(0, 0, 1, 0, 0, 1).union(new AxisAlignedBB(1, 1, 0.9375, 1, 1, 0.9375));
				case EAST :
					return new AxisAlignedBB(0, 0, 0, 0, 0, 0).union(new AxisAlignedBB(0.0625, 1, 1, 0.0625, 1, 1));
				case WEST :
					return new AxisAlignedBB(1, 0, 0, 1, 0, 0).union(new AxisAlignedBB(0.9375, 1, 1, 0.9375, 1, 1));
				case UP :
					return new AxisAlignedBB(0, 0, 0, 0, 0, 0).union(new AxisAlignedBB(1, 0.0625, 1, 1, 0.0625, 1));
				case DOWN :
					return new AxisAlignedBB(0, 1, 0, 0, 1, 0).union(new AxisAlignedBB(1, 0.9375, 1, 1, 0.9375, 1));
			}
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, facing);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	}
}
