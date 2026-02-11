package net.kubus_xX.manypotions.effect;

import net.kubus_xX.manypotions.AlcoholMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> DRUNK = registerStatusEffect("drunk",
            new DrunkEffect(StatusEffectCategory.NEUTRAL,0xC2E5E5)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(AlcoholMod.MOD_ID, "drunk"), -0.15f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    //public static final RegistryEntry<StatusEffect> RESISTANT = registerStatusEffect("resistant",
            //new ResistantEffect(StatusEffectCategory.NEUTRAL,0xC2E5E5)
            //.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            //Identifier.of(AlcoholMod.MOD_ID, "resistant"), -0.1f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final RegistryEntry<StatusEffect> CLEAR = registerStatusEffect("clear",
            new ClearEffect(StatusEffectCategory.NEUTRAL,0xe9f0ef)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(AlcoholMod.MOD_ID, "clear"), -0f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final RegistryEntry<StatusEffect> EXTINGUISH = registerStatusEffect("extinguish",
            new ExtinguishEffect(StatusEffectCategory.NEUTRAL,0x1373e8)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(AlcoholMod.MOD_ID, "extinguish"), -0f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final RegistryEntry<StatusEffect> WITHER = registerStatusEffect("firefly",
            new WitherEffect(StatusEffectCategory.NEUTRAL,0x080a09)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(AlcoholMod.MOD_ID, "wither"), -0f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));




//ExtinguishEffect
    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(AlcoholMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        AlcoholMod.LOGGER.info("Registering Mod Effects for " + AlcoholMod.MOD_ID);
    }
}
