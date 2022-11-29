package willow.train.kuayue.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import willow.train.kuayue.init.BlockInit;

public class MainTab extends CreativeModeTab {
    public MainTab(String modId) {
        super("item_group_main");
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(BlockInit.CR_LOGO.get());
    }
}

