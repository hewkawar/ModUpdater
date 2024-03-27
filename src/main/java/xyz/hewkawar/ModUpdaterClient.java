package xyz.hewkawar;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public class ModUpdaterClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for (ModContainer modContainer : FabricLoader.getInstance().getAllMods()) {
            String mod = modContainer.getMetadata().getId() + " " + modContainer.getMetadata().getVersion();
            ModUpdater.LOGGER.info(mod);
        }
    }
}
