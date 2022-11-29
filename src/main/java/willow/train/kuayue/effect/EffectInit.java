package willow.train.kuayue.effect;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import willow.train.kuayue.Main;

public class EffectInit {
    public static final LazyRegistrar<MobEffect> MOB_EFFECTS
            = LazyRegistrar.create(Registry.MOB_EFFECT, Main.MOD_ID);
    public static final RegistryObject<MobEffect> NOODLE_SMELL = MOB_EFFECTS.register("noodle_smell",
            ()->new InstantNoodlesEffect(MobEffectCategory.BENEFICIAL,14723418));
    public static void register(){
        MOB_EFFECTS.register();
    }
}
