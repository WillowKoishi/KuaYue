package willow.train.kuayue.init;

import net.minecraft.world.level.block.state.properties.WoodType;
import willow.train.kuayue.Util.FreeWoodType;

public class WoodTypeInit {
    public static WoodType TrainPanel = FreeWoodType.create("train_panel");

	public static void load() {
		// FreeWoodType.register(TrainPanel);
	}
}
