package willow.train.kuayue.Blocks.Structure;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import willow.train.kuayue.Blocks.TrainCarriage.PanelBlock25Side;

public class GreenInsulationFenceBlock extends PanelBlock25Side {
    protected int type=0;
    public GreenInsulationFenceBlock(Properties pProperties,int tType) {
        super(pProperties);
        type = tType;
    }
    protected VoxelShape  SOUTH_AABB1= Shapes.or(Block.box(8, 0, 15, 16, 32, 16),
            Block.box(0, 0, 15, 8, 32, 16),
            Block.box(-16, 0, 15, -8, 32, 16),
            Block.box(-8, 0, 15, 0, 32, 16),
            Block.box(-16, 0, 16, -8, 32, 17),
            Block.box(-8, 0, 16, 0, 32, 17),
            Block.box(8, 0, 16, 16, 32, 17),
            Block.box(0, 0, 16, 8, 32, 17),
            Block.box(-16, 0, 17, -8, 32, 18),
            Block.box(-8, 0, 17, 0, 32, 18),
            Block.box(8, 0, 17, 16, 32, 18),
            Block.box(0, 0, 17, 8, 32, 18),
            Block.box(-16, 0, 14, -8, 32, 15),
            Block.box(-8, 0, 14, 0, 32, 15),
            Block.box(8, 0, 14, 16, 32, 15),
            Block.box(0, 0, 14, 8, 32, 15)

    );
    protected  VoxelShape  EAST_AABB1=Shapes.or(Block.box(15, 0, 0, 16, 32, 8),
            Block.box(15, 0, 8, 16, 32, 16),
            Block.box(15, 0, 24, 16, 32, 32),
            Block.box(15, 0, 16, 16, 32, 24),
            Block.box(16, 0, 24, 17, 32, 32),
            Block.box(16, 0, 16, 17, 32, 24),
            Block.box(16, 0, 0, 17, 32, 8),
            Block.box(16, 0, 8, 17, 32, 16),
            Block.box(17, 0, 24, 18, 32, 32),
            Block.box(17, 0, 16, 18, 32, 24),
            Block.box(17, 0, 0, 18, 32, 8),
            Block.box(17, 0, 8, 18, 32, 16),
            Block.box(14, 0, 24, 15, 32, 32),
            Block.box(14, 0, 16, 15, 32, 24),
            Block.box(14, 0, 0, 15, 32, 8),
            Block.box(14, 0, 8, 15, 32, 16)

    );
    protected  VoxelShape NORTH_AABB1 =Shapes.or(Block.box(0, 0, 0, 8, 32, 1),
            Block.box(8, 0, 0, 16, 32, 1),
            Block.box(24, 0, 0, 32, 32, 1),
            Block.box(16, 0, 0, 24, 32, 1),
            Block.box(24, 0, -1, 32, 32, 0),
            Block.box(16, 0, -1, 24, 32, 0),
            Block.box(0, 0, -1, 8, 32, 0),
            Block.box(8, 0, -1, 16, 32, 0),
            Block.box(24, 0, -2, 32, 32, -1),
            Block.box(16, 0, -2, 24, 32, -1),
            Block.box(0, 0, -2, 8, 32, -1),
            Block.box(8, 0, -2, 16, 32, -1),
            Block.box(24, 0, 1, 32, 32, 2),
            Block.box(16, 0, 1, 24, 32, 2),
            Block.box(0, 0, 1, 8, 32, 2),
            Block.box(8, 0, 1, 16, 32, 2)
    );
    protected  VoxelShape  WEST_AABB1= Shapes.or(Block.box(0, 0, 8, 1, 32, 16),
            Block.box(0, 0, 0, 1, 32, 8),
            Block.box(0, 0, -16, 1, 32, -8),
            Block.box(0, 0, -8, 1, 32, 0),
            Block.box(-1, 0, -16, 0, 32, -8),
            Block.box(-1, 0, -8, 0, 32, 0),
            Block.box(-1, 0, 8, 0, 32, 16),
            Block.box(-1, 0, 0, 0, 32, 8),
            Block.box(-2, 0, -16, -1, 32, -8),
            Block.box(-2, 0, -8, -1, 32, 0),
            Block.box(-2, 0, 8, -1, 32, 16),
            Block.box(-2, 0, 0, -1, 32, 8),
            Block.box(1, 0, -16, 2, 32, -8),
            Block.box(1, 0, -8, 2, 32, 0),
            Block.box(1, 0, 8, 2, 32, 16),
            Block.box(1, 0, 0, 2, 32, 8)
    );

