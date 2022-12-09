package willow.train.kuayue.Blocks.TrainCarriage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class Train25GLadderBlock extends TrapDoorBlock {
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;



    public Train25GLadderBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)).setValue(HALF, Half.BOTTOM).setValue(POWERED, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)));

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
//    private boolean canAttachTo(BlockGetter pBlockReader, BlockPos pPos, Direction pDirection) {
//        BlockState blockstate = pBlockReader.getBlockState(pPos);
//        return blockstate.isFaceSturdy(pBlockReader, pPos, pDirection);
//    }




//    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
//        return true;
//    }

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

    private Half getHinge(BlockPlaceContext pContext) {
        BlockGetter blockgetter = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        Direction direction = pContext.getHorizontalDirection();
        BlockPos blockpos1 = blockpos.above();
        Direction direction1 = direction.getCounterClockWise();
        BlockPos blockpos2 = blockpos.relative(direction1);
        BlockState blockstate = blockgetter.getBlockState(blockpos2);
        BlockPos blockpos3 = blockpos1.relative(direction1);
        BlockState blockstate1 = blockgetter.getBlockState(blockpos3);
        Direction direction2 = direction.getClockWise();
        BlockPos blockpos4 = blockpos.relative(direction2);
        BlockState blockstate2 = blockgetter.getBlockState(blockpos4);
        BlockPos blockpos5 = blockpos1.relative(direction2);
        BlockState blockstate3 = blockgetter.getBlockState(blockpos5);
        int i = (blockstate.isCollisionShapeFullBlock(blockgetter,
                blockpos2) ? -1 : 0) + (blockstate1.isCollisionShapeFullBlock(blockgetter, blockpos3) ? -1 : 0)
                + (blockstate2.isCollisionShapeFullBlock(blockgetter, blockpos4) ? 1 : 0)
                + (blockstate3.isCollisionShapeFullBlock(blockgetter, blockpos5) ? 1 : 0);
        //boolean flag = blockstate.is(this) && blockstate.getValue(HALF) == DoubleBlockHalf.LOWER;
        //boolean flag1 = blockstate2.is(this) && blockstate2.getValue(HALF) == DoubleBlockHalf.LOWER;
        if (i <= 0) {
            if (i >= 0) {
                int j = direction.getStepX();
                int k = direction.getStepZ();
                Vec3 vec3 = pContext.getClickLocation();
                double d0 = vec3.x - (double) blockpos.getX();
                double d1 = vec3.z - (double) blockpos.getZ();
                return (j >= 0 || !(d1 < 0.5D)) && (j <= 0 || !(d1 > 0.5D)) && (k >= 0 || !(d0 > 0.5D)) && (k <= 0 || !(d0 < 0.5D)) ? Half.BOTTOM : Half.TOP;
            } else {
                return Half.BOTTOM;
            }
        } else {
            return Half.TOP;
        }
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection())
                .setValue(HALF, this.getHinge(pContext)).setValue(OPEN,false).setValue(POWERED,false)
                .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
    }



    @Override
    public void setPlacedBy(Level pLevel, BlockPos pPos, BlockState pState, LivingEntity pPlacer, ItemStack pStack) {
        //pLevel.setBlock(pPos.above(), pState.setValue(HALF, DoubleBlockHalf.UPPER), 3);
    }

@Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {

            pState = pState.cycle(OPEN);
            pLevel.setBlock(pPos, pState, 10);
            //pLevel.levelEvent(pPlayer, pState.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pPos, 0);
            pLevel.gameEvent(pPlayer, this.isOpen(pState) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pPos);
            return InteractionResult.sidedSuccess(pLevel.isClientSide);

    }

    public boolean isOpen(BlockState pState) {
        return pState.getValue(OPEN);
    }

    public void setOpen(@Nullable Entity p_153166_, Level pLevel, BlockState pState, BlockPos pPos, boolean pOpen) {
        if (pState.is(this) && pState.getValue(OPEN) != pOpen) {
            pLevel.setBlock(pPos, pState.setValue(OPEN, Boolean.valueOf(pOpen)), 10);
            //this.playSound(pLevel, pPos, pOpen);
            pLevel.gameEvent(p_153166_, pOpen ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pPos);
        }
    }


    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
//        DoubleBlockHalf doubleblockhalf = pState.getValue(HALF);
//        if (pFacing.getAxis() == Direction.Axis.Y && doubleblockhalf == DoubleBlockHalf.LOWER == (pFacing == Direction.UP)) {
//            return pFacingState.is(this) && pFacingState.getValue(HALF) != doubleblockhalf ? pState.setValue(FACING, pFacingState.getValue(FACING)).setValue(OPEN, pFacingState.getValue(OPEN)).setValue(HINGE, pFacingState.getValue(HINGE)).setValue(POWERED, pFacingState.getValue(POWERED)) : Blocks.AIR.defaultBlockState();
//        } else {
//            return doubleblockhalf == DoubleBlockHalf.LOWER && pFacing == Direction.DOWN && !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
//        }

        return pState;
    }
//    public BlockState mirror(BlockState pState, Mirror pMirror) {
//        return pMirror == Mirror.NONE ? pState : pState.rotate(pMirror.getRotation(pState.getValue(FACING))).cycle(HINGE);
//    }

    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }
//    @Override
//    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos, boolean pIsMoving) {
//
//    }
//    @Override
//    public PushReaction getPistonPushReaction(BlockState pState) {
//        return PushReaction.PUSH_ONLY;
//    }
//    @Override
//    public void playerWillDestroy(Level pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
////        if (!pLevel.isClientSide && pPlayer.isCreative()) {
////            DoublePlantBlock.preventCreativeDropFromBottomPart(pLevel, pPos, pState, pPlayer);
////        }
//
//        super.playerWillDestroy(pLevel, pPos, pState, pPlayer);
//    }
}
