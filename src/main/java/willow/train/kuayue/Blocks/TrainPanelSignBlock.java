package willow.train.kuayue.Blocks;

import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import willow.train.kuayue.Blocks.Entities.TrainPanelSignBlockEntities;

public class TrainPanelSignBlock extends WallSignBlock {
    public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");

    public TrainPanelSignBlock(Properties p_56990_, WoodType p_56991_) {

        super(p_56990_, p_56991_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new TrainPanelSignBlockEntities(pPos, pState);
    }
//    public TrainPanelSignBlock(Properties pProperties, WoodType pType) {
//
//        super(pProperties, pType);
//        LOGGER.info("register Sign"+pType+pProperties);
//    }
//    @Override
//    public @NotNull String getDescriptionId() {
//        return this.getOrCreateDescriptionId();
//    }
@Override
public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
    return true;//pLevel.getBlockState(pPos.relative(pState.getValue(FACING).getOpposite())).getMaterial().isSolid();
}

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState blockstate = this.defaultBlockState();
        FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());
        LevelReader levelreader = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        Direction[] adirection = pContext.getNearestLookingDirections();

        for(Direction direction : adirection) {
            if (direction.getAxis().isHorizontal()) {
                Direction direction1 = direction.getOpposite();
                blockstate = blockstate.setValue(FACING, direction1);
                if (blockstate.canSurvive(levelreader, blockpos)) {
                    return blockstate.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
                }
            }
        }

        return null;
    }

//    @Override
//    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
//        return new TrainPanelSignBlockEntities(pPos,pState);
//    }
}
