package net.kubus_xX.manypotions.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kubus_xX.manypotions.AlcoholMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CRUSHED_NETHER_STAR = registerItem("crushed_nether_star", new Item(new Item.Settings()));
    public static final Item YEAST = registerItem("yeast", new Item(new Item.Settings()));
    public static final Item BEER_GLASS = registerItem("beer_glass", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AlcoholMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AlcoholMod.LOGGER.info("Registering Mod Items for " + AlcoholMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });
    }
}
