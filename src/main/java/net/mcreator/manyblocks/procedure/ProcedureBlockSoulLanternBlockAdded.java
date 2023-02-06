package net.mcreator.manyblocks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.manyblocks.block.BlockBlockSoulLanternUp;
import net.mcreator.manyblocks.block.BlockBlockSoulLantern;
import net.mcreator.manyblocks.block.BlockBlockLanternUp;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Map;

@ElementsManyblocksMod.ModElement.Tag
public class ProcedureBlockSoulLanternBlockAdded extends ElementsManyblocksMod.ModElement {
	public ProcedureBlockSoulLanternBlockAdded(ElementsManyblocksMod instance) {
		super(instance, 156);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BlockSoulLanternBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BlockSoulLanternBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BlockSoulLanternBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BlockSoulLanternBlockAdded!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockBlockLanternUp.block.getDefaultState()
					.getBlock()))
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockBlockSoulLanternUp.block
							.getDefaultState().getBlock())))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockSoulLanternUp.block.getDefaultState(), 3);
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockSoulLantern.block.getDefaultState(), 3);
			}
		}
	}
}
