package willow.train.kuayue.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Util.HorizontalBlockBase;

public class Train25GLadderBlock extends HorizontalBlockBase {
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public Train25GLadderBlock(Properties p_49795_) {


        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(0.5, 0, 0.5, 15, 1, 9),
            Block.box(0.5, 6, 5.5, 15, 7, 12.5),
            Block.box(0.5, 12, 10.5, 15, 13, 15.5),
            Block.box(15.25, 13.75, 2.25, 16, 16, 16),
            Block.box(15.25, 9.5, 12, 16, 11.25, 14.25),
            Block.box(15.25, 4.25, 2.25, 16, 13.75, 12),
            Block.box(15.25, 0, 1, 16, 2.25, 10.25),
            Block.box(15.25, 2, 1.75, 16, 4.25, 11),
            Block.box(15.25, 7.25, 12, 16, 9.5, 13.25),
            Block.box(15.25, 11.25, 12, 16, 13.75, 15),
            Block.box(13.5, 10, 1, 16, 16, 2.5),
            Block.box(0, 10, 1, 2.5, 16, 2.5),
            Block.box(0, 13.75, 2.25, 0.75, 16, 16),
            Block.box(0, 4.25, 2.25, 0.75, 13.75, 12),
            Block.box(0, 11.25, 12, 0.75, 13.75, 15),
            Block.box(0, 2, 1.75, 0.75, 4.25, 11),
            Block.box(0, 0, 1, 0.75, 2.25, 10.25),
            Block.box(0, 7.25, 12, 0.75, 9.5, 13.25),
            Block.box(0, 9.5, 12, 0.75, 11.25, 14.25));
    protected static final VoxelShape WEST_AABB = Shapes.or(Block.box(7, 0, 0.5, 15.5, 1, 15),
            Block.box(3.5, 6, 0.5, 10.5, 7, 15),
            Block.box(0.5, 12, 0.5, 5.5, 13, 15),
            Block.box(0, 13.75, 15.25, 13.75, 16, 16),
            Block.box(1.75, 9.5, 15.25, 4, 11.25, 16),
            Block.box(4, 4.25, 15.25, 13.75, 13.75, 16),
            Block.box(5.75, 0, 15.25, 15, 2.25, 16),
            Block.box(5, 2, 15.25, 14.25, 4.25, 16),
            Block.box(2.75, 7.25, 15.25, 4, 9.5, 16),
            Block.box(1, 11.25, 15.25, 4, 13.75, 16),
            Block.box(13.5, 10, 13.5, 15, 16, 16),
            Block.box(13.5, 10, 0, 15, 16, 2.5),
            Block.box(0, 13.75, 0, 13.75, 16, 0.75),
            Block.box(4, 4.25, 0, 13.75, 13.75, 0.75),
            Block.box(1, 11.25, 0, 4, 13.75, 0.75),
            Block.box(5, 2, 0, 14.25, 4.25, 0.75),
            Block.box(5.75, 0, 0, 15, 2.25, 0.75),
            Block.box(2.75, 7.25, 0, 4, 9.5, 0.75),
            Block.box(1.75, 9.5, 0, 4, 11.25, 0.75));
    protected static final VoxelShape NORTH_AABB = Shapes.or(Block.box(1, 0, 7, 15.5, 1, 15.5),
            Block.box(1, 6, 3.5, 15.5, 7, 10.5),
            Block.box(1, 12, 0.5, 15.5, 13, 5.5),
            Block.box(0, 13.75, 0, 0.75, 16, 13.75),
            Block.box(0, 9.5, 1.75, 0.75, 11.25, 4),
            Block.box(0, 4.25, 4, 0.75, 13.75, 13.75),
            Block.box(0, 0, 5.75, 0.75, 2.25, 15),
            Block.box(0, 2, 5, 0.75, 4.25, 14.25),
            Block.box(0, 7.25, 2.75, 0.75, 9.5, 4),
            Block.box(0, 11.25, 1, 0.75, 13.75, 4),
            Block.box(0, 10, 13.5, 2.5, 16, 15),
            Block.box(13.5, 10, 13.5, 16, 16, 15),
            Block.box(15.25, 13.75, 0, 16, 16, 13.75),
            Block.box(15.25, 4.25, 4, 16, 13.75, 13.75),
            Block.box(15.25, 11.25, 1, 16, 13.75, 4),
            Block.box(15.25, 2, 5, 16, 4.25, 14.25),
            Block.box(15.25, 0, 5.75, 16, 2.25, 15),
            Block.box(15.25, 7.25, 2.75, 16, 9.5, 4),
            Block.box(15.25, 9.5, 1.75, 16, 11.25, 4));
    protected static final VoxelShape EAST_AABB = Shapes.or(Block.box(0.5, 0, 1, 9, 1, 15.5),
            Block.box(5.5, 6, 1, 12.5, 7, 15.5),
            Block.box(10.5, 12, 1, 15.5, 13, 15.5),
            Block.box(2.25, 13.75, 0, 16, 16, 0.75),
            Block.box(12, 9.5, 0, 14.25, 11.25, 0.75),
            Block.box(2.25, 4.25, 0, 12, 13.75, 0.75),
            Block.box(1, 0, 0, 10.25, 2.25, 0.75),
            Block.box(1.75, 2, 0, 11, 4.25, 0.75),
            Block.box(12, 7.25, 0, 13.25, 9.5, 0.75),
            Block.box(12, 11.25, 0, 15, 13.75, 0.75),
            Block.box(1, 10, 0, 2.5, 16, 2.5),
            Block.box(1, 10, 13.5, 2.5, 16, 16),
            Block.box(2.25, 13.75, 15.25, 16, 16, 16),
            Block.box(2.25, 4.25, 15.25, 12, 13.75, 16),
            Block.box(12, 11.25, 15.25, 15, 13.75, 16),
            Block.box(1.75, 2, 15.25, 11, 4.25, 16),
            Block.box(1, 0, 15.25, 10.25, 2.25, 16),
            Block.box(12, 7.25, 15.25, 13.25, 9.5, 16),
            Block.box(12, 9.5, 15.25, 14.25, 11.25, 16));
    private boolean canAttachTo(BlockGetter pBlockReader, BlockPos pPos, Direction pDirection) {
        BlockState blockstate = pBlockReader.getBlockState(pPos);
        return blockstate.isFaceSturdy(pBlockReader, pPos, pDirection);
    }

    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return true;
    }

    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        switch ((Direction) p_54372_.getValue(FACING)) {
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

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState blockstate1 = this.defaultBlockState();
        blockstate1 = blockstate1.setValue(FACING, pContext.getHorizontalDirection());
        return blockstate1;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

}
