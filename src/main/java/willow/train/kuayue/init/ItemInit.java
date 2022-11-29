package willow.train.kuayue.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Supplier;

import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import willow.train.kuayue.Main;
import willow.train.kuayue.Items.foods.Food1;
import willow.train.kuayue.effect.EffectInit;

public class ItemInit {
	public static final Logger LOGGER = LoggerFactory.getLogger("KuaYue");
	// 注册机
	public static final LazyRegistrar<Item> ITEMS = LazyRegistrar.create(Registry.ITEM,
			Main.MOD_ID);
	public static final RegistryObject<Item> CA_25T = register("ca_25t",
			() -> new Item(new Item.Properties()));

	public static final RegistryObject<Item> SERIES_25_LOGOS = register("series25_logos",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> LOCO_LOGOS = register("loco_logos",
			() -> new Item(new Item.Properties()));

	// 火车餐1
	public static final RegistryObject<Item> TRAIN_DIET_1 = register("train_diet_1",
			() -> new Food1(new Item.Properties().tab(Main.KUAYUE_DIET).food(
					new FoodProperties.Builder().nutrition(4).saturationMod(2.5F)
							.effect(new MobEffectInstance(MobEffects.HUNGER, 1000, 0,
									false, true), 1.0F)
							.effect(new MobEffectInstance(MobEffects.CONFUSION, 1000,
									0, false, true), 1.0F)
							.effect(new MobEffectInstance(
									EffectInit.NOODLE_SMELL.get(), 2000, 0, false,
									true), 1.0F)
							.alwaysEat().alwaysEat().build())));
	// public static final RegistryObject<Item> TRAIN_PANEL_SIGN_ITEM =
	// register("train_panel_sign_item",
	// () -> new SignItem(new Item.Properties().tab(Main.KUAYUE_MAIN),
	// BlockInit.TRAIN_PANEL_SIGN_BLOCK.get(),
	// BlockInit.TRAIN_PANEL_SIGN_BLOCK1.get()));
	//
	// public static final RegistryObject<Item> TRAIN_PANEL_SIGN_ITEM =
	// ITEMS.register("train_panel_sign_item",
	// () -> new SignItem(new Item.Properties().tab(Main.KUAYUE_MAIN).stacksTo(16),
	// BlockInit.TRAIN_PANEL_SIGN_BLOCK1.get(),
	// BlockInit.TRAIN_PANEL_SIGN_BLOCK.get()));

	// public static final RegistryObject<Item> DF11G_BOGEY_ITEM =
	// ITEMS.register("df11g_bogey",
	// () -> new BlockItem(KYCreateBlock.DF11G_BOGEY.get(),new
	// Item.Properties().tab(Main.KUAYUE_DIET)));
	// public static final RegistryObject<Item> TRAIN_PANEL_SIGN_ITEM =
	// ITEMS.register("train_panel_sign_item",
	// () -> new BlockItem(BlockInit.TRAIN_PANEL_SIGN_BLOCK.get(), new
	// Item.Properties().tab(Main.KUAYUE_MAIN)));
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}

}
