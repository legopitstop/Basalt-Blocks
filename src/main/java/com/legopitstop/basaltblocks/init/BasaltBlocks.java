package com.legopitstop.basaltblocks.init;

import com.legopitstop.basaltblocks.BasaltBlocksMod;
import com.legopitstop.basaltblocks.blocks.basalt.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BasaltBlocks {
    // field_235587_I_ -> BASALT
    // func_235861_h_  -> setRequiresTool
    // Register block
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BasaltBlocksMod.MOD_ID);

    // Basalt
    public static final RegistryObject<Block> BASALT_SLAB = BLOCKS.register("basalt_slab", BasaltSlab::new);
    public static final RegistryObject<Block> BASALT_STAIRS = BLOCKS.register("basalt_stairs", BasaltStairs::new);
    public static final RegistryObject<Block> BASALT_WALL = BLOCKS.register("basalt_wall", BasaltWall::new);
    public static final RegistryObject<Block> BASALT_BUTTON = BLOCKS.register("basalt_button", BasaltButton::new);
    public static final RegistryObject<Block> BASALT_PRESSURE_PLATE = BLOCKS.register("basalt_pressure_plate", BasaltPressurePlate::new);

    // Smooth Basalt
    public static final RegistryObject<Block> SMOOTH_BASALT = BLOCKS.register("smooth_basalt", BasaltPillar::new);
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = BLOCKS.register("smooth_basalt_slab", BasaltSlab::new);
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = BLOCKS.register("smooth_basalt_stairs", BasaltStairs::new);
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = BLOCKS.register("smooth_basalt_wall", BasaltWall::new);
    public static final RegistryObject<Block> SMOOTH_BASALT_BUTTON = BLOCKS.register("smooth_basalt_button", BasaltButton::new);
    public static final RegistryObject<Block> SMOOTH_BASALT_PRESSURE_PLATE = BLOCKS.register("smooth_basalt_pressure_plate", BasaltPressurePlate::new);

    // Polished Basalt
    public static final RegistryObject<Block> CHISELED_POLISHED_BASALT = BLOCKS.register("chiseled_polished_basalt", BasaltBlock::new);
    public static final RegistryObject<Block> POLISHED_BASALT_SLAB = BLOCKS.register("polished_basalt_slab", BasaltSlab::new);
    public static final RegistryObject<Block> POLISHED_BASALT_STAIRS = BLOCKS.register("polished_basalt_stairs", BasaltStairs::new);
    public static final RegistryObject<Block> POLISHED_BASALT_WALL = BLOCKS.register("polished_basalt_wall", BasaltWall::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BUTTON = BLOCKS.register("polished_basalt_button", BasaltButton::new);
    public static final RegistryObject<Block> POLISHED_BASALT_PRESSURE_PLATE = BLOCKS.register("polished_basalt_pressure_plate", BasaltPressurePlate::new);

    // Smooth Polished Basalt
    public static final RegistryObject<Block> SMOOTH_POLISHED_BASALT = BLOCKS.register("smooth_polished_basalt", BasaltPillar::new);
    public static final RegistryObject<Block> SMOOTH_POLISHED_BASALT_SLAB = BLOCKS.register("smooth_polished_basalt_slab", BasaltSlab::new);
    public static final RegistryObject<Block> SMOOTH_POLISHED_BASALT_STAIRS = BLOCKS.register("smooth_polished_basalt_stairs", BasaltStairs::new);
    public static final RegistryObject<Block> SMOOTH_POLISHED_BASALT_WALL = BLOCKS.register("smooth_polished_basalt_wall", BasaltWall::new);
    public static final RegistryObject<Block> SMOOTH_POLISHED_BASALT_BUTTON = BLOCKS.register("smooth_polished_basalt_button", BasaltButton::new);
    public static final RegistryObject<Block> SMOOTH_POLISHED_BASALT_PRESSURE_PLATE = BLOCKS.register("smooth_polished_basalt_pressure_plate", BasaltPressurePlate::new);

    // Polished Basalt Bricks
    public static final RegistryObject<Block> POLISHED_BASALT_BRICK_DOOR = BLOCKS.register("polished_basalt_brick_door", BasaltDoor::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BRICK_TRAPDOOR = BLOCKS.register("polished_basalt_brick_trapdoor", BasaltTrapDoor::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BRICKS = BLOCKS.register("polished_basalt_bricks", BasaltBlock::new);
    public static final RegistryObject<Block> CRACKED_POLISHED_BASALT_BRICKS = BLOCKS.register("cracked_polished_basalt_bricks", BasaltBlock::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BRICK_PILLAR = BLOCKS.register("polished_basalt_brick_pillar", BasaltPillar::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BRICK_SLAB = BLOCKS.register("polished_basalt_brick_slab", BasaltSlab::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BRICK_STAIRS = BLOCKS.register("polished_basalt_brick_stairs", BasaltStairs::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BRICK_WALL = BLOCKS.register("polished_basalt_brick_wall", BasaltWall::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BRICK_BUTTON = BLOCKS.register("polished_basalt_brick_button", BasaltButton::new);
    public static final RegistryObject<Block> POLISHED_BASALT_BRICK_PRESSURE_PLATE = BLOCKS.register("polished_basalt_brick_pressure_plate", BasaltPressurePlate::new);

    // Basalt Cobblestone
    public static final RegistryObject<Block> BASALT_COBBLESTONE = BLOCKS.register("basalt_cobblestone", BasaltBlock::new);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_SLAB = BLOCKS.register("basalt_cobblestone_slab", BasaltSlab::new);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_STAIRS = BLOCKS.register("basalt_cobblestone_stairs", BasaltStairs::new);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_WALL = BLOCKS.register("basalt_cobblestone_wall", BasaltWall::new);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_BUTTON = BLOCKS.register("basalt_cobblestone_button", BasaltButton::new);
    public static final RegistryObject<Block> BASALT_COBBLESTONE_PRESSURE_PLATE = BLOCKS.register("basalt_cobblestone_pressure_plate", BasaltPressurePlate::new);

}
