package de.igamblenull.healthyhuman.init;

import de.igamblenull.healthyhuman.items.HeartContainerTier1;
import de.igamblenull.healthyhuman.items.HeartContainerTier2;
import de.igamblenull.healthyhuman.items.HeartContainerTier3;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item HeartContainerTier1 = new HeartContainerTier1("heart_container_tier1");
    public static final Item HeartContainerTier2 = new HeartContainerTier2("heart_container_tier2");
    public static final Item HeartContainerTier3 = new HeartContainerTier3("heart_container_tier3");
}
