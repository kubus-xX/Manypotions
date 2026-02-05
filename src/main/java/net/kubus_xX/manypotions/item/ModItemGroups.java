package net.kubus_xX.manypotions.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kubus_xX.manypotions.AlcoholMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MANY_POTIONS_MOD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AlcoholMod.MOD_ID, "mystical_alcohol"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BEER_GLASS))
                    .displayName(Text.translatable("Many Potions"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CRUSHED_NETHER_STAR);
                        entries.add(ModItems.BEER_GLASS);
                        entries.add(ModItems.YEAST);
                    }).build());


    public static void registerItemGroups() {
        AlcoholMod.LOGGER.info("Registering Item Groups for " + AlcoholMod.MOD_ID);
    }
}
