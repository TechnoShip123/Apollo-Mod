package com.technoship.examplemod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(ItemGroup.MATERIALS));  // It belongs in the Materials Tab (C Inventory)
    }
}
