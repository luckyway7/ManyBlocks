package net.mcreator.manyblocks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.Entity;

import net.mcreator.manyblocks.block.BlockBlockTarget;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Map;

@ElementsManyblocksMod.ModElement.Tag
public class ProcedureBlockTargetArrowOnCollides extends ElementsManyblocksMod.ModElement {
	public ProcedureBlockTargetArrowOnCollides(ElementsManyblocksMod instance) {
		super(instance, 136);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlockTargetArrowOnCollides!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BlockTargetArrowOnCollides!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BlockTargetArrowOnCollides!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BlockTargetArrowOnCollides!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BlockTargetArrowOnCollides!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity instanceof EntityArrow) == (true))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.REDSTONE_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockTarget.block.getDefaultState(), 3);
		}
	}
}
