package com.legopitstop.basaltblocks.blocks.basalt;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BasaltSlab extends SlabBlock {
    // field_235587_I_ -> BASALT
    // func_235861_h_  -> setRequiresTool
    public BasaltSlab() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.25f,4.2f)
                .sound(SoundType.BASALT)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