    protected VoxelShape  SOUTH_AABB_lh= Shapes.or(Block.box(24, 0, 15, 32, 32, 16),
            Block.box(16, 0, 15, 24, 32, 16),
            Block.box(0, 0, 15, 8, 32, 16),
            Block.box(8, 0, 15, 16, 32, 16),
            Block.box(0, 0, 16, 8, 32, 17),
            Block.box(8, 0, 16, 16, 32, 17),
            Block.box(24, 0, 16, 32, 32, 17),
            Block.box(16, 0, 16, 24, 32, 17),
            Block.box(0, 0, 17, 8, 32, 18),
            Block.box(8, 0, 17, 16, 32, 18),
            Block.box(24, 0, 17, 32, 32, 18),
            Block.box(16, 0, 17, 24, 32, 18),
            Block.box(0, 0, 14, 8, 32, 15),
            Block.box(8, 0, 14, 16, 32, 15),
            Block.box(24, 0, 14, 32, 32, 15),
            Block.box(16, 0, 14, 24, 32, 15)
    );
    protected  VoxelShape WEST_AABB_lh = Shapes.or(Block.box(0, 0, 24, 1, 32, 32),
            Block.box(0, 0, 16, 1, 32, 24),
            Block.box(0, 0, 0, 1, 32, 8),
            Block.box(0, 0, 8, 1, 32, 16),
            Block.box(-1, 0, 0, 0, 32, 8),
            Block.box(-1, 0, 8, 0, 32, 16),
            Block.box(-1, 0, 24, 0, 32, 32),
            Block.box(-1, 0, 16, 0, 32, 24),
            Block.box(-2, 0, 0, -1, 32, 8),
            Block.box(-2, 0, 8, -1, 32, 16),
            Block.box(-2, 0, 24, -1, 32, 32),
            Block.box(-2, 0, 16, -1, 32, 24),
            Block.box(1, 0, 0, 2, 32, 8),
            Block.box(1, 0, 8, 2, 32, 16),
            Block.box(1, 0, 24, 2, 32, 32),
            Block.box(1, 0, 16, 2, 32, 24)
    );
    protected  VoxelShape NORTH_AABB_lh = Shapes.or(Block.box(-16, 0, 0, -8, 32, 1),
            Block.box(-8, 0, 0, 0, 32, 1),
            Block.box(8, 0, 0, 16, 32, 1),
            Block.box(0, 0, 0, 8, 32, 1),
            Block.box(8, 0, -1, 16, 32, 0),
            Block.box(0, 0, -1, 8, 32, 0),
            Block.box(-16, 0, -1, -8, 32, 0),
            Block.box(-8, 0, -1, 0, 32, 0),
            Block.box(8, 0, -2, 16, 32, -1),
            Block.box(0, 0, -2, 8, 32, -1),
            Block.box(-16, 0, -2, -8, 32, -1),
            Block.box(-8, 0, -2, 0, 32, -1),
            Block.box(8, 0, 1, 16, 32, 2),
            Block.box(0, 0, 1, 8, 32, 2),
            Block.box(-16, 0, 1, -8, 32, 2),
            Block.box(-8, 0, 1, 0, 32, 2)
    );
    protected  VoxelShape EAST_AABB_lh = Shapes.or(
            Block.box(15, 0, -16, 16, 32, -8),
            Block.box(15, 0, -8, 16, 32, 0),
            Block.box(15, 0, 8, 16, 32, 16),
            Block.box(15, 0, 0, 16, 32, 8),
            Block.box(16, 0, 8, 17, 32, 16),
            Block.box(16, 0, 0, 17, 32, 8),
            Block.box(16, 0, -16, 17, 32, -8),
            Block.box(16, 0, -8, 17, 32, 0),
            Block.box(17, 0, 8, 18, 32, 16),
            Block.box(17, 0, 0, 18, 32, 8),
            Block.box(17, 0, -16, 18, 32, -8),
            Block.box(17, 0, -8, 18, 32, 0),
            Block.box(14, 0, 8, 15, 32, 16),
            Block.box(14, 0, 0, 15, 32, 8),
            Block.box(14, 0, -16, 15, 32, -8),
            Block.box(14, 0, -8, 15, 32, 0)
    );

protected  VoxelShape NORTHnSOUTH = Shapes.or(Block.box(15, 0, 0, 16, 32, 1),
        Block.box(14, 0, 1, 15, 32, 2),
        Block.box(12, 0, 3, 13, 32, 4),
        Block.box(13, 0, 2, 14, 32, 3),
        Block.box(8, 0, 7, 9, 32, 8),
        Block.box(9, 0, 6, 10, 32, 7),
        Block.box(10, 0, 5, 11, 32, 6),
        Block.box(11, 0, 4, 12, 32, 5),
        Block.box(4, 0, 11, 5, 32, 12),
        Block.box(5, 0, 10, 6, 32, 11),
        Block.box(6, 0, 9, 7, 32, 10),
        Block.box(7, 0, 8, 8, 32, 9),
        Block.box(0, 0, 15, 1, 32, 16),
        Block.box(1, 0, 14, 2, 32, 15),
        Block.box(2, 0, 13, 3, 32, 14),
        Block.box(3, 0, 12, 4, 32, 13));
protected VoxelShape WESTnEAST = Shapes.or(Block.box(0, 0, 0, 1, 32, 1),
        Block.box(1, 0, 1, 2, 32, 2),
        Block.box(3, 0, 3, 4, 32, 4),
        Block.box(2, 0, 2, 3, 32, 3),
        Block.box(7, 0, 7, 8, 32, 8),
        Block.box(6, 0, 6, 7, 32, 7),
        Block.box(5, 0, 5, 6, 32, 6),
        Block.box(4, 0, 4, 5, 32, 5),
        Block.box(11, 0, 11, 12, 32, 12),
        Block.box(10, 0, 10, 11, 32, 11),
        Block.box(9, 0, 9, 10, 32, 10),
        Block.box(8, 0, 8, 9, 32, 9),
        Block.box(15, 0, 15, 16, 32, 16),
        Block.box(14, 0, 14, 15, 32, 15),
        Block.box(13, 0, 13, 14, 32, 14),
        Block.box(12, 0, 12, 13, 32, 13));

