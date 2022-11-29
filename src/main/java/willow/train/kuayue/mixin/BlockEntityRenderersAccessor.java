package willow.train.kuayue.mixin;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

import org.jetbrains.annotations.Contract;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BlockEntityRenderers.class)
public interface BlockEntityRenderersAccessor {
	@Contract(value = "_, _ -> fail", pure = true)
	@Invoker("register")
	static <T extends net.minecraft.world.level.block.entity.BlockEntity> void register(net.minecraft.world.level.block.entity.BlockEntityType<? extends T> blockEntityType, net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider<T> blockEntityRendererProvider) {
		throw new AssertionError();
	}
}
