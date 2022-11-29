package willow.train.kuayue.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import willow.train.kuayue.init.BlockInit;

public class GroundTab extends CreativeModeTab {
    public GroundTab(String modId) {
        super("item_group_ground");
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(BlockInit.Station_Entrance_Signal.get());
    }
}