    @Override
    public VoxelShape getShape(BlockState p_54372_, BlockGetter p_54373_, BlockPos p_54374_, CollisionContext p_54375_) {
        if(type == 0) {
            if (p_54372_.getValue(HINGE) == DoorHingeSide.RIGHT) {
                return switch (p_54372_.getValue(FACING)) {
                    case NORTH -> NORTH_AABB1;
                    case SOUTH -> SOUTH_AABB1;
                    case WEST -> WEST_AABB1;
                    case EAST -> EAST_AABB1;
                    default -> EAST_AABB1;
                };
            } else {
                return switch (p_54372_.getValue(FACING)) {
                    case NORTH -> NORTH_AABB_lh;
                    case SOUTH -> SOUTH_AABB_lh;
                    case WEST -> WEST_AABB_lh;
                    case EAST -> EAST_AABB_lh;
                    default -> EAST_AABB_lh;
                };
            }
        }
        //return super.getShape(p_54372_, p_54373_, p_54374_, p_54375_);
    else {
            if (p_54372_.getValue(HINGE) == DoorHingeSide.RIGHT) {
                return switch (p_54372_.getValue(FACING)) {
                    case EAST -> WESTnEAST;
                    case WEST -> WESTnEAST;
                    case NORTH -> NORTHnSOUTH;
                    case SOUTH -> NORTHnSOUTH;
                    default -> NORTHnSOUTH;
                };
            }
    else
     {
         return switch (p_54372_.getValue(FACING)) {
             case EAST -> NORTHnSOUTH;
             case WEST -> NORTHnSOUTH;
             case NORTH -> WESTnEAST;
             case SOUTH -> WESTnEAST;
             default -> WESTnEAST;
         };
                }
            }
    }
}
