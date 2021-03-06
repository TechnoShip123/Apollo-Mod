package com.technoship.apollomod.util;

import com.technoship.apollomod.ApolloMod;
import com.technoship.apollomod.blocks.BlockItemBase;
import com.technoship.apollomod.blocks.RubyBlock;
import com.technoship.apollomod.items.ItemBase;
import com.technoship.apollomod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.tools.Tool;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ApolloMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ApolloMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items:
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper", ItemBase::new); // copy paste
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    // Tools:
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 4, -2.4F, new Item.Properties().group(ApolloMod.TAB)));

    // Blocks:
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE_BLOCK = BLOCKS.register("ruby_ore_block", RubyBlock::new);

    // Block Items: (What you hold in your hand)
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_BLOCK_ITEM = ITEMS.register("ruby_ore_block", () -> new BlockItemBase(RUBY_ORE_BLOCK.get()));

}
