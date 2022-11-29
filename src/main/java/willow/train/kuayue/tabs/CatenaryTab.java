package willow.train.kuayue.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import willow.train.kuayue.init.BlockInit;

public class CatenaryTab extends CreativeModeTab {
    public CatenaryTab(String modId) {
        super("item_group_catenary");
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(BlockInit.Catenary_Pole.get());
    }
}

