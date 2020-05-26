package de.igamblenull.healthyhuman.items;

import de.igamblenull.healthyhuman.Main;
import de.igamblenull.healthyhuman.init.ModItems;
import de.igamblenull.healthyhuman.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
