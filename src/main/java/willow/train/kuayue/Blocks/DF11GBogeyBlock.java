package willow.train.kuayue.Blocks;

import java.util.EnumSet;

import com.jozufozu.flywheel.api.MaterialManager;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.contraptions.relays.elementary.ShaftBlock;
import com.simibubi.create.content.logistics.trains.entity.BogeyInstance;
import com.simibubi.create.content.logistics.trains.entity.CarriageBogey;
import com.simibubi.create.content.logistics.trains.track.StandardBogeyBlock;
import com.simibubi.create.content.logistics.trains.track.StandardBogeyTileEntity;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.utility.Iterate;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import willow.train.kuayue.init.KYCreateEntities;

public class DF11GBogeyBlock extends StandardBogeyBlock {

   // public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.HORIZONTAL_AXIS;

    public DF11GBogeyBlock(Properties p_i48440_1_, boolean large) {

        super(p_i48440_1_, large);
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        //builder.add(AXIS);
        super.createBlockStateDefinition(builder);
    }

    static final EnumSet<Direction> STICKY_X = EnumSet.of(Direction.EAST, Direction.WEST);
    static final EnumSet<Direction> STICKY_Z = EnumSet.of(Direction.SOUTH, Direction.NORTH);

    @Override
    public EnumSet<Direction> getStickySurfaces(BlockGetter world, BlockPos pos, BlockState state) {
        return state.getValue(BlockStateProperties.HORIZONTAL_AXIS) == Direction.Axis.X ? STICKY_X : STICKY_Z;
    }
    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState,
                                  LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pNeighborPos) {
        return pState;
    }
    @Override
    public double getWheelPointSpacing() {
        return 2;
    }

    @Override
    public double getWheelRadius() {
        return 12.5  / 16d;
    }
    //轮径
    @Override
    public Vec3 getConnectorAnchorOffset() {
        return new Vec3(0, 7 / 32f, 1);
    }
//车钩（链条）链接位置
    @Override
    public boolean allowsSingleBogeyCarriage() {
        return true;
    }
//允许单个转向架
    @Override
    public BlockState getMatchingBogey(Direction upDirection, boolean axisAlongFirst) {
        if (upDirection != Direction.UP)
            return null;
        return defaultBlockState().setValue(AXIS, axisAlongFirst ? Direction.Axis.X : Direction.Axis.Z);
    }

    @Override
    public boolean isTrackAxisAlongFirstCoordinate(BlockState state) {
        return state.getValue(AXIS) == Direction.Axis.X;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void render(BlockState state, float wheelAngle, PoseStack ms, float partialTicks, MultiBufferSource buffers,
                       int light, int overlay) {
        if (state != null) {
            ms.translate(.5f, .5f, .5f);
            if (state.getValue(AXIS) == Direction.Axis.X)
                ms.mulPose(Vector3f.YP.rotationDegrees(90));
        }

        ms.translate(0, -1.5 - 1 / 128f, 0);

        VertexConsumer vb = buffers.getBuffer(RenderType.cutoutMipped());
        BlockState air = Blocks.AIR.defaultBlockState();

        for (int i : Iterate.zeroAndOne)
            CachedBufferer.block(AllBlocks.SHAFT.getDefaultState()
                            .setValue(ShaftBlock.AXIS, Direction.Axis.Z))
                    .translate(-.5f, .25f, i * -1)
                    .centre()
                    .rotateZ(wheelAngle)
                    .unCentre()
                    .light(light)
                    .renderInto(ms, vb);

 //       if (large) {
               renderLargeBogey(wheelAngle, ms, light, vb, air);
//        } else {
//            renderBogey(wheelAngle, ms, light, vb, air);
//        }
    }
    private void renderLargeBogey(float wheelAngle, PoseStack ms, int light, VertexConsumer vb, BlockState air) {
        for (int i : Iterate.zeroAndOne)
            CachedBufferer.block(AllBlocks.SHAFT.getDefaultState()
                            .setValue(ShaftBlock.AXIS, Direction.Axis.X))
                    .translate(-.5f, .25f, .5f + i * -2)
                    .centre()
                    .rotateX(wheelAngle)
                    .unCentre()
                    .light(light)
                    .renderInto(ms, vb);

        CachedBufferer.partial(AllBlockPartials.BOGEY_DRIVE, air)
                .scale(1 - 1 / 512f)
                .light(light)
                .renderInto(ms, vb);
//        CachedBufferer.partial(AllBlockPartials.BOGEY_PISTON, air)
//                .translate(0, 0, 1 / 4f * Math.sin(AngleHelper.rad(wheelAngle)))
//                .light(light)
//                .renderInto(ms, vb);

        ms.pushPose();
        CachedBufferer.partial(AllBlockPartials.LARGE_BOGEY_WHEELS, air)
                .translate(0, 1, 0)
                .rotateX(wheelAngle)
                .light(light)
                .renderInto(ms, vb);
        CachedBufferer.partial(AllBlockPartials.LARGE_BOGEY_WHEELS, air)
                .translate(0, 1, -2)
                .rotateX(wheelAngle)
                .light(light)
                .renderInto(ms, vb);
        CachedBufferer.partial(AllBlockPartials.LARGE_BOGEY_WHEELS, air)
                .translate(0, 1, 2)
                .rotateX(wheelAngle)
                .light(light)
                .renderInto(ms, vb);
//        CachedBufferer.partial(AllBlockPartials.BOGEY_PIN, air)
//                .translate(0, 1, 0)
//                .rotateX(wheelAngle)
//                .translate(0, 1 / 4f, 0)
//                .rotateX(-wheelAngle)
//                .light(light)
//                .renderInto(ms, vb);
        ms.popPose();
    }
    @Override
    public BogeyInstance createInstance(MaterialManager materialManager, CarriageBogey bogey) {
            return new BogeyInstance.Drive(bogey, materialManager);

    }
    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return switch (pRotation) {
            case COUNTERCLOCKWISE_90, CLOCKWISE_90 -> pState.cycle(AXIS);
            default -> pState;
        };
    }
    // @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos,
                                       Player player) {
        return AllBlocks.RAILWAY_CASING.asStack();
    }


    @Override
    public Class<StandardBogeyTileEntity> getTileEntityClass() {
        return StandardBogeyTileEntity.class;
    }

    @Override
    public BlockEntityType<? extends StandardBogeyTileEntity> getTileEntityType() {
        return KYCreateEntities.DF11G_BOGEY.get();
    }


}
