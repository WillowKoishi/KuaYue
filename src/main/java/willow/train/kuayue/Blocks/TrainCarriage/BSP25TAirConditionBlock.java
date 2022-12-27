package willow.train.kuayue.Blocks.TrainCarriage;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BSP25TAirConditionBlock extends TrainPanelBlock {
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape NORTH_AABB = Block.box(-16, 0, -3, 32, 8, 32);
    protected static final VoxelShape WEST_AABB = Block.box(-3, 0, -16, 32, 8, 32);
    protected static final VoxelShape SOUTH_AABB = Block.box(-32, 0, -16, 16, 8, 16);
    protected static final VoxelShape EAST_AABB = Block.box(-16, 0, -16, 19, 8, 32);
protected static  final VoxelShape ALLAABB = Block.box(-16, 8, -16, 32, 16, 32);
    public BSP25TAirConditionBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
//        switch((Direction)p_54372_.getValue(FACING)) {
//            case NORTH:
//                return NORTH_AABB;
//            case SOUTH:
//                return SOUTH_AABB;
//            case WEST:
//                return WEST_AABB;
//            case EAST:
//            default:
//                return EAST_AABB;
//        }
//    }
        return Block.box(-16, 0, -16, 32, 8, 32);
    }
}
