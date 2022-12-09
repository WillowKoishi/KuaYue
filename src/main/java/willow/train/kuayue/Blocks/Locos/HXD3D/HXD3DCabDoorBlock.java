package willow.train.kuayue.Blocks.Locos.HXD3D;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Blocks.TrainCarriage.TrainDoorBlock;

public class HXD3DCabDoorBlock extends TrainDoorBlock {
    public HXD3DCabDoorBlock(Properties pProperties) {
        super(pProperties);
    }
    protected static final VoxelShape SOUTH_AABB1 = Block.box(0, 0, 15.5, 16, 16, 16.5);
    protected static final VoxelShape EAST_AABB1 = Block.box(15.5, 0, 0, 16.5, 16, 16);
    protected static final VoxelShape NORTH_AABB1 = Block.box(0, 0, -0.5, 16, 16, 0.5);
    protected static final VoxelShape WEST_AABB1 = Block.box(-0.5, 0, 0, 0.5, 16, 16);

    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(12, 0, 15.5, 16, 14.75, 16.5), Block.box(0, 0, 15.5, 5, 14.75, 16.5));
    protected static final VoxelShape NORTH_AABB = Shapes.or(Block.box(0, 0, -0.5, 4, 14.75, 0.5), Block.box(11, 0, -0.5, 16, 14.75, 0.5));

    protected static final VoxelShape EAST_AABB = Shapes.or(Block.box(-0.5, 0, 12, 0.5, 14.75, 16), Block.box(-0.5, 0, 0, 0.5, 14.75, 5));

    protected static final VoxelShape WEST_AABB = Shapes.or(Block.box(15.5, 0, 0, 16.5, 14.75, 4), Block.box(15.5, 0, 11, 16.5, 14.75, 16));

    protected static final VoxelShape EAST_AABB2=Shapes.or(Block.box(-0.5, 0, 15, 0.5, 14.75, 16),
            Block.box(-0.5, 0, 0, 0.5, 14.75, 1));
    protected static final VoxelShape WEST_AABB2=Shapes.or(Block.box(15.5, 0, 15, 16.5, 14.75, 16), Block.box(15.5, 0, 0, 16.5, 14.75, 1));
    protected static final VoxelShape SOUTH_AABB2=Shapes.or(Block.box(0, 0, -0.5, 1, 14.75, 0.5), Block.box(15, 0, -0.5, 16, 14.75, 0.5));
    protected static final VoxelShape NORTH_AABB2=Shapes.or(Block.box(15, 0, 15.5, 16, 14.75, 16.5), Block.box(0, 0, 15.5, 1, 14.75, 16.5));
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {

        if (pState.getValue(OPEN)) {
            switch (pState.getValue(FACING)) {
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
        }else {
            switch (pState.getValue(FACING)) {
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

    }

    @Override
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (pState.getValue(OPEN)) {
            switch (pState.getValue(FACING)) {
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
        }else {
            switch (pState.getValue(FACING)) {
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
    }
}
