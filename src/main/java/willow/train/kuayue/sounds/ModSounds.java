package willow.train.kuayue.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import willow.train.kuayue.Main;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Main.MOD_ID);

    public static final RegistryObject<SoundEvent> CROSSING_RINGING =
            registerSoundEvent("crossing_ringing");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
    return SOUND_EVENT.register(name , () -> new SoundEvent(new ResourceLocation(Main.MOD_ID , name)));
}
    public static void register(IEventBus iEventBus){

        SOUND_EVENT.register(iEventBus);
    }
}
