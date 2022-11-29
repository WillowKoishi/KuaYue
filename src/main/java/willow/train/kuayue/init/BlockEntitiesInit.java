package willow.train.kuayue.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import willow.train.kuayue.Blocks.Entities.MegaphoneBlockEntity;
import willow.train.kuayue.Blocks.Entities.TrainPanelSignBlockEntities;
import willow.train.kuayue.Main;

public class BlockEntitiesInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Main.MOD_ID);

//    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
//            Main.MOD_ID);
    public static final RegistryObject<BlockEntityType<MegaphoneBlockEntity>> MEGAPHONE_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("megaphone_block_entity" , () ->
                    BlockEntityType.Builder.of(MegaphoneBlockEntity::new, BlockInit.MEGAPHONE.get()).build(null));

    public static final RegistryObject<BlockEntityType<TrainPanelSignBlockEntities>> TRAIN_BLOCK_ENTITES_BLOCK =
            BLOCK_ENTITIES.register("train_panel_block_entity" , () ->
                    BlockEntityType.Builder.of(TrainPanelSignBlockEntities::new,
                            BlockInit.TRAIN_PANEL_SIGN_BLOCK.get(),BlockInit.TRAIN_PANEL_SIGN_BLOCK1.get()
                            ).build(null));
//    public static final RegistryObject<BlockEntityType<MegaphoneBlockEntity>> MegaphoneBlockEntity =
//            BLOCK_ENTITIES.register("megaphone_block_entity", () ->
//            BlockEntityType.Builder.of(MegaphoneBlockEntity::new, BlockInit.MEGAPHONE.get()).build());
    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
