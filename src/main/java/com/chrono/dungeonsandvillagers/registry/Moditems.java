package com.chrono.dungeonsandvillagers.registry;

import com.chrono.dungeonsandvillagers.dungeonsandvillagers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moditems {

    public static final Item ruby = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(dungeonsandvillagers.MOD_ID, "ruby"), ruby);
    }
}
