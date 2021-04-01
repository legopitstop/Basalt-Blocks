package com.legopitstop.basaltblocks.blocks.basalt;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BasaltStairs extends StairsBlock {
    // field_235337_cO_ -> BASALT
    // field_235587_I_ -> BASALT
    // func_235861_h_  -> setRequiresTool
    public BasaltStairs() {
        super(Blocks.BASALT.getDefaultState(),AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.25f,4.2f)
                .sound(SoundType.BASALT)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
