package willow.train.kuayue.Blocks.Locos.df11g;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Util.HorizontalBlockBase;

public class DF11GCarportBlock extends HorizontalBlockBase {
    protected int mWide = 1;
    protected static final VoxelShape SOUTH_AABB1 = Shapes.or(Block.box(0, 0, 0, 16, 8, 16), Block.box(0, 8, 8, 16, 16, 16));
    protected static final VoxelShape WEST_AABB1 = Shapes.or(Block.box(0, 0, 0, 16, 8, 16), Block.box(8, 8, 0, 16, 16, 16));
    protected static final VoxelShape NORTH_AABB1 = Shapes.or(Block.box(0, 0, 0, 16, 8, 16), Block.box(0, 8, 0, 16, 16, 8));
    protected static final VoxelShape EAST_AABB1 = Shapes.or(Block.box(0, 0, 0, 16, 8, 16), Block.box(0, 8, 0, 8, 16, 16));


    protected static final VoxelShape SOUTH_AABB2 = Shapes.or(Block.box(-16, 0, 0, 32, 8, 16), Block.box(-16, 8, 8, 32, 16, 16));
    protected static final VoxelShape WEST_AABB2 = Shapes.or(Block.box(0, 0, -16, 16, 8, 32), Block.box(0, 8, -16, 8, 16, 32));
    protected static final VoxelShape NORTH_AABB2 = Shapes.or(Block.box(-16, 0, 0, 32, 8, 16), Block.box(-16, 8, 0, 32, 16, 8));
    protected static final VoxelShape EAST_AABB2 = Shapes.or(Block.box(8, 8, -16, 16, 16, 32), Block.box(0, 0, -16, 16, 8, 32));


    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        if(mWide ==1) {
            switch ((Direction) p_54372_.getValue(FACING)) {
                case NORTH:
                    return NORTH_AABB1;
                case SOUTH:
                    return SOUTH_AABB1;
                case WEST:
                    return WEST_AABB1;
                case EAST:
                default:
                    return EAST_AABB1;
            }
        }
        else{
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
        }
    }
    public DF11GCarportBlock(Properties p_49795_,int wide) {
        super(p_49795_);
        mWide = wide;
    }
}
