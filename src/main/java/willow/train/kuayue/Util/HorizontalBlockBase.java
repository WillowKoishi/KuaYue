
package willow.train.kuayue.Util;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HorizontalBlockBase extends Block {
	protected static final Map<Block, Map<Direction, VoxelShape>> SHAPS = new HashMap<Block, Map<Direction, VoxelShape>>();
	public static final DirectionProperty HORIZENTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public HorizontalBlockBase(Properties p_49795_) {
		super(p_49795_);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
    public BlockState rotate(BlockState p_54360_, Rotation p_54361_) {
		return p_54360_.setValue(FACING, p_54361_.rotate(p_54360_.getValue(FACING)));
	}

	@Override
    public BlockState mirror(BlockState p_54357_, Mirror p_54358_) {
		return p_54357_.rotate(p_54358_.getRotation(p_54357_.getValue(FACING)));
	}

	@Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {

		// return
		// this.defaultBlockState().setValue(FACING,context.getHorizontalDirection().getOpposite());
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());

	}

	@Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_54370_) {
		p_54370_.add(FACING);
	}
}
