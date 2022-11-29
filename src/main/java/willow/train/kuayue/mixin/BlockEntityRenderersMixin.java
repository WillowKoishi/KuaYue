package willow.train.kuayue.mixin;

import org.jetbrains.annotations.Contract;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import willow.train.kuayue.init.BlockEntitiesInit;
import willow.train.kuayue.renderer.TrainPanelSignRenderer;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.Map;

@Mixin(BlockEntityRenderers.class)
public abstract class BlockEntityRenderersMixin {
	@Contract("_ -> fail")
	@Inject(at = @At("TAIL"), method = "<clinit>")
	private static void init(CallbackInfo ci) {
		BlockEntityRenderersAccessor.register(BlockEntitiesInit.TRAIN_BLOCK_ENTITES_BLOCK.get(), TrainPanelSignRenderer::new);
	}
}
