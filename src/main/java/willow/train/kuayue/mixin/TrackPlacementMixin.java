package willow.train.kuayue.mixin;

import com.simibubi.create.content.logistics.trains.track.TrackPlacement;
import org.jetbrains.annotations.Contract;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
@Mixin(TrackPlacement.class)
public class TrackPlacementMixin {
        @Contract(pure=true)
        @ModifyConstant(method = "tryConnect",constant = @Constant(doubleValue = 1024.0),remap = false)
        private static double redirectGetSquaredDistance(double constant){
            return 16384.0;
        }
}
