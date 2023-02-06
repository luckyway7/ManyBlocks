package net.mcreator.manyblocks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.manyblocks.block.BlockBlockBigDripleafStem;
import net.mcreator.manyblocks.block.BlockBlockBigDripleaf;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Map;

@ElementsManyblocksMod.ModElement.Tag
public class ProcedureProcedureBlockBigDripleafBlockDestroyed extends ElementsManyblocksMod.ModElement {
	public ProcedureProcedureBlockBigDripleafBlockDestroyed(ElementsManyblocksMod instance) {
		super(instance, 146);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ProcedureBlockBigDripleafBlockDestroyed!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ProcedureBlockBigDripleafBlockDestroyed!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ProcedureBlockBigDripleafBlockDestroyed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ProcedureBlockBigDripleafBlockDestroyed!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double whileY = 0;
		double whileY_UP = 0;
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockBlockBigDripleafStem.block.getDefaultState()
				.getBlock())) {
			whileY = (double) (y - 1);
			while (((world.getBlockState(new BlockPos((int) x, (int) (whileY), (int) z))).getBlock() == BlockBlockBigDripleafStem.block
					.getDefaultState().getBlock())) {
				world.destroyBlock(new BlockPos((int) x, (int) (whileY), (int) z), false);
				whileY = (double) ((whileY) - 1);
			}
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockBlockBigDripleafStem.block.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockBlockBigDripleaf.block.getDefaultState()
						.getBlock()))) {
			whileY_UP = (double) (y + 1);
			while ((((world.getBlockState(new BlockPos((int) x, (int) (whileY_UP), (int) z))).getBlock() == BlockBlockBigDripleafStem.block
					.getDefaultState().getBlock())
					|| ((world.getBlockState(new BlockPos((int) x, (int) (whileY_UP), (int) z))).getBlock() == BlockBlockBigDripleaf.block
							.getDefaultState().getBlock()))) {
				world.destroyBlock(new BlockPos((int) x, (int) (whileY_UP), (int) z), false);
				whileY_UP = (double) ((whileY_UP) + 1);
			}
		}
	}
}
