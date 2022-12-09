package willow.train.kuayue.Blocks.Supplier;

import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.MaterialManager;
import com.jozufozu.flywheel.util.transform.TransformStack;
import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.base.SingleRotatingInstance;
import com.simibubi.create.content.contraptions.base.flwdata.RotatingData;
import net.minecraft.core.Direction;
import willow.train.kuayue.Blocks.Locos.df11g.DF11GFrontBlock;
import willow.train.kuayue.init.AllModulePartials;

import java.util.function.Supplier;

public class DF11GFrontInstance extends SingleRotatingInstance {
    public DF11GFrontInstance(MaterialManager modelManager, KineticTileEntity tile) {
        super(modelManager, tile);
    }


    @Override
    protected Instancer<RotatingData> getModel() {
        Direction facing = blockState.getValue(DF11GFrontBlock.HORIZONTAL_FACING);
        return getRotatingMaterial().getModel(AllModulePartials.DF11_FRONT_BLOCK, blockState, facing, rotateToFace(facing));
    }
    private Supplier<PoseStack> rotateToFace(Direction facing) {
        return () -> {
            PoseStack stack = new PoseStack();
            TransformStack stacker = TransformStack.cast(stack)
                    .centre();

            if (facing.getAxis() == Direction.Axis.X) stacker.rotateZ(90);
            else if (facing.getAxis() == Direction.Axis.Z) stacker.rotateX(90);

            stacker.unCentre();
            return stack;
        };
    }
}
