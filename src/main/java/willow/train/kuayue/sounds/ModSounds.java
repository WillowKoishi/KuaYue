package willow.train.kuayue.sounds;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import willow.train.kuayue.Main;

public class ModSounds {
	public static final LazyRegistrar<SoundEvent> SOUND_EVENT = LazyRegistrar.create(Registry.SOUND_EVENT, Main.MOD_ID);

	public static final RegistryObject<SoundEvent> CROSSING_RINGING = registerSoundEvent("crossing_ringing");

	private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
		return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(Main.MOD_ID, name)));
	}

	public static void register() {
		SOUND_EVENT.register();
	}
}
