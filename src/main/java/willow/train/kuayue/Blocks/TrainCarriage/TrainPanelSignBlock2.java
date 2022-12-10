package willow.train.kuayue.Blocks.TrainCarriage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import willow.train.kuayue.Blocks.Entities.TrainPanelSignBlockEntities;

public class TrainPanelSignBlock2 extends StandingSignBlock {

    public TrainPanelSignBlock2(Properties p_56990_, WoodType p_56991_) {
        super(p_56990_, p_56991_);
   }



    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());
        Direction facing =  pContext.getHorizontalDirection();
        int rotate16 = switch (facing) {
            case NORTH -> 0;
            case EAST -> 4;
            case SOUTH -> 8;
            case WEST -> 12;
            default -> 0;
        };
        return this.defaultBlockState().setValue(ROTATION,rotate16) //Mth.floor((double) ((180.0F + pContext.getRotation()) * 16.0F / 360.0F) + 0.5D) & 15)
                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new TrainPanelSignBlockEntities(pPos, pState);
    }
}
