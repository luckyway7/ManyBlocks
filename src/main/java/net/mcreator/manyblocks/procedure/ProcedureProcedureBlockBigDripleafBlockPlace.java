package net.mcreator.manyblocks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

import net.mcreator.manyblocks.block.BlockBlockBigDripleafStem;
import net.mcreator.manyblocks.block.BlockBlockBigDripleaf;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Map;

@ElementsManyblocksMod.ModElement.Tag
public class ProcedureProcedureBlockBigDripleafBlockPlace extends ElementsManyblocksMod.ModElement {
	public ProcedureProcedureBlockBigDripleafBlockPlace(ElementsManyblocksMod instance) {
		super(instance, 145);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ProcedureBlockBigDripleafBlockPlace!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ProcedureBlockBigDripleafBlockPlace!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ProcedureBlockBigDripleafBlockPlace!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ProcedureBlockBigDripleafBlockPlace!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockBlockBigDripleaf.block.getDefaultState()
				.getBlock())) {
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.withProperty((PropertyDirection) prop, (new Object() {
							public EnumFacing getEnumFacing(BlockPos pos) {
								try {
									IBlockState _bs = world.getBlockState(pos);
									for (IProperty<?> prop : _bs.getProperties().keySet()) {
										if (prop.getName().equals("facing"))
											return _bs.getValue((PropertyDirection) prop);
									}
									return EnumFacing.NORTH;
								} catch (Exception e) {
									return EnumFacing.NORTH;
								}
							}
						}.getEnumFacing(new BlockPos((int) x, (int) (y - 1), (int) z)))), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlockBlockBigDripleafStem.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), _bs.withProperty((PropertyDirection) prop, (new Object() {
							public EnumFacing getEnumFacing(BlockPos pos) {
								try {
									IBlockState _bs = world.getBlockState(pos);
									for (IProperty<?> prop : _bs.getProperties().keySet()) {
										if (prop.getName().equals("facing"))
											return _bs.getValue((PropertyDirection) prop);
									}
									return EnumFacing.NORTH;
								} catch (Exception e) {
									return EnumFacing.NORTH;
								}
							}
						}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z)))), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
	}
}
