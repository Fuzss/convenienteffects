package fuzs.convenienteffects.fabric;

import fuzs.convenienteffects.ConvenientEffects;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class ConvenientEffectsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(ConvenientEffects.MOD_ID, ConvenientEffects::new);
    }
}
