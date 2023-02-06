package net.mcreator.manyblocks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

import net.mcreator.manyblocks.block.BlockBlockSoulTorchWall;
import net.mcreator.manyblocks.block.BlockBlockSoulTorch;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Map;

@ElementsManyblocksMod.ModElement.Tag
public class ProcedureItemSoulTorchBlockOnRightClick extends ElementsManyblocksMod.ModElement {
	public ProcedureItemSoulTorchBlockOnRightClick(ElementsManyblocksMod instance) {
		super(instance, 150);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("direction") == null) {
			System.err.println("Failed to load dependency direction for procedure ItemSoulTorchBlockOnRightClick!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ItemSoulTorchBlockOnRightClick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ItemSoulTorchBlockOnRightClick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ItemSoulTorchBlockOnRightClick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ItemSoulTorchBlockOnRightClick!");
			return;
		}
		EnumFacing direction = (EnumFacing) dependencies.get("direction");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((direction.getOpposite()) == EnumFacing.DOWN)) {
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockBlockSoulTorch.block.getDefaultState(), 3);
				world.playSound((EntityPlayer) null, x, (y + 1), z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
						SoundCategory.NEUTRAL, (float) 3, (float) 1);
			}
		} else if (((direction.getOpposite()) == EnumFacing.NORTH)) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockBlockSoulTorchWall.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, (z + 1),
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
						SoundCategory.NEUTRAL, (float) 3, (float) 1);
			}
		} else if (((direction.getOpposite()) == EnumFacing.SOUTH)) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockBlockSoulTorchWall.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, x, y, (z - 1),
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
						SoundCategory.NEUTRAL, (float) 3, (float) 1);
			}
		} else if (((direction.getOpposite()) == EnumFacing.WEST)) {
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockBlockSoulTorchWall.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, (x + 1), y, z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
						SoundCategory.NEUTRAL, (float) 3, (float) 1);
			}
		} else if (((direction.getOpposite()) == EnumFacing.EAST)) {
			if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockBlockSoulTorchWall.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
				world.playSound((EntityPlayer) null, (x - 1), y, z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
						SoundCategory.NEUTRAL, (float) 3, (float) 1);
			}
		}
	}
}
