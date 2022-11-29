package willow.train.kuayue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.simibubi.create.foundation.data.CreateRegistrate;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import willow.train.kuayue.effect.EffectInit;
import willow.train.kuayue.init.AllModulePartials;
import willow.train.kuayue.init.BlockEntitiesInit;
import willow.train.kuayue.init.BlockInit;
import willow.train.kuayue.init.ItemInit;
import willow.train.kuayue.init.KYCreateBlock;
import willow.train.kuayue.init.KYCreateEntities;
import willow.train.kuayue.sounds.ModSounds;

public class Main implements ModInitializer, ClientModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
	public static final String MOD_ID = "kuayue";
	public static final CreativeModeTab KUAYUE_MAIN = FabricItemGroupBuilder.create(asResource("item_group_main"))
			.icon(() -> new ItemStack(BlockInit.CR_LOGO.get())).build();
	public static final CreativeModeTab KUAYUE_LOCOS = FabricItemGroupBuilder.create(asResource("item_locos"))
			.icon(() -> new ItemStack(ItemInit.LOCO_LOGOS.get())).build();
	public static final CreativeModeTab KUAYUE_NormalSpeedPassageCarriageTab = FabricItemGroupBuilder
			.create(asResource("item_group_normal_speed_passage_carriage"))
			.icon(() -> new ItemStack(ItemInit.SERIES_25_LOGOS.get())).build();
	public static final CreativeModeTab KUAYUE_DIET = FabricItemGroupBuilder.create(asResource("item_group_diet"))
			.icon(() -> new ItemStack(ItemInit.CA_25T.get())).build();
	public static final CreativeModeTab KUAYUE_CATENARY = FabricItemGroupBuilder
			.create(asResource("item_group_catenary")).icon(() -> new ItemStack(BlockInit.Catenary_Pole.get())).build();
	public static final CreativeModeTab KUAYUE_GROUND = FabricItemGroupBuilder.create(asResource("item_group_ground"))
			.icon(() -> new ItemStack(BlockInit.Station_Entrance_Signal.get())).build();
	private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

	public static CreateRegistrate registrate() {
		return REGISTRATE;
	}

	@Override
	public void onInitialize() {
		BlockInit.BLOCKS.register();
		ItemInit.ITEMS.register();
		BlockEntitiesInit.BLOCK_ENTITIES.register();
		ModSounds.register();
		EffectInit.register();
		KYCreateBlock.register();
		KYCreateEntities.register();
		AllModulePartials.init();
		REGISTRATE.register();
	}

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25B_ORIGINAL_WINDOW.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25B_ORIGINAL_DOOR.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25G_ORIGINAL_WINDOW.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25G_ORIGINAL_DOOR.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25K_ORIGINAL_WINDOW.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25K_ORIGINAL_DOOR.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25T_ORIGINAL_WINDOW.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WIDEPANEL_BSP25T_ORIGINAL_MID.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25T_ORIGINAL_SKIRT.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25T_ORIGINAL_SKIRT_SIDE.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25T_ORIGINAL_DOOR.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_XL25T_ORIGINAL_TOP.get(),
				RenderType.translucent());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25_MARSHALLED_DOOR.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25B_MARSHALLED_WINDOW.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25_MARSHALLED_WINDOW.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25T_MARSHALLED_SKIRT.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANEL_25T_MARSHALLED_SKIRT_SIDE.get(),
				RenderType.translucent());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DF11G_PANEL_MID_FRONT_2.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DF11G_PANEL_MID_WINDOW.get(),
				RenderType.translucent());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WIDEPANEL_CR200J_MARSHALLED_MID.get(),
				RenderType.translucent());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CARPORT_25BGZK.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CARPORT_25T.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PANTOGRAPH.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Catenary_Pole.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Catenary_Grid.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Hang_Catenary_Grid.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Station_Entrance_Signal.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Shunting_Signal.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.No_Double_Pantograph.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Switch_Off_Sign.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Switch_On_Sign.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Signal_Pole.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Signal_Pole_Light.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.Concrete_Pole.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.TactilePavingStraight.get(),
				RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.TactilePavingPin.get(),
				RenderType.translucent());
	}
}
