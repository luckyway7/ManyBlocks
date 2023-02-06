package net.mcreator.manyblocks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.manyblocks.block.BlockBlockRespawnAnchorTwoStageActive;
import net.mcreator.manyblocks.block.BlockBlockRespawnAnchorThreeStageActive;
import net.mcreator.manyblocks.block.BlockBlockRespawnAnchorOneStageActive;
import net.mcreator.manyblocks.block.BlockBlockRespawnAnchorFourStageActive;
import net.mcreator.manyblocks.block.BlockBlockRespawnAnchor;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Map;

@ElementsManyblocksMod.ModElement.Tag
public class ProcedureBlockRespawnAnchorOnBlockRightClicked extends ElementsManyblocksMod.ModElement {
	public ProcedureBlockRespawnAnchorOnBlockRightClicked(ElementsManyblocksMod instance) {
		super(instance, 172);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlockRespawnAnchorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BlockRespawnAnchorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BlockRespawnAnchorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BlockRespawnAnchorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BlockRespawnAnchorOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.GLOWSTONE, (int) (1)).getItem())) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockBlockRespawnAnchor.block.getDefaultState()
					.getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockRespawnAnchorOneStageActive.block.getDefaultState(), 3);
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("manyblocks:respawn_anchor_charge")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockBlockRespawnAnchorOneStageActive.block
					.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockRespawnAnchorTwoStageActive.block.getDefaultState(), 3);
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("manyblocks:respawn_anchor_charge")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockBlockRespawnAnchorTwoStageActive.block
					.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockRespawnAnchorThreeStageActive.block.getDefaultState(), 3);
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("manyblocks:respawn_anchor_charge")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockBlockRespawnAnchorThreeStageActive.block
					.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockRespawnAnchorFourStageActive.block.getDefaultState(), 3);
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("manyblocks:respawn_anchor_charge")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockBlockRespawnAnchorFourStageActive.block
					.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				if (!world.isRemote) {
					world.createExplosion(null, (int) x, (int) y, (int) z, (float) 6, true);
				}
			}
		}
	}
}
