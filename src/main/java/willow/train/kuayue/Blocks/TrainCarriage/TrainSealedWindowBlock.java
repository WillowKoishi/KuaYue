package willow.train.kuayue.Blocks.TrainCarriage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TrainSealedWindowBlock extends PanelBlock25Side {

    public TrainSealedWindowBlock(Properties p_49795_) {
        super(p_49795_);
    }//8,0,6,19,32,8

    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(8,0,6,19,32,8));
    protected static final VoxelShape WEST_AABB = Shapes.or(Block.box(6,0,8,8,32,19));
    protected static final VoxelShape NORTH_AABB = Shapes.or(Block.box(-3,0,6,5,32,8));
    protected static final VoxelShape EAST_AABB = Shapes.or(Block.box(6,0,-3,8,32,5));


    protected static final VoxelShape SOUTH_AABB2 = Block.box(0, 0, 15, 32, 16, 17);
    protected static final VoxelShape EAST_AABB2 =Block.box(15, 0, -16, 17, 16, 16);
    protected static final VoxelShape NORTH_AABB2 = Block.box(-16, 0, -1, 16, 16, 1);
    protected static final VoxelShape WEST_AABB2 = Block.box(-1, 0, 0, 1, 16, 32);
    //"bottom"
    protected static final VoxelShape  SOUTH_AABB2_LH= Block.box(-16, 0, 15, 16, 16, 17);
    protected static final VoxelShape EAST_AABB2_LH = Block.box(15, 0, 0, 17, 16, 32);
    protected static final VoxelShape NORTH_AABB2_LH = Block.box(0, 0, -1, 32, 16, 1);
    protected static final VoxelShape WEST_AABB2_LH = Block.box(-1, 0, -16, 1, 16, 16);

    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {


            if(p_54372_.getValue(HINGE) == DoorHingeSide.LEFT){
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
            else{
                switch ((Direction) p_54372_.getValue(FACING)) {
                    case NORTH:
                        return NORTH_AABB2_LH;
                    case SOUTH:
                        return SOUTH_AABB2_LH;
                    case WEST:
                        return WEST_AABB2_LH;
                    case EAST:
                    default:
                        return EAST_AABB2_LH;
                }
            }
        }

}
