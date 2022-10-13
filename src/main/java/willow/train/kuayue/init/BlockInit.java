package willow.train.kuayue.init;

import com.google.common.base.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import willow.train.kuayue.Blocks.*;
import willow.train.kuayue.Blocks.Locos.HXD3D.HXD3DCabDoorBlock;
import willow.train.kuayue.Blocks.Locos.HXD3D.HXD3DPanelBlocks;
import willow.train.kuayue.Blocks.Locos.PantographBlock;
import willow.train.kuayue.Blocks.Locos.df11g.*;
import willow.train.kuayue.Blocks.Structure.*;
import willow.train.kuayue.Blocks.TrainCarriage.*;
import willow.train.kuayue.Items.ToolTipsItemHelper;
import willow.train.kuayue.Main;

import java.util.function.Function;

public class BlockInit {
    public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
    //注册机
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Main.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;


    public static final RegistryObject<Block> CR_LOGO = register("cr_logo",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties()));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25 = register("original_color_window_25",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25_SEALED = register("original_color_window_25_sealed",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //25B
    public static final RegistryObject<TrainDoorBlock> PANEL_25B_ORIGINAL_DOOR = register("original_25b_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<Train25BGEndFaceBlock> END_FACE_25B = register("end_face_25b_original",
            () -> new Train25BGEndFaceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25b_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25B_ORIGINAL_BOTTOM = register("panel_25b_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25b_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25B_ORIGINAL_MID = register("panel_25b_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25b_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_WINDOW = register("panel_25b_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25B_WIDE = register("original_color_window_25b_wide",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25B_SMALL = register("original_color_window_25b_small",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25B_TOILET = register("original_color_window_25b_toilet",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainSealedWindowBlock> ORIGINAL_COLOR_WINDOW_25B_WIDE_SEALED = register("original_color_window_25b_wide_sealed",
            () -> new TrainSealedWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25B = register("original_color_window_25b",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //panel_25b_original_top
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_TOP = register("panel_25b_original_top",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_ORIGINAL_TOP_B = register("panel_25b_original_top_b",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TopPanelSlabBlock> SLAB_25B_ORIGINAL_TOP = register("slab_25b_original_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<Train25GLadderBlock> LADDER_25B_ORIGIINAL = register("ladder_25b_original",
            () -> new Train25GLadderBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> END_FACE_25B_ORIGINAL_UPPER = register("end_face_25b_original_upper",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> END_FACE_25B_ORIGINAL_UPPER_2 = register("end_face_25b_original_upper_2",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<Train25BGEndFaceBlock> END_FACE_ORIGINAL_25G = register("end_face_25g_original",
            () -> new Train25BGEndFaceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

//direct_drainage_toilet_original_25b

    public static final RegistryObject<TopPanelSlabBlock> DIRECT_DRAINAGE_TOILET_ORIGINAL_25B = register("direct_drainage_toilet_original_25b",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    //25G
    public static final RegistryObject<TrainDoorBlock> PANEL_25G_ORIGINAL_DOOR = register("original_25g_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25g_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25G_ORIGINAL_BOTTOM = register("panel_25g_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25g_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25G_ORIGINAL_MID = register("panel_25g_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25g_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25G_ORIGINAL_WINDOW = register("panel_25g_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //original_color_window_25g_small
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25G_SMALL = register("original_color_window_25g_small",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25G_SMALL_2 = register("original_color_window_25g_small_2",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> ORIGINAL_COLOR_WINDOW_25G_SEALED_SMALL = register("original_color_window_25g_sealed_small",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25G_TOILET = register("original_color_window_25g_toilet",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //original_color_window_25g_wide
public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25G_WIDE = register("original_color_window_25g_wide",
        () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),1),
        object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<TrainSealedWindowBlock> ORIGINAL_COLOR_WINDOW_25G_WIDE_SEALED = register("original_color_window_25g_wide_sealed",
            () -> new TrainSealedWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //panel_25g_original_top
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25G_ORIGINAL_TOP = register("panel_25g_original_top",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TopPanelSlabBlock> SLAB_25G_ORIGINAL_TOP = register("slab_25g_original_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<Train25GLadderBlock> LADDER_25G_ORIGIINAL = register("ladder_25g_original",
            () -> new Train25GLadderBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainIsolationDoorBlock> ISOLATION_DOOR_25BG = register2("isolation_door_25bg",
            () -> new TrainIsolationDoorBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> END_FACE_25G_ORIGINAL_UPPER = register("end_face_25g_original_upper",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> END_FACE_25G_ORIGINAL_UPPER_2 = register("end_face_25g_original_upper_2",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TopPanelSlabBlock> DIRECT_DRAINAGE_TOILET_ORIGINAL_25G = register("direct_drainage_toilet_original_25g",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    //25K

    public static final RegistryObject<TrainDoorBlock> PANEL_25K_ORIGINAL_DOOR = register("original_25k_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainDoorBlock> PANEL_25K_ORIGINAL_SLIDING_DOOR = register("original_25k_sliding_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //panel_25k_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_BOTTOM = register("panel_25k_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_LINE = register("panel_25k_original_bottom_line",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25k_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25K_ORIGINAL_MID = register("panel_25k_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25k_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25K_ORIGINAL_WINDOW = register("panel_25k_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25K_WIDE = register("original_color_window_25k_wide",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25K_SMALL = register("original_color_window_25k_small",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> ORIGINAL_COLOR_WINDOW_25K_SEALED_SMALL = register("original_color_window_25k_sealed_small",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25K_TOILET = register("original_color_window_25k_toilet",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainSealedWindowBlock> ORIGINAL_COLOR_WINDOW_25K_WIDE_SEALED = register("original_color_window_25k_wide_sealed",
            () -> new TrainSealedWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    //panel_25k_original_top
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25K_ORIGINAL_TOP = register("panel_25k_original_top",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25K_ORIGINAL_SYMBOL = register("panel_25k_original_symbol",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<CarPortBlockBGKZ> CARPORT_25BGZK = register("carport_25bgzk",
            () -> new CarPortBlockBGKZ(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<HXD3DPanelBlocks>VENTIDUCT_25B = register("ventiduct_25b",
            () -> new HXD3DPanelBlocks(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 2),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    //carport_25bgzk_air_condition_all
    public static final RegistryObject<HXD3DPanelBlocks> CARPORT_25BGZKT_CENTRE = register("carport_25bgzkt_centre",
            () -> new HXD3DPanelBlocks(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 2),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<HXD3DPanelBlocks> CARPORT_BSP25T_CENTRE = register("carport_bsp25t_centre",
            () -> new HXD3DPanelBlocks(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 2),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

//carport_25bgzkt_water_tank
public static final RegistryObject<HXD3DPanelBlocks> CARPORT_25BGZKT_WATER_TANK = register("carport_25bgzkt_water_tank",
        () -> new HXD3DPanelBlocks(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 2),
        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<CarPortBlockBGKZ> CARPORT_25BGZK_AIR_CONDITION_ALL = register("carport_25bgzk_air_condition_all",
            () -> new CarPortBlockBGKZ(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));




    public static final RegistryObject<Train25GLadderBlock> LADDER_25K_ORIGIINAL = register("ladder_25k_original_sliding",
            () -> new Train25GLadderBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<TopPanelSlabBlock> DIRECT_DRAINAGE_TOILET_ORIGINAL_25K = register("direct_drainage_toilet_original_25k",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //carport_25bgzk_air_condition_side

    public static final RegistryObject<DF11GMirrorCarportBlock> CARPORT_25BGZK_AIR_CONDITION_SIDE = register("carport_25bgzk_air_condition_side",
            () -> new DF11GMirrorCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<TopPanelSlabBlock> SLAB_25K_ORIGINAL_TOP = register("slab_25k_original_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //end_face_25k_original
    public static final RegistryObject<Train25KTEndFaceBlock> END_FACE_25K_ORIGINAL = register("end_face_25k_original",
            () -> new Train25KTEndFaceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> END_FACE_25K_ORIGINAL_UPPER = register("end_face_25k_original_upper",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> END_FACE_25K_ORIGINAL_UPPER_2 = register("end_face_25k_original_upper_2",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<Train25BGEndFaceBlock> END_FACE_25K_ORIGINAL_RUBBER = register("end_face_25k_original_rubber",
            () -> new Train25BGEndFaceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> END_FACE_25K_ORIGINAL_RUBBER_UPPER = register("end_face_25k_original_rubber_upper",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> END_FACE_25K_ORIGINAL_RUBBER_UPPER_2 = register("end_face_25k_original_rubber_upper_2",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //25T
    public static final RegistryObject<TrainDoorBlock> PANEL_25T_ORIGINAL_DOOR = register("original_25t_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainDoorBlock> PANEL_25T_ORIGINAL_SLIDING_DOOR = register("original_25t_sliding_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //panel_25t_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_BOTTOM = register("panel_25t_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //panel_25t_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_MID = register("panel_25t_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_MID_B = register("panel_25t_original_mid_b",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_TOP_B = register("panel_25t_original_top_b",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_BOTTOM_B = register("panel_25t_original_bottom_b",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<Train25GLadderBlock> LADDER_25T_ORIGIINAL = register("ladder_25t_original_sliding",
            () -> new Train25GLadderBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


//    public static final RegistryObject<TrainPanelSignBlock> TRAIN_PANEL_SIGN_BLOCK= register("train_panel_sign_block",
//            () -> new TrainPanelSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN),WoodTypeInit.TrainPanel),
//            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));


//    public static final RegistryObject<Block> TRAIN_PANEL_SIGN_BLOCK1= registerBlock("train_panel_sign_block1",
//            () -> new TrainPanelSignBlock2(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN),WoodTypeInit.TrainPanel));

    public static final RegistryObject<Block> TRAIN_PANEL_SIGN_BLOCK = registerBlockWithoutBlockItem("train_panel_sign_block",
            () -> new TrainPanelSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), WoodTypeInit.TrainPanel));

    public static final RegistryObject<Block> TRAIN_PANEL_SIGN_BLOCK1 = registerBlockWithoutBlockItem("train_panel_sign_block1",
            () -> new TrainPanelSignBlock2(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.TrainPanel));
    //panel_25t_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_ORIGINAL_WINDOW = register("panel_25t_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_BLUE = register("original_color_window_25t_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_SEALED_BLUE = register("original_color_window_25t_sealed_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_SMALL = register("original_color_window_25t_small",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_SMALL_BLUE = register("original_color_window_25t_small_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_BSP25T_SMALL_BLUE = register("original_color_window_bsp25t_small_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_SEALED_SMALL = register("original_color_window_25t_sealed_small",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_SEALED_SMALL_BLUE = register("original_color_window_25t_sealed_small_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_BSP25T_SEALED_SMALL_BLUE = register("original_color_window_bsp25t_sealed_small_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_TOILET = register("original_color_window_25t_toilet",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_TOILET_BLUE = register("original_color_window_25t_toilet_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_BSP25T_TOILET_BLUE = register("original_color_window_bsp25t_toilet_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),0),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_WIDE = register("original_color_window_25t_wide",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_25T_WIDE_BLUE = register("original_color_window_25t_wide_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainOpenableWindowBlock> ORIGINAL_COLOR_WINDOW_BSP25T_WIDE_BLUE = register("original_color_window_bsp25t_wide_blue",
            () -> new TrainOpenableWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainSealedWindowBlock> ORIGINAL_COLOR_WINDOW_25T_WIDE_SEALED = register("original_color_window_25t_wide_sealed",
            () -> new TrainSealedWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainSealedWindowBlock> ORIGINAL_COLOR_WINDOW_25T_WIDE_SEALED_BLUE = register("original_color_window_25t_wide_sealed_blue",
            () -> new TrainSealedWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainSealedWindowBlock> ORIGINAL_COLOR_WINDOW_BSP25T_WIDE_SEALED_BLUE = register("original_color_window_bsp25t_wide_sealed_blue",
            () -> new TrainSealedWindowBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //panel_25t_original_top
    public static final RegistryObject<TrainPanelBlock> PANEL_25T_ORIGINAL_TOP = register("panel_25t_original_top",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> PANEL_XL25T_ORIGINAL_TOP = register("panel_xl25t_original_top",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_ORIGINAL_SKIRT = register("panel_25t_original_skirt",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25T_ORIGINAL_SKIRT_SIDE = register("panel_25t_original_skirt_side",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<CarPortBlockBGKZ> CARPORT_25T = register("carport_25t",
            () -> new CarPortBlockBGKZ(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<CarPortBlockBGKZ> CARPORT_25T_TOILET = register("carport_25t_toilet",
            () -> new CarPortBlockBGKZ(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));



    public static final RegistryObject<BSP25TAirConditionBlock> AIR_CODITION_BSP25T = register("air_condition_bsp25t",
            () -> new BSP25TAirConditionBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TopPanelSlabBlock> SLAB_25T_ORIGINAL_TOP = register("slab_25t_original_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    //widepanel_bsp25t_original_mid
    public static final RegistryObject<TrainPanelBlock> WIDEPANEL_BSP25T_ORIGINAL_MID = register("widepanel_bsp25t_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> END_FACE_25T_ORIGINAL_UPPER = register("end_face_25t_original_upper",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> END_FACE_25T_ORIGINAL_UPPER_2 = register("end_face_25t_original_upper_2",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<Train25BGEndFaceBlock> END_FACE_25T_ORIGINAL_RUBBER = register("end_face_25t_original_rubber",
            () -> new Train25BGEndFaceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TrainPanelBlock> END_FACE_25T_ORIGINAL_RUBBER_UPPER = register("end_face_25t_original_rubber_upper",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> END_FACE_25T_ORIGINAL_RUBBER_UPPER_2 = register("end_face_25t_original_rubber_upper_2",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<TopPanelSlabBlock> DIRECT_DRAINAGE_TOILET_ORIGINAL_25T = register("direct_drainage_toilet_original_25t",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    //刷绿shualv
    public static final RegistryObject<TrainDoorBlock> PANEL_25_MARSHALLED_DOOR = register("marshalled_25_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_BOTTOM = register("panel_25_marshalled_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_BOTTOM_LINE = register("panel_25_marshalled_bottom_line",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_MID = register("panel_25_marshalled_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_TOP = register("panel_25_marshalled_top",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_TOP_B = register("panel_25_marshalled_top_b",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<PanelBlock25Side> PANEL_25B_MARSHALLED_SYMBOL = register("panel_25b_marshalled_symbol",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25G_MARSHALLED_SYMBOL = register("panel_25g_marshalled_symbol",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25K_MARSHALLED_SYMBOL = register("panel_25k_marshalled_symbol",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_MARSHALLED_WINDOW = register("panel_25b_marshalled_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TopPanelSlabBlock> SLAB_25_MARSHALLED_TOP = register("slab_25_marshalled_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25_MARSHALLED_WINDOW = register("panel_25_marshalled_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_MARSHALLED_SKIRT = register("panel_25t_marshalled_skirt",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<PanelBlock25Side> PANEL_25T_MARSHALLED_SKIRT_SIDE = register("panel_25t_marshalled_skirt_side",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<Train25KTEndFaceBlock> END_FACE_25T_ORIGINAL = register("end_face_25t_original",
            () -> new Train25KTEndFaceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));


    //刷绿shualv
    public static final RegistryObject<TrainDoorBlock> PANEL_25_MARSHALLED_DOOR = register("marshalled_25_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_BOTTOM = register("panel_25_marshalled_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_BOTTOM_LINE = register("panel_25_marshalled_bottom_line",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_MID = register("panel_25_marshalled_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_TOP = register("panel_25_marshalled_top",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainPanelBlock> PANEL_25_MARSHALLED_TOP_B = register("panel_25_marshalled_top_b",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<PanelBlock25Side> PANEL_25B_MARSHALLED_SYMBOL = register("panel_25b_marshalled_symbol",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25G_MARSHALLED_SYMBOL = register("panel_25g_marshalled_symbol",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<PanelBlock25Side> PANEL_25K_MARSHALLED_SYMBOL = register("panel_25k_marshalled_symbol",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25B_MARSHALLED_WINDOW = register("panel_25b_marshalled_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TopPanelSlabBlock> SLAB_25_MARSHALLED_TOP = register("slab_25_marshalled_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25_MARSHALLED_WINDOW = register("panel_25_marshalled_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25T_MARSHALLED_SKIRT = register("panel_25t_marshalled_skirt",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<PanelBlock25Side> PANEL_25T_MARSHALLED_SKIRT_SIDE = register("panel_25t_marshalled_skirt_side",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));


    //受电弓
    public static final RegistryObject<PantographBlock> PANTOGRAPH = register("pantograph",
            () -> new PantographBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<PanelBlockHalf> SMOOTH_QUARTZ_PANEL_HALF = register("smooth_quartz_panel_half",
            () -> new PanelBlockHalf(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<PanelBlock4> SMOOTH_QUARTZ_PANEL_4 = register("smooth_quartz_panel_4",
            () -> new PanelBlock4(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<PanelBlock2> SMOOTH_QUARTZ_PANEL_2 = register("smooth_quartz_panel_2",
            () -> new PanelBlock2(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<AngleBlock22> SMOOTH_QUARTZ_ANGLE_22_UP = register("smooth_quartz_angle_22_up",
            () -> new AngleBlock22(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //粘土板
    public static final RegistryObject<Block> CLAY_SLAB = register("clay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.STONE).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //clay_stairs
    public static final RegistryObject<StairBlock> CLAY_STAIRS = register("clay_stairs",
            () -> new StairBlock(Blocks.CLAY::defaultBlockState, BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<GreenInsulationFenceBlock> GREEN_FENCE = register("green_fence",
            () -> new GreenInsulationFenceBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.STONE).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE),0),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<GreenInsulationFenceBlock> GREEN_FENCE_45 = register("green_fence_45",
            () -> new GreenInsulationFenceBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.STONE).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE),1),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //车棚

    //接触网
    //Catenary_Pole
    public static final RegistryObject<CatenaryPoleBlock> Catenary_Pole = register("catenary_pole",
            () -> new CatenaryPoleBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_CATENARY)));
    public static final RegistryObject<CatenaryGridBlock> Catenary_Grid = register("catenary_grid",
            () -> new CatenaryGridBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_CATENARY)));

    public static final RegistryObject<CatenaryGridBlock> Hang_Catenary_Grid = register("hang_catenary_grid",
            () -> new CatenaryGridBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_CATENARY)));
    public static final RegistryObject<SeatedSignalBlock> Station_Entrance_Signal = register("station_entrance_signal",
            () -> new SeatedSignalBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<SeatedSignalBlock> Shunting_Signal = register("shunting_signal",
            () -> new SeatedSignalBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TrainSignBlock> No_Double_Pantograph = register("no_double_pantograph",
            () -> new TrainSignBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));
    public static final RegistryObject<TrainSignBlock> Switch_Off_Sign = register("switch_off_sign",
            () -> new TrainSignBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TrainSignBlock> Switch_On_Sign = register("switch_on_sign",
            () -> new TrainSignBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<SignalPoleBlock> Signal_Pole = register("signal_pole",
            () -> new SignalPoleBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<SignalPoleLightBlock> Signal_Pole_Light = register("signal_pole_light",
            () -> new SignalPoleLightBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<CatenaryPoleBlock> Concrete_Pole = register("concrete_pole",
            () -> new CatenaryPoleBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_CATENARY)));

    public static final RegistryObject<TactilePavingBlock> TactilePavingStraight = register("tactile_paving_straight",
            () -> new TactilePavingBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<TactilePavingBlock> TactilePavingPin = register("tactile_paving_pin",
            () -> new TactilePavingBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<FlourescentLightBlock> FlourescentLight = register("flourescent_light",
            () -> new FlourescentLightBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion().lightLevel(state -> 15)),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<MegaPhoneBlock> MEGAPHONE = register("megaphone",
            () -> new MegaPhoneBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties().tab(Main.KUAYUE_MAIN)));

    //cr200j

    public static final RegistryObject<TrainPanelBlock> WIDEPANEL_CR200J_MARSHALLED_MID = register2("widepanel_cr200j_marshalled_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_CR200J_MARSHALLED_TOP = register2("panel_cr200j_marshalled_top",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TrainGlassPanelBlock> PANEL_CR200J_MARSHALLED_BOTTOM = register2("panel_cr200j_marshalled_bottom",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

    public static final RegistryObject<TopPanelSlabBlock> SLAB_CR200J_MARSHALLED_TOP = register2("slab_cr200j_marshalled_top",
            () -> new TopPanelSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_NormalSpeedPassageCarriageTab)));

//    public static final RegistryObject<TrainPanelBlock> DF11G_FRONT = register("df11g_front",
//            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL,MaterialColor.NONE).strength(3.0f)
//                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
//                    new Item.Properties().tab(Main.KUAYUE_LOCOS)));
public static final RegistryObject<DF11GCowcatcherBlock> DF11G_COWCATCHER = register("df11g_cowcatcher",
        () -> new DF11GCowcatcherBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<DF11GMirrorCarportBlock> DF11G_CARPORT_1 = register("df11g_carport_1",
            () -> new DF11GMirrorCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<DF11GMirrorCarportBlock> DF11G_CARPORT_2 = register("df11g_carport_2",
            () -> new DF11GMirrorCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_GENERAL = register("df11g_carport_general",
            () -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_LOUVER = register("df11g_carport_louver",
            () -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
    public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_LOUVER_2 = register("df11g_carport_louver_2",
            () -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
    public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_LOUVER_3 = register("df11g_carport_louver_3",
            () -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),1),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<DF11GCarportBlock> DF11G_CARPORT_KUAYUE = register("df11g_carport_kuayue",
            () -> new DF11GCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),3),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<DF11GPanel3Wide> DF11G_PANEL_KUAYUE = register("df11g_panel_kuayue",
            () -> new DF11GPanel3Wide(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),3),
            object -> () -> new ToolTipsItemHelper(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<PanelBlock2> DF11G_PANEL_GENERAL = register("df11g_panel_general",
            () -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<PanelBlock2> DF11G_PANEL_MID_GENERAL = register("df11g_panel_mid_general",
            () -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<PanelBlock2> DF11G_PANEL_SHADES = register("df11g_panel_shades",
            () -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
    public static final RegistryObject<PanelBlock2> DF11G_PANEL_MID_WINDOW= register("df11g_panel_mid_window",
            () -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
    public static final RegistryObject<PanelBlock2> DF11G_PANEL_MID_SHADES = register("df11g_panel_mid_shades",
            () -> new PanelBlock2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
//df11g_panel_cr
public static final RegistryObject<DF11GPanel3Wide> DF11G_PANEL_CR = register("df11g_panel_cr",
        () -> new DF11GPanel3Wide(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),3),
        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<DF11GMirrorCarportBlock> DF11G_PANEL_MID_FRONT_2= register("df11g_panel_mid_front_2",
            () -> new DF11GMirrorCarportBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(),2),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<PanelBlock25Side> DF11G_PANEL_MID_FRONT = register("df11g_panel_mid_front",
            () -> new PanelBlock25Side(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<DF11GEndFaceBlock> DF11G_END_FACE = register("df11g_end_face",
            () -> new DF11GEndFaceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<TrainDoorBlock> DF11G_CAB_DOOR = register("df11g_cab_door",
            () -> new TrainDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<HXD3DCabDoorBlock> DF11G_EQUIP_ROOM_DOOR = register("df11g_equip_room_door",
            () -> new HXD3DCabDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<HXD3DPanelBlocks> HXD3D_PANEL_RED = register("hxd3d_panel_red",
            () -> new HXD3DPanelBlocks(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 0),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<HXD3DPanelBlocks> HXD3D_PANEL_HEXIE = register("hxd3d_panel_hexie",
            () -> new HXD3DPanelBlocks(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 1),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));
    public static final RegistryObject<HXD3DPanelBlocks> HXD3D_CARPORT_GENERAL = register("hxd3d_carport_general",
            () -> new HXD3DPanelBlocks(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion(), 2),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<Block> HXD3D_SLAB = register("hxd3d_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.STONE).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));

    public static final RegistryObject<HXD3DCabDoorBlock> HXD3D_CAB_DOOR = register("hxd3d_cab_door",
            () -> new HXD3DCabDoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_LOCOS)));


    public static final RegistryObject<PanelBlockHalf> BOILING_WATER_PLACE = register("boiling_water_place",
            () -> new PanelBlockHalf(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<MegaPhoneBlock> MEGAPHONE = register("megaphone",
            () -> new MegaPhoneBlock(BlockBehaviour.Properties.of(Material.STONE,MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops().noOcclusion()),object -> () -> new BlockItem(object.get(),
                    new Item.Properties()));//.tab(Main.KUAYUE_GROUND)));

    private static <T extends Block> RegistryObject<T> registerBlock(final String name,
                                                                     final Supplier<? extends T> block) {
        //LOGGER.info("rigister block:"+name);
        return BLOCKS.register(name, block);

    }


    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                                                Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        LOGGER.info("rigister block:"+name);
        return obj;
    }
    private static <T extends Block> RegistryObject<T> register2(final String name, final Supplier<? extends T> block,
                                                                Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        //ITEMS.register(name, item.apply(obj));
        LOGGER.info("rigister block:"+name);
        return obj;
    }
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

}

