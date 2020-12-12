package com.technoship.examplemod.util;

import com.technoship.examplemod.ExampleMod;
import com.technoship.examplemod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items:
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper", ItemBase::new); // copy paste
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
}
