package willow.train.kuayue.Blocks.Entities;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import willow.train.kuayue.init.BlockEntitiesInit;

public class TrainPanelSignBlockEntities extends SignBlockEntity {
    public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
    public TrainPanelSignBlockEntities(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return BlockEntitiesInit.TRAIN_BLOCK_ENTITES_BLOCK.get();
    }
}
