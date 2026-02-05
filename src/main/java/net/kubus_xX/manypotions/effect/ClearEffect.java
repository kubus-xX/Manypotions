package net.kubus_xX.manypotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class ClearEffect extends StatusEffect {
    protected ClearEffect(StatusEffectCategory statusEffectCategory, int i) {
        super(statusEffectCategory, i);
    }


    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity playerEntity) {
            playerEntity.removeStatusEffect(StatusEffects.NAUSEA);
            playerEntity.removeStatusEffect(StatusEffects.SLOWNESS);
            playerEntity.removeStatusEffect(StatusEffects.BLINDNESS);
            playerEntity.removeStatusEffect(StatusEffects.HUNGER);
            playerEntity.removeStatusEffect(StatusEffects.WEAKNESS);
            playerEntity.removeStatusEffect(StatusEffects.POISON);
            playerEntity.removeStatusEffect(StatusEffects.WITHER);
            playerEntity.removeStatusEffect(StatusEffects.INFESTED);
        }

        return true;
    }

        public boolean canApplyUpdateEffect ( int duration, int amplifier){ return true;
        }
    }


