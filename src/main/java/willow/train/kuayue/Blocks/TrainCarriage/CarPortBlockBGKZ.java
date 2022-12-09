package willow.train.kuayue.Blocks.TrainCarriage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Util.HorizontalBlockBase;

public class CarPortBlockBGKZ extends HorizontalBlockBase {

    public CarPortBlockBGKZ(Properties p_49795_) {
        super(p_49795_);
    }

    protected static final VoxelShape SOUTH_AABB = Shapes.or(Block.box(0.05, 0, 15, 15.95, 7, 16),
            Block.box(0, 7, 8.67, 16, 8, 16),
            Block.box(0, 0, 0, 16, 1, 15),
            Block.box(0.05, 1, 8, 15.95, 7, 15),
            Block.box(0.05, 1, 4.25, 15.95, 6, 8),
            Block.box(0.05, 1, 2, 15.95, 3.5, 4.25),
            Block.box(0.05, 3.5, 3, 15.95, 4.75, 4.25),
            Block.box(0.05, 6, 6.25, 15.95, 7, 8),
            Block.box(0.05, 0.5, 0.75, 15.95, 2.5, 2));
    protected static final VoxelShape WEST_AABB = Shapes.or(Block.box(0, 0, 0.05, 1, 7, 15.95),
            Block.box(-0.01, 7, 0, 7.33, 8, 16),
            Block.box(1, 0, 0, 16, 1, 16),
            Block.box(1, 1, 0.05, 8, 7, 15.95),
            Block.box(8, 1, 0.05, 11.75, 6, 15.95),
            Block.box(11.75, 1, 0.05, 14, 3.5, 15.95),
            Block.box(11.75, 3.5, 0.05, 13, 4.75, 15.95),
            Block.box(8, 6, 0.05, 9.75, 7, 15.95),
            Block.box(14, 0.5, 0.05, 15.25, 2.5, 15.95));
    protected static final VoxelShape NORTH_AABB = Shapes.or(Block.box(0.05, 0, 0, 15.95, 7, 1),
            Block.box(0, 7, -0.01, 16, 8, 7.33),
            Block.box(0, 0, 1, 16, 1, 16),
            Block.box(0.05, 1, 1, 15.95, 7, 8),
            Block.box(0.05, 1, 8, 15.95, 6, 11.75),
            Block.box(0.05, 1, 11.75, 15.95, 3.5, 14),
            Block.box(0.05, 3.5, 11.75, 15.95, 4.75, 13),
            Block.box(0.05, 6, 8, 15.95, 7, 9.75),
            Block.box(0.05, 0.5, 14, 15.95, 2.5, 15.25));
    protected static final VoxelShape EAST_AABB = Shapes.or(Block.box(15, 0, 0.05, 16, 7, 15.95),
            Block.box(8.67, 7, 0, 16, 8, 16),
            Block.box(0, 0, 0, 15, 1, 16),
            Block.box(8, 1, 0.05, 15, 7, 15.95),
            Block.box(4.25, 1, 0.05, 8, 6, 15.95),
            Block.box(2, 1, 0.05, 4.25, 3.5, 15.95),
            Block.box(3, 3.5, 0.05, 4.25, 4.75, 15.95),
            Block.box(6.25, 6, 0.05, 8, 7, 15.95),
            Block.box(0.75, 0.5, 0.05, 2, 2.5, 15.95));


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
}
