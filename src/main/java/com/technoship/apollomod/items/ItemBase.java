package com.technoship.apollomod.items;

import com.technoship.apollomod.ApolloMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(ApolloMod.TAB));  // It belongs in the Apollo Mod Tab (C Inventory)
    }
}
