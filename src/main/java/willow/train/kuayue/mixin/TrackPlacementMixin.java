package willow.train.kuayue.mixin;

import org.jetbrains.annotations.Contract;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import com.simibubi.create.content.logistics.trains.track.TrackPlacement;

@Mixin(TrackPlacement.class)
public class TrackPlacementMixin {
    @Contract(pure = true)
    @ModifyConstant(method = "tryConnect", constant = @Constant(intValue = 32), remap = false)
    private static int redirectGetSquaredDistance(int constant) {
        return 1024;
    }
}
