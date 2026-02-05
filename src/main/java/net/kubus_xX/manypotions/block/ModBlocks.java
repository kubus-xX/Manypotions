package net.kubus_xX.manypotions.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kubus_xX.manypotions.AlcoholMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final IntProperty STATE_INT = IntProperty.of("state", 0, 2);


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(AlcoholMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AlcoholMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AlcoholMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AlcoholMod.LOGGER.info("Registering Mod Blocks for " + AlcoholMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}
