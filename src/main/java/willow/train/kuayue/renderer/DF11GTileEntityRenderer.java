package willow.train.kuayue.renderer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jozufozu.flywheel.core.PartialModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.render.SuperByteBuffer;
import com.simibubi.create.foundation.tileEntity.renderer.SafeTileEntityRenderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import willow.train.kuayue.Blocks.DF11GFrontBlock;
import willow.train.kuayue.Blocks.Entities.DF11GFrontTileEntity;

public class DF11GTileEntityRenderer extends SafeTileEntityRenderer<DF11GFrontTileEntity> {
	public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
	private int timer = 0;

	public DF11GTileEntityRenderer(BlockEntityRendererProvider.Context context) {

	}

	@Override
	protected void renderSafe(DF11GFrontTileEntity te, float partialTicks, PoseStack ms,
			MultiBufferSource buffer, int light, int overlay) {
		VertexConsumer vb = buffer.getBuffer(RenderType.solid());

		BlockState blockState = te.getBlockState();
		Direction facing = te.getBlockState().getValue(DF11GFrontBlock.HORIZONTAL_FACING);

		// transformed(AllModulePartials.DF11_FRONT_BLOCK, blockState, facing)
		// .unCentre()
		// .light(light)
		// .translate(0, 0, 0)
		// .renderInto(ms, vb);
	}

	private float D2A(Direction d) {
		return switch (d) {
			case EAST -> 270;
			case SOUTH -> 0;
			case WEST -> 90;
			default -> 180;
		};
	}

	private SuperByteBuffer transformed(PartialModel model, BlockState blockState, Direction facing) {
		return CachedBufferer.partial(model, blockState)
				.centre()
				.rotateY(D2A(facing));
	}

	@Override
	public int getViewDistance() {
		return 128;
	}
}
