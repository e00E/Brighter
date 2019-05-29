package brighter;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.options.Option;

public class Brighter implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Option.GAMMA.setMax(10);
    }
}