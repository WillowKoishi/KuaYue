package willow.train.kuayue.init;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Supplier;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import willow.train.kuayue.Main;
import willow.train.kuayue.Blocks.AngleBlock22;
import willow.train.kuayue.Blocks.CarPortBlockBGKZ;
import willow.train.kuayue.Blocks.CatenaryGridBlock;
import willow.train.kuayue.Blocks.CatenaryPoleBlock;
import willow.train.kuayue.Blocks.DF11GCarportBlock;
import willow.train.kuayue.Blocks.DF11GMirrorCarportBlock;
import willow.train.kuayue.Blocks.DF11GPanel3Wide;
import willow.train.kuayue.Blocks.FlourescentLightBlock;
import willow.train.kuayue.Blocks.MegaPhoneBlock;
import willow.train.kuayue.Blocks.PanelBlock2;
import willow.train.kuayue.Blocks.PanelBlock25Side;
import willow.train.kuayue.Blocks.PanelBlock4;
import willow.train.kuayue.Blocks.PanelBlockHalf;
import willow.train.kuayue.Blocks.PantographBlock;
import willow.train.kuayue.Blocks.SeatedSignalBlock;
import willow.train.kuayue.Blocks.SignalPoleBlock;
import willow.train.kuayue.Blocks.SignalPoleLightBlock;
import willow.train.kuayue.Blocks.TactilePavingBlock;
import willow.train.kuayue.Blocks.TopPanelSlabBlock;
import willow.train.kuayue.Blocks.Train25GLadderBlock;
import willow.train.kuayue.Blocks.TrainDoorBlock;
import willow.train.kuayue.Blocks.TrainGlassPanelBlock;
import willow.train.kuayue.Blocks.TrainPanelBlock;
import willow.train.kuayue.Blocks.TrainPanelSignBlock;
import willow.train.kuayue.Blocks.TrainPanelSignBlock2;
import willow.train.kuayue.Blocks.TrainSignBlock;
import willow.train.kuayue.Items.ToolTipsItemHelper;

public class BlockInit {
	public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
	// 注册机
	public static final LazyRegistrar<Block> BLOCKS = LazyRegistrar.create(Registry.BLOCK,
			Main.MOD_ID);
	public static final LazyRegistrar<Item> ITEMS = ItemInit.ITEMS;

