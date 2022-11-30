package willow.train.kuayue.Blocks.df11g;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Util.HorizontalBlockBase;

public class DF11GPanel3Wide extends HorizontalBlockBase {
    protected int mWide = 2;

    protected static final VoxelShape NORTH_AABB2 =Block.box(0, 0, -1, 16, 32, 1.25);
    protected static final VoxelShape EAST_AABB2 = Block.box(-1, 0, 0, 1.25, 32, 16);
    protected static final VoxelShape SOUTH_AABB2 =Block.box(0, 0, 14.75, 16, 32, 17);
    protected static final VoxelShape WEST_AABB2 = Block.box(14.75, 0, 0, 17, 32, 16);

    protected static final VoxelShape NORTH_AABB3 = Block.box(-16, 0, -0.25, 32, 16, 2);
    protected static final VoxelShape EAST_AABB3 = Block.box(14, 0, -16, 16.25, 16, 32);
    protected static final VoxelShape SOUTH_AABB3 = Block.box(-16, 0, 14, 32, 16, 16.25);
    protected static final VoxelShape WEST_AABB3 = Block.box(-0.25, 0, -16, 2, 16, 32);

    public DF11GPanel3Wide(Properties p_49795_,int wide) {
        super(p_49795_);
        mWide = wide;
    }
    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        if (mWide == 2) {
            switch ((Direction) p_54372_.getValue(FACING)) {
                case NORTH:
                    return NORTH_AABB2;
                case SOUTH:
                    return SOUTH_AABB2;
                case WEST:
                    return WEST_AABB2;
                case EAST:
                default:
                    return EAST_AABB2;
            }
        }else{
            switch ((Direction) p_54372_.getValue(FACING)) {
                case NORTH:
                    return NORTH_AABB3;
                case SOUTH:
                    return SOUTH_AABB3;
                case WEST:
                    return WEST_AABB3;
                case EAST:
                default:
                    return EAST_AABB3;
            }
        }
    }
}
