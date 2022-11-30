package willow.train.kuayue.Blocks.df11g;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Blocks.TrainPanelBlock;

public class DF11GCowcatcherBlock extends TrainPanelBlock {
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape NORTH_AABB = Block.box(-16, 9, -3, 32, 16.25, 32);
    protected static final VoxelShape WEST_AABB = Block.box(-3, 9, -16, 32, 16.25, 32);
    protected static final VoxelShape SOUTH_AABB = Block.box(-32, 9, -16, 16, 16.25, 19);
    protected static final VoxelShape EAST_AABB = Block.box(-16, 9, -16, 19, 16.25, 32);

    public DF11GCowcatcherBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        switch((Direction)p_54372_.getValue(FACING)) {
            case NORTH:
                return NORTH_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case WEST:
                return WEST_AABB;
            case EAST:
            default:
                return EAST_AABB;
        }
    }
}
