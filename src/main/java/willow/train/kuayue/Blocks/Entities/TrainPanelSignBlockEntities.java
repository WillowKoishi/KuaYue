package willow.train.kuayue.Blocks.Entities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import willow.train.kuayue.init.BlockEntitiesInit;

public class TrainPanelSignBlockEntities extends SignBlockEntity {
    public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
    public TrainPanelSignBlockEntities(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        LOGGER.info("register Signentity 1"+pPos+pBlockState);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return BlockEntitiesInit.TRAIN_BLOCK_ENTITES_BLOCK.get();
    }
}
