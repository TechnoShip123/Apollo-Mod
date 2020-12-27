package com.technoship.apollomod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block{

    public RubyBlock() {

        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f,5.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .lightValue(2)
                .harvestTool(ToolType.PICKAXE));

    }
}
