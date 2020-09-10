package com.legopitstop.basaltblocks.blocks.basalt;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class BasaltBlock extends Block {
    // field_235587_I_ -> BASALT
    // func_235861_h_  -> setRequiresTool
    public BasaltBlock() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.25f,4.2f)
                .sound(SoundType.field_235587_I_)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .func_235861_h_());
    }
}