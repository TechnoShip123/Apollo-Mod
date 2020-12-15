package com.technoship.apollomod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOreBlock extends Block{

    public RubyOreBlock() {

        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(4.0f,6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .lightValue(2)
                .harvestTool(ToolType.PICKAXE));
    }
}
