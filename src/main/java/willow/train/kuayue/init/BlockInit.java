package willow.train.kuayue.init;

import java.util.function.Function;
import com.google.common.base.Supplier;
import net.minecraft.world.level.block.*;
import willow.train.kuayue.Blocks.*;
import willow.train.kuayue.Main;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    //注册机
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Main.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    //粘土板
    public static final RegistryObject<Block> CLAY_SLAB = register("clay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.STONE).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

    public static final RegistryObject<Block> CR_LOGO = register("cr_logo",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25g_original_bottom
    public static final RegistryObject<TrainPanelBlock> PANEL_25G_ORIGINAL_BOTTOM = register("panel_25g_original_bottom",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25g_original_mid
    public static final RegistryObject<TrainPanelBlock> PANEL_25G_ORIGINAL_MID = register("panel_25g_original_mid",
            () -> new TrainPanelBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.PLANT).strength(3.0f)
                    .sound(SoundType.NETHER_BRICKS).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25g_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25G_ORIGINAL_WINDOW = register("panel_25g_original_window",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //panel_25g_original_window
    public static final RegistryObject<TrainGlassPanelBlock> PANEL_25G_ORIGINAL_TOP = register("panel_25g_original_top",
            () -> new TrainGlassPanelBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //original_25g_door
    public static final RegistryObject<DoorBlock> PANEL_25G_ORIGINAL_DOOR = register("original_25g_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.WATER).strength(3.0f)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    //受电弓
    public static final RegistryObject<PantographBlock> PANTOGRAPH = register("pantograph",
            () -> new PantographBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));

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
    //clay_stairs
    public static final RegistryObject<StairBlock> CLAY_STAIRS = register("clay_stairs",
            () -> new StairBlock(() -> Blocks.CLAY.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).strength(3.0f)
                    .sound(SoundType.COPPER).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Main.KUAYUE_MAIN)));
    private static <T extends Block> RegistryObject<T> registerBlock(final String name,
                                                                     final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }


    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                                                Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
    private static <T extends Block> RegistryObject<T> register2(final String name, final Supplier<? extends T> block,
                                                                Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        //ITEMS.register(name, item.apply(obj));
        return obj;
    }
}

