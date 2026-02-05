package net.kubus_xX.manypotions.entity;

import net.kubus_xX.manypotions.AlcoholMod;

public class ModEntities {
    //public static final EntityType<MantisEntity> MANTIS = Registry.register(Registries.ENTITY_TYPE,
            //Identifier.of(AlcocholMod.MOD_ID, "mantis"),
            //EntityType.Builder.create(MantisEntity::new, SpawnGroup.CREATURE)
                    //.dimensions(1f, 2.5f).build());

    public static void registerModEntities() {
        AlcoholMod.LOGGER.info("Registering Mod Entities for " + AlcoholMod.MOD_ID);
    }
}
