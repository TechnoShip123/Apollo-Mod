package com.technoship.apollo.util;

import com.technoship.apollo.ApolloMod;
import com.technoship.apollo.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ApolloMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items:
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper", ItemBase::new); // copy paste
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
}
