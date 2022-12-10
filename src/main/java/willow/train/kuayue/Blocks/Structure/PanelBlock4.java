package willow.train.kuayue.Blocks.Structure;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Util.HorizontalBlockBase;

public class PanelBlock4 extends HorizontalBlockBase {
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 12, 16, 16, 16);
    protected static final VoxelShape WEST_AABB = Block.box(0, 0.0D, 0.0D, 4, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 4);
    protected static final VoxelShape EAST_AABB = Block.box(12, 0.0D, 0D, 16.0D, 16.0D, 16.0D);

    public PanelBlock4(Properties p_49795_) {
        super(p_49795_);
    }
    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        switch((Direction)p_54372_.getValue(FACING)) {
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
}
