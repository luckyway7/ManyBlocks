package net.mcreator.manyblocks.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

import net.mcreator.manyblocks.item.ItemToolNetheriteAxe;
import net.mcreator.manyblocks.block.BlockBlockStrippedSpruceLog;
import net.mcreator.manyblocks.block.BlockBlockStrippedOakLog;
import net.mcreator.manyblocks.block.BlockBlockStrippedJungleLog;
import net.mcreator.manyblocks.block.BlockBlockStrippedDarkOakLog;
import net.mcreator.manyblocks.block.BlockBlockStrippedBirchLog;
import net.mcreator.manyblocks.block.BlockBlockStrippedAcaciaLog;
import net.mcreator.manyblocks.ElementsManyblocksMod;

import java.util.Random;
import java.util.Map;

@ElementsManyblocksMod.ModElement.Tag
public class ProcedureProcedureLogStripped extends ElementsManyblocksMod.ModElement {
	public ProcedureProcedureLogStripped(ElementsManyblocksMod instance) {
		super(instance, 147);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ProcedureLogStripped!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ProcedureLogStripped!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ProcedureLogStripped!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ProcedureLogStripped!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ProcedureLogStripped!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		String varAxis = "";
		double isDone = 0;
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.WOODEN_AXE, (int) (1)).getItem())
				|| (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.STONE_AXE, (int) (1)).getItem()))
				|| (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.IRON_AXE, (int) (1)).getItem())
						|| (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Items.GOLDEN_AXE, (int) (1)).getItem()))
						|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(Items.DIAMOND_AXE, (int) (1)).getItem())
								|| (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == new ItemStack(ItemToolNetheriteAxe.block, (int) (1)).getItem()))))) {
			varAxis = (String) (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) + "" + (""));
			isDone = (double) 0;
			if (((varAxis).contains("minecraft:log"))) {
				if (((varAxis).contains("variant=oak"))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockStrippedOakLog.block.getDefaultState(), 3);
					isDone = (double) 1;
				} else if (((varAxis).contains("variant=spruce"))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockStrippedSpruceLog.block.getDefaultState(), 3);
					isDone = (double) 1;
				} else if (((varAxis).contains("variant=birch"))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockStrippedBirchLog.block.getDefaultState(), 3);
					isDone = (double) 1;
				} else if (((varAxis).contains("variant=jungle"))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockStrippedJungleLog.block.getDefaultState(), 3);
					isDone = (double) 1;
				} else if (((varAxis).contains("variant=acacia"))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockStrippedAcaciaLog.block.getDefaultState(), 3);
					isDone = (double) 1;
				} else if (((varAxis).contains("variant=dark_oak"))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBlockStrippedDarkOakLog.block.getDefaultState(), 3);
					isDone = (double) 1;
				}
				if (((isDone) == 1)) {
					if (((varAxis).contains("axis=y"))) {
						try {
							IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing")) {
									world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
											_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
									break;
								}
							}
						} catch (Exception e) {
						}
					} else if (((varAxis).contains("axis=x"))) {
						try {
							IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing")) {
									world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
											_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
									break;
								}
							}
						} catch (Exception e) {
						}
					} else if (((varAxis).contains("axis=z"))) {
						try {
							IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing")) {
									world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
											_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
									break;
								}
							}
						} catch (Exception e) {
						}
					}
					world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
							.getObject(new ResourceLocation("manyblocks:stripped_log")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					{
						ItemStack _ist = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setItemDamage(0);
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		EntityPlayer entity = event.getEntityPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
