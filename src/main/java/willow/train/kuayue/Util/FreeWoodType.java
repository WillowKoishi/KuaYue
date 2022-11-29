package willow.train.kuayue.Util;

import net.minecraft.world.level.block.state.properties.WoodType;

public class FreeWoodType extends WoodType {

	public FreeWoodType(String string) {
		super(string);
	}

	public static WoodType create(String id) {
		return new FreeWoodType(id);
	}

	@Deprecated
	public static WoodType register(WoodType woodType) {
		return woodType;
	}

}
