package net.kubus_xX.manypotions;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.kubus_xX.manypotions.block.ModBlocks;
import net.kubus_xX.manypotions.effect.ModEffects;
import net.kubus_xX.manypotions.item.ModItemGroups;
import net.kubus_xX.manypotions.item.ModItems;
import net.kubus_xX.manypotions.potion.ModPotions;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class AlcoholMod implements ModInitializer {
	public static final String MOD_ID = "manypotions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEffects.registerEffects();
		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.NIGHT_VISION, Items.GOLDEN_APPLE, ModPotions.LUCK_POTION);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(ModPotions.LUCK_POTION, Items.GLOWSTONE, ModPotions.LUCK_POTION_2);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.STRONG_SWIFTNESS, ModItems.CRUSHED_NETHER_STAR, ModPotions.SPEED_POTION_3);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.WATER, ModItems.YEAST, ModPotions.BEER);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.WATER, Items.FERMENTED_SPIDER_EYE, ModPotions.BEER);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.GLOW_BERRIES, ModPotions.GLOWING_POTION);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(ModPotions.GLOWING_POTION, Items.GLOWSTONE, ModPotions.LONG_GLOWING_POTION);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.MILK_BUCKET, ModPotions.MILK_POTION);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.PUFFERFISH, ModPotions.BLINDNESS_POTION);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(ModPotions.BLINDNESS_POTION, Items.GLOWSTONE, ModPotions.BLINDNESS_POTION_LONG);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.WATER_BUCKET, ModPotions.WATER_POTION);
		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, ModPotions.WITHER_POTION);
		});
	}
}


