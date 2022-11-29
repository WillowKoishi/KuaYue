package willow.train.kuayue.Items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolTipsItemHelper extends BlockItem {
    public ToolTipsItemHelper(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

//    @Override
//    public void appendHoverText(@NotNull ItemStack p_41421_, @Nullable Level p_41422_, List<Component> tooltips, TooltipFlag p_41424_) {
//        tooltips.add(new TranslatableComponent("block.kuayue.df11g_front2.tooltip"));
//        super.appendHoverText(p_41421_, p_41422_, tooltips, p_41424_);
//    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(new TranslatableComponent(pStack.getDescriptionId()+".tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }
}
