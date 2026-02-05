package net.kubus_xX.manypotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class DrunkEffect extends StatusEffect {
    protected DrunkEffect(StatusEffectCategory statusEffectCategory, int i) {
        super(statusEffectCategory, i);
    }


    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity playerEntity) {
            playerEntity.addExhaustion(0.005F * (float)(amplifier + 1));
        }

        return true;
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

