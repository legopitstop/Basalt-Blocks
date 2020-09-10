package com.legopitstop.basaltblocks.blocks.basalt;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BasaltPillar extends RotatedPillarBlock {
    // field_235587_I_ -> BASALT
    // func_235861_h_  -> setRequiresTool
    public BasaltPillar() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.25f,4.2f)
                .sound(SoundType.field_235587_I_)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .func_235861_h_());
    }
}
