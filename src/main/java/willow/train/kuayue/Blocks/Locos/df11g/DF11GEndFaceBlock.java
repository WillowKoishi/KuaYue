package willow.train.kuayue.Blocks.Locos.df11g;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Blocks.TrainCarriage.TrainPanelBlock;

public class DF11GEndFaceBlock extends TrainPanelBlock {
    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(-1, -16, 15, 17, -15, 24),
            Block.box(14, -16, 15, 32, 21, 24),
            Block.box(-16, -16, 15, 2, 21, 24),
            Block.box(-1, 20, 15, 17, 26, 24));
    protected static final VoxelShape NORTH_AABB =Shapes.or(Block.box(-1, -16, -8, 17, -15, 1),
            Block.box(-16, -16, -8, 2, 21, 1),
            Block.box(14, -16, -8, 32, 21, 1),
            Block.box(-1, 20, -8, 17, 26, 1));
    protected static final VoxelShape WEST_AABB =Shapes.or(Block.box(-8, -16, -1, 1, -15, 17),
            Block.box(-8, -16, 14, 1, 21, 32),
            Block.box(-8, -16, -16, 1, 21, 2),
            Block.box(-8, 20, -1, 1, 26, 17));
    protected static final VoxelShape EAST_AABB =Shapes.or( Block.box(15, -16, -1, 24, -15, 17),
            Block.box(15, -16, -16, 24, 21, 2),
            Block.box(15, -16, 14, 24, 21, 32),
            Block.box(15, 20, -1, 24, 26, 17));


    public DF11GEndFaceBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch (pState.getValue(FACING)){
            case SOUTH :
                return SOUTH_AABB;

            case NORTH:
                return NORTH_AABB;

            case WEST:
                return WEST_AABB;
            case EAST:
            default:
                return EAST_AABB;
        }
    }

    @Override
    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        return Block.box(0, 0, 0, 16, 16, 16);
    }
}
