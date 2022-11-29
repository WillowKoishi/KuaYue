package willow.train.kuayue.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import willow.train.kuayue.Main;

public class EffectInit {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Main.MOD_ID);
    public static final RegistryObject<MobEffect> NOODLE_SMELL = MOB_EFFECTS.register("noodle_smell",
            ()->new InstantNoodlesEffect(MobEffectCategory.BENEFICIAL,14723418));
    public static void rigister(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}