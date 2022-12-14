package willow.train.kuayue.Blocks.TrainCarriage;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import org.jetbrains.annotations.Nullable;

public class TrainAirConditionerBlock extends CarPortBlockBGKZ {

    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    //bottom-> right  top-> left   both->both


    public TrainAirConditionerBlock(Properties pProperties) {
        super(pProperties);
    }

protected void connectTo(BlockPlaceContext pContext){
    BlockPos blockpos = pContext.getClickedPos();
    LevelReader levelreader = pContext.getLevel();

    BlockPos blockpos1 = blockpos.north();
    BlockPos blockpos2 = blockpos.east();
    BlockPos blockpos3 = blockpos.south();
    BlockPos blockpos4 = blockpos.west();

    BlockState NblockstateN = levelreader.getBlockState(blockpos1);
    BlockState EblockstateE = levelreader.getBlockState(blockpos2);
    BlockState SblockstateS = levelreader.getBlockState(blockpos3);
    BlockState WblockstateW = levelreader.getBlockState(blockpos4);

    //Direction THIS_FACING =
}
protected boolean isTACB(BlockState blockState){
        return blockState.getBlock() instanceof TrainAirConditionerBlock;
}
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return super.getStateForPlacement(pContext);

    }

    @Override
    public void onNeighborChange(BlockState state, LevelReader level, BlockPos pos, BlockPos neighbor) {
        super.onNeighborChange(state, level, pos, neighbor);
    }
}
