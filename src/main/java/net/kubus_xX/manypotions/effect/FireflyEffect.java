package net.kubus_xX.manypotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class FireflyEffect extends StatusEffect {
    protected FireflyEffect(StatusEffectCategory statusEffectCategory, int i) {
        super(statusEffectCategory, i);
    }


    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity playerEntity) {
        };

        return true;
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
