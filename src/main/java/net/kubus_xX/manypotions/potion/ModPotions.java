package net.kubus_xX.manypotions.potion;

import net.kubus_xX.manypotions.AlcoholMod;
import net.kubus_xX.manypotions.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
 public static final RegistryEntry<Potion> BEER = registerPotion("beer",
         new Potion(new StatusEffectInstance(ModEffects.DRUNK, 1200, 0)));

    public static final RegistryEntry<Potion> LUCK_POTION = registerPotion("luck_potion",
            new Potion(new StatusEffectInstance(StatusEffects.LUCK,3600, 0)));

    public static final RegistryEntry<Potion> LUCK_POTION_2 = registerPotion("luck_potion_2",
            new Potion(new StatusEffectInstance(StatusEffects.LUCK,2400, 1)));

    public static final RegistryEntry<Potion> SPEED_POTION_3 = registerPotion("speed_potion_3",
            new Potion(new StatusEffectInstance(StatusEffects.SPEED,2400, 2)));

    public static final RegistryEntry<Potion> GLOWING_POTION = registerPotion("glowing_potion",
            new Potion(new StatusEffectInstance(StatusEffects.GLOWING,12000, 0)));

    public static final RegistryEntry<Potion> LONG_GLOWING_POTION = registerPotion("long_glowing_potion",
            new Potion(new StatusEffectInstance(StatusEffects.GLOWING,24000, 0)));

    public static final RegistryEntry<Potion> MILK_POTION = registerPotion("milk_potion",
            new Potion(new StatusEffectInstance(ModEffects.CLEAR,30, 0)));

    public static final RegistryEntry<Potion> WATER_POTION = registerPotion("water_potion",
            new Potion(new StatusEffectInstance(ModEffects.EXTINGUISH,3600, 0)));

   public static final RegistryEntry<Potion> WITHER_POTION = registerPotion("wither_potion",
           new Potion(new StatusEffectInstance(StatusEffects.WITHER,400, 0)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(AlcoholMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        AlcoholMod.LOGGER.info("Registering Mod Potions for " + AlcoholMod.MOD_ID);
    }
}
