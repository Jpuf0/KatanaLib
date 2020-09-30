package xyz.jpuf.katanalib.item;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;

public class KatanaItem extends SwordItem {

    private int launchDistance = 1;

    public KatanaItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, int launchDistance) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.launchDistance = launchDistance;
    }

    public KatanaItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        this(toolMaterial, attackDamage, attackSpeed, settings, 1);
    }
}
