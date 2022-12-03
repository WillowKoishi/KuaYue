package willow.train.kuayue.Blocks.df11g;

import com.simibubi.create.AllShapes;
import com.simibubi.create.content.contraptions.base.RotatedPillarKineticBlock;
import com.simibubi.create.foundation.block.ITE;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Blocks.Entities.BogeyEntities.DF11GBogeyTileEntity;
import willow.train.kuayue.init.KYCreateEntities;

public class FakeDF11GBogeyBlock extends RotatedPillarKineticBlock implements ITE<DF11GBogeyTileEntity> {

    String type, colour;
    protected FakeDF11GBogeyBlock(String material, String paint, Properties properties) {
        super(properties);
        type = material;
        colour = paint;
    }
    public static FakeDF11GBogeyBlock brass(String colour, Properties properties) {
        return new FakeDF11GBogeyBlock("brass", colour, properties);
    }


    @Override
    public Class<DF11GBogeyTileEntity> getTileEntityClass() {
        return DF11GBogeyTileEntity.class;
    }


    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return AllShapes.LARGE_GEAR.get(pState.getValue(AXIS));
    }

    @Override
    public BlockEntityType<? extends DF11GBogeyTileEntity> getTileEntityType() {
        return KYCreateEntities.fake_DF11G_BOGEY.get();
    }
    @Override
    public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
        return face.getAxis() == getRotationAxis(state);
    }
    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return state.getValue(AXIS);
    }
    @Override
    public float getParticleTargetRadius() {
        return 2f;
    }
    @Override
    public float getParticleInitialRadius() {
        return 1.75f;
    }

}