	public static final RegistryObject<Block> CR_LOGO = register("cr_logo",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
					.sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	// 25B
	public static final RegistryObject<TrainDoorBlock> PANEL_25B_ORIGINAL_DOOR = register("original_25b_door",
			() -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25b_original_bottom
	public static final RegistryObject<TrainPanelBlock> PANEL_25B_ORIGINAL_BOTTOM = register(
			"panel_25b_original_bottom",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25b_original_mid
	public static final RegistryObject<TrainPanelBlock> PANEL_25B_ORIGINAL_MID = register("panel_25b_original_mid",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25b_original_window
	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_WINDOW = register(
			"panel_25b_original_window",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25b_original_top
	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_TOP = register(
			"panel_25b_original_top",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_TOP_B = register(
			"panel_25b_original_top_b",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<TopPanelSlabBlock> SLAB_25B_ORIGINAL_TOP = register("slab_25b_original_top",
			() -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	// 25G
	public static final RegistryObject<TrainDoorBlock> PANEL_25G_ORIGINAL_DOOR = register("original_25g_door",
			() -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25g_original_bottom
	public static final RegistryObject<TrainPanelBlock> PANEL_25G_ORIGINAL_BOTTOM = register(
			"panel_25g_original_bottom",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25g_original_mid
	public static final RegistryObject<TrainPanelBlock> PANEL_25G_ORIGINAL_MID = register("panel_25g_original_mid",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25g_original_window
	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25G_ORIGINAL_WINDOW = register(
			"panel_25g_original_window",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25g_original_top
	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25G_ORIGINAL_TOP = register(
			"panel_25g_original_top",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<TopPanelSlabBlock> SLAB_25G_ORIGINAL_TOP = register("slab_25g_original_top",
			() -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<Train25GLadderBlock> LADDER_25G_ORIGIINAL = register("ladder_25g_original",
			() -> new Train25GLadderBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	// 25K

	public static final RegistryObject<TrainDoorBlock> PANEL_25K_ORIGINAL_DOOR = register("original_25k_door",
			() -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25k_original_bottom
	public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_BOTTOM = register(
			"panel_25k_original_bottom",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_LINE = register(
			"panel_25k_original_bottom_line",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25k_original_mid
	public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_MID = register("panel_25k_original_mid",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25k_original_window
	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25K_ORIGINAL_WINDOW = register(
			"panel_25k_original_window",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25k_original_top
	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25K_ORIGINAL_TOP = register(
			"panel_25k_original_top",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<PanelBlock25Side> PANEL_25K_ORIGINAL_SYMBOL = register(
			"panel_25k_original_symbol",
			() -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<CarPortBlockBGKZ> CARPORT_25BGZK = register("carport_25bgzk",
			() -> new CarPortBlockBGKZ(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<TopPanelSlabBlock> SLAB_25K_ORIGINAL_TOP = register("slab_25k_original_top",
			() -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	// 25T
	public static final RegistryObject<TrainDoorBlock> PANEL_25T_ORIGINAL_DOOR = register("original_25t_door",
			() -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25t_original_bottom
	public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_BOTTOM = register(
			"panel_25t_original_bottom",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25t_original_mid
	public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_MID = register("panel_25t_original_mid",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_MID_B = register(
			"panel_25t_original_mid_b",
			() -> new PanelBlock25Side(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_TOP_B = register(
			"panel_25t_original_top_b",
			() -> new PanelBlock25Side(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_BOTTOM_B = register(
			"panel_25t_original_bottom_b",
			() -> new PanelBlock25Side(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	// public static final RegistryObject<TrainPanelSignBlock>
	// TRAIN_PANEL_SIGN_BLOCK= register("train_panel_sign_block",
	// () -> new
	// TrainPanelSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN),WoodTypeInit.TrainPanel),
	// object -> () -> new BlockItem(object.get(), new
	// Item.Properties().tab(Main.KUAYUE_MAIN)));

	// public static final RegistryObject<Block> TRAIN_PANEL_SIGN_BLOCK1=
	// registerBlock("train_panel_sign_block1",
	// () -> new
	// TrainPanelSignBlock2(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN),WoodTypeInit.TrainPanel));

	public static final RegistryObject<Block> TRAIN_PANEL_SIGN_BLOCK = registerBlockWithoutBlockItem(
			"train_panel_sign_block",
			() -> new TrainPanelSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN),
					WoodTypeInit.TrainPanel));

	public static final RegistryObject<Block> TRAIN_PANEL_SIGN_BLOCK1 = registerBlockWithoutBlockItem(
			"train_panel_sign_block1",
			() -> new TrainPanelSignBlock2(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN),
					WoodTypeInit.TrainPanel));
	// panel_25t_original_window
	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_ORIGINAL_WINDOW = register(
			"panel_25t_original_window",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// panel_25t_original_top
	public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_TOP = register("panel_25t_original_top",
			() -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<TrainPanelBlock> PANEL_XL25T_ORIGINAL_TOP = register(
			"panel_xl25t_original_top",
			() -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_ORIGINAL_SKIRT = register(
			"panel_25t_original_skirt",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_SKIRT_SIDE = register(
			"panel_25t_original_skirt_side",
			() -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<CarPortBlockBGKZ> CARPORT_25T = register("carport_25t",
			() -> new CarPortBlockBGKZ(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<TopPanelSlabBlock> SLAB_25T_ORIGINAL_TOP = register("slab_25t_original_top",
			() -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	// widepanel_bsp25t_original_mid
	public static final RegistryObject<TrainPanelBlock> WIDEPANEL_BSP25T_ORIGINAL_MID = register(
			"widepanel_bsp25t_original_mid",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	// 刷绿shualv
	public static final RegistryObject<TrainDoorBlock> PANEL_25_MARSHALLED_DOOR = register("marshalled_25_door",
			() -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_BOTTOM = register(
			"panel_25_marshalled_bottom",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_BOTTOM_LINE = register(
			"panel_25_marshalled_bottom_line",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_MID = register(
			"panel_25_marshalled_mid",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_TOP = register(
			"panel_25_marshalled_top",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_TOP_B = register(
			"panel_25_marshalled_top_b",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<PanelBlock25Side> PANEL_25B_MARSHALLED_SYMBOL = register(
			"panel_25b_marshalled_symbol",
			() -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<PanelBlock25Side> PANEL_25G_MARSHALLED_SYMBOL = register(
			"panel_25g_marshalled_symbol",
			() -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
	public static final RegistryObject<PanelBlock25Side> PANEL_25K_MARSHALLED_SYMBOL = register(
			"panel_25k_marshalled_symbol",
			() -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_MARSHALLED_WINDOW = register(
			"panel_25b_marshalled_window",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TopPanelSlabBlock> SLAB_25_MARSHALLED_TOP = register(
			"slab_25_marshalled_top",
			() -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25_MARSHALLED_WINDOW = register(
			"panel_25_marshalled_window",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_MARSHALLED_SKIRT = register(
			"panel_25t_marshalled_skirt",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<PanelBlock25Side> PANEL_25T_MARSHALLED_SKIRT_SIDE = register(
			"panel_25t_marshalled_skirt_side",
			() -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	// 受电弓
	public static final RegistryObject<PantographBlock> PANTOGRAPH = register("pantograph",
			() -> new PantographBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<PanelBlockHalf> SMOOTH_QUARTZ_PANEL_HALF = register(
			"smooth_quartz_panel_half",
			() -> new PanelBlockHalf(
					BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

	public static final RegistryObject<PanelBlock4> SMOOTH_QUARTZ_PANEL_4 = register("smooth_quartz_panel_4",
			() -> new PanelBlock4(
					BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

	public static final RegistryObject<PanelBlock2> SMOOTH_QUARTZ_PANEL_2 = register("smooth_quartz_panel_2",
			() -> new PanelBlock2(
					BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

	public static final RegistryObject<AngleBlock22> SMOOTH_QUARTZ_ANGLE_22_UP = register(
			"smooth_quartz_angle_22_up",
			() -> new AngleBlock22(
					BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
	// 粘土板
	public static final RegistryObject<Block> CLAY_SLAB = register("clay_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.STONE)
					.strength(3.0f)
					.sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
	// clay_stairs
	public static final RegistryObject<StairBlock> CLAY_STAIRS = register("clay_stairs",
			() -> new StairBlock(Blocks.CLAY.defaultBlockState(),
					BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
	// 车棚

	// 接触网
	// Catenary_Pole
	public static final RegistryObject<CatenaryPoleBlock> Catenary_Pole = register("catenary_pole",
			() -> new CatenaryPoleBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_CATENARY)));
	public static final RegistryObject<CatenaryGridBlock> Catenary_Grid = register("catenary_grid",
			() -> new CatenaryGridBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_CATENARY)));

	public static final RegistryObject<CatenaryGridBlock> Hang_Catenary_Grid = register("hang_catenary_grid",
			() -> new CatenaryGridBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_CATENARY)));
	public static final RegistryObject<SeatedSignalBlock> Station_Entrance_Signal = register(
			"station_entrance_signal",
			() -> new SeatedSignalBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	public static final RegistryObject<SeatedSignalBlock> Shunting_Signal = register("shunting_signal",
			() -> new SeatedSignalBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));
	public static final RegistryObject<TrainSignBlock> No_Double_Pantograph = register("no_double_pantograph",
			() -> new TrainSignBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));
	public static final RegistryObject<TrainSignBlock> Switch_Off_Sign = register("switch_off_sign",
			() -> new TrainSignBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	public static final RegistryObject<TrainSignBlock> Switch_On_Sign = register("switch_on_sign",
			() -> new TrainSignBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	public static final RegistryObject<SignalPoleBlock> Signal_Pole = register("signal_pole",
			() -> new SignalPoleBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	public static final RegistryObject<SignalPoleLightBlock> Signal_Pole_Light = register("signal_pole_light",
			() -> new SignalPoleLightBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	public static final RegistryObject<CatenaryPoleBlock> Concrete_Pole = register("concrete_pole",
			() -> new CatenaryPoleBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_CATENARY)));

	public static final RegistryObject<TactilePavingBlock> TactilePavingStraight = register(
			"tactile_paving_straight",
			() -> new TactilePavingBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	public static final RegistryObject<TactilePavingBlock> TactilePavingPin = register("tactile_paving_pin",
			() -> new TactilePavingBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	public static final RegistryObject<FlourescentLightBlock> FlourescentLight = register("flourescent_light",
			() -> new FlourescentLightBlock(
					BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
							.sound(SoundType.COPPER).requiresCorrectToolForDrops()
							.noOcclusion().lightLevel(state -> 15)),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	public static final RegistryObject<MegaPhoneBlock> MEGAPHONE = register("megaphone",
			() -> new MegaPhoneBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(),
					new Item.Properties().tab(Main.KUAYUE_GROUND)));

	// cr200j

	public static final RegistryObject<TrainPanelBlock> WIDEPANEL_CR200J_MARSHALLED_MID = register(
			"widepanel_cr200j_marshalled_mid",
			() -> new TrainPanelBlock(
					BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.PLANT).strength(3.0f)
							.sound(SoundType.GLASS).requiresCorrectToolForDrops()),
			object -> () -> new ToolTipsItemHelper(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainGlassPanelBlock> PANEL_CR200J_MARSHALLED_TOP = register(
			"panel_cr200j_marshalled_top",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new ToolTipsItemHelper(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TrainGlassPanelBlock> PANEL_CR200J_MARSHALLED_BOTTOM = register(
			"panel_cr200j_marshalled_bottom",
			() -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new ToolTipsItemHelper(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	public static final RegistryObject<TopPanelSlabBlock> SLAB_CR200J_MARSHALLED_TOP = register(
			"slab_cr200j_marshalled_top",
			() -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new ToolTipsItemHelper(object.get(),
					new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

	// public static final RegistryObject<TrainPanelBlock> DF11G_FRONT =
	// register("df11g_front",
	// () -> new
	// TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL,MaterialColor.NONE).strength(3.0f)
	// .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object
	// -> () -> new BlockItem(object.get(),
	// new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<DF11GMirrorCarportBlock> DF11G_CARPORT_1 = register("df11g_carport_1",
			() -> new DF11GMirrorCarportBlock(BlockBehaviour.Properties
					.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 1),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<DF11GMirrorCarportBlock> DF11G_CARPORT_2 = register("df11g_carport_2",
			() -> new DF11GMirrorCarportBlock(BlockBehaviour.Properties
					.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 1),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_GENERAL = register("df11g_carport_general",
			() -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 1),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_LOUVER = register("df11g_carport_louver",
			() -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 1),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
	public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_LOUVER_2 = register(
			"df11g_carport_louver_2",
			() -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 1),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
	public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_LOUVER_3 = register(
			"df11g_carport_louver_3",
			() -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 1),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_KUAYUE = register("df11g_carport_kuayue",
			() -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 3),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<DF11GPanel3Wide> DF11G_PANEL_KUAYUE = register("df11g_panel_kuayue",
			() -> new DF11GPanel3Wide(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 3),
			object -> () -> new ToolTipsItemHelper(object.get(),
					new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<PanelBlock2> DF11G_PANEL_GENERAL = register("df11g_panel_general",
			() -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<PanelBlock2> DF11G_PANEL_MID_GENERAL = register("df11g_panel_mid_general",
			() -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<PanelBlock2> DF11G_PANEL_SHADES = register("df11g_panel_shades",
			() -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
	public static final RegistryObject<PanelBlock2> DF11G_PANEL_MID_WINDOW = register("df11g_panel_mid_window",
			() -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
	public static final RegistryObject<PanelBlock2> DF11G_PANEL_MID_SHADES = register("df11g_panel_mid_shades",
			() -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
	// df11g_panel_cr
	public static final RegistryObject<DF11GPanel3Wide> DF11G_PANEL_CR = register("df11g_panel_cr",
			() -> new DF11GPanel3Wide(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 3),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	public static final RegistryObject<DF11GMirrorCarportBlock> DF11G_PANEL_MID_FRONT_2 = register(
			"df11g_panel_mid_front_2",
			() -> new DF11GMirrorCarportBlock(BlockBehaviour.Properties
					.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 2),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
	// PanelBlock25Side
	public static final RegistryObject<PanelBlock25Side> DF11G_PANEL_MID_FRONT = register("df11g_panel_mid_front",
			() -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE)
					.strength(3.0f)
					.sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

	@SuppressWarnings("unchecked")
	private static <T extends Block> RegistryObject<T> registerBlock(final String name,
			final Supplier<? extends T> block) {
		// LOGGER.info("rigister block:"+name);
		return (RegistryObject<T>) BLOCKS.register(name, block);

	}

	private static <T extends Block> RegistryObject<T> register(final String name,
			final Supplier<? extends T> block,
			Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}

	private static <T extends Block> RegistryObject<T> register2(final String name,
			final Supplier<? extends T> block,
			Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		// ITEMS.register(name, item.apply(obj));
		return obj;
	}

	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name,
			Supplier<T> block) {
		return BLOCKS.register(name, block);
	}

}
