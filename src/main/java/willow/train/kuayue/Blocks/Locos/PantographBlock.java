package willow.train.kuayue.Blocks.Locos;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class PantographBlock extends TrapDoorBlock {
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(0, 0, 0, 16, 1, 19),
            Block.box(6.5, 1, -2, 9.5, 16, 11),
            Block.box(2.5, 16, -2, 13.5, 24, 6),
            Block.box(-2.5, 24, 6, 18.5, 32, 13));
    protected static final VoxelShape WEST_AABB = Shapes.or(Block.box(-3, 0, 0, 16, 1, 16),
            Block.box(5, 1, 6.5, 18, 16, 9.5),
            Block.box(10, 16, 2.5, 18, 24, 13.5),
            Block.box(3, 24, -2.5, 10, 32, 18.5));
    protected static final VoxelShape NORTH_AABB = Shapes.or(
            Block.box(0, 0, -3, 16, 1, 16),
            Block.box(6.5, 1, 5, 9.5, 16, 18),
            Block.box(2.5, 16, 10, 13.5, 24, 18),
            Block.box(-2.5, 24, 3, 18.5, 32, 10));
    protected static final VoxelShape EAST_AABB = Shapes.or(Block.box(0, 0, 0, 19, 1, 16),
            Block.box(-2, 1, 6.5, 11, 16, 9.5),
            Block.box(-2, 16, 2.5, 6, 24, 13.5),
            Block.box(6, 24, -2.5, 13, 32, 18.5));

    public PantographBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)).setValue(HALF, Half.BOTTOM).setValue(POWERED, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)));

    }


    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
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
        } else {
            return Block.box(0, 0, 0, 16, 8, 16);
        }
    }

    @Override
    public @NotNull VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
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
        } else {
            return Block.box(0, 0, 0, 16, 8, 16);
        }
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

    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }


}
