package xyz.jpuf.katanalib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.jpuf.katanalib.item.KatanaItem;

public class KatanaLib implements ModInitializer {

    @Override
    public void onInitialize() {
        if(FabricLoader.getInstance().isDevelopmentEnvironment()) {
            Registry.register(
                    Registry.ITEM,
                    new Identifier("katanalib", "test"),
                    new KatanaItem(ToolMaterials.DIAMOND, 0, 0, new Item.Settings())
            );
        }
    }

    public static Identifier id(String name) {
        return new Identifier("KatanaLib", name);
    }
}
