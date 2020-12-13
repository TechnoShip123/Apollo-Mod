package com.technoship.apollomod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {
    public RubyBlock(Properties properties) {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(4.0f,5.0f)
                .sound(SoundType.METAL) //Experiment with different sounds(?)
                .harvestLevel(2) //0 = wooden, 1 = stone/gold, 2 = iron, 3 = diamond. This is the level of tool required to pick up the block.
                .harvestTool(ToolType.PICKAXE) //Set the tool used to mine the block.
                .lightValue(2)
                .jumpFactor(8) //TODO: Remove this later
        );
    }
}
