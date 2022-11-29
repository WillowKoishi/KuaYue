package willow.train.kuayue.init;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.entity.BlockEntityType;
import willow.train.kuayue.Main;
import willow.train.kuayue.Blocks.Entities.MegaphoneBlockEntity;
import willow.train.kuayue.Blocks.Entities.TrainPanelSignBlockEntities;

public class BlockEntitiesInit {
	public static final LazyRegistrar<BlockEntityType<?>> BLOCK_ENTITIES = LazyRegistrar
			.create(Registry.BLOCK_ENTITY_TYPE, Main.MOD_ID);

	public static final RegistryObject<BlockEntityType<MegaphoneBlockEntity>> MEGAPHONE_BLOCK_ENTITIES = BLOCK_ENTITIES
			.register("megaphone_block_entity",
					() -> BlockEntityType.Builder.of(MegaphoneBlockEntity::new, BlockInit.MEGAPHONE.get()).build(null));

	public static final RegistryObject<BlockEntityType<TrainPanelSignBlockEntities>> TRAIN_BLOCK_ENTITES_BLOCK = BLOCK_ENTITIES
			.register("train_panel_block_entity", () -> BlockEntityType.Builder.of(TrainPanelSignBlockEntities::new,
					BlockInit.TRAIN_PANEL_SIGN_BLOCK.get(), BlockInit.TRAIN_PANEL_SIGN_BLOCK1.get()).build(null));

	public static void register() {
		BLOCK_ENTITIES.register();
	}
}
