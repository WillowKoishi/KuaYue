package willow.train.kuayue.Blocks.df11g;

import com.simibubi.create.content.contraptions.base.HorizontalKineticBlock;
import com.simibubi.create.foundation.block.ITE;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import willow.train.kuayue.Blocks.Entities.DF11GFrontTileEntity;
import willow.train.kuayue.init.KYCreateEntities;

public class DF11GFrontBlock extends HorizontalKineticBlock implements ITE<DF11GFrontTileEntity> {


    public DF11GFrontBlock(Properties properties) {
        super(properties);
    }



    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
        DF11GFrontTileEntity df1fte = getCrafter(pLevel, pPos);
        if(df1fte!= null) {
            pLevel.removeBlockEntity(pPos);
        }
    }
    public static DF11GFrontTileEntity getCrafter(BlockAndTintGetter reader, BlockPos pos) {
        BlockEntity te = reader.getBlockEntity(pos);
        if (!(te instanceof DF11GFrontTileEntity))
            return null;
        return (DF11GFrontTileEntity) te;
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return state.getValue(HORIZONTAL_FACING).getAxis();
    }

    @Override
    public Class<DF11GFrontTileEntity> getTileEntityClass() {
        return DF11GFrontTileEntity.class;
    }

    @Override
    public BlockEntityType<? extends DF11GFrontTileEntity> getTileEntityType() {
        return KYCreateEntities.DF11G_FRONT.get();
    }
}
