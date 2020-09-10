package com.legopitstop.basaltblocks.init;

import com.legopitstop.basaltblocks.BasaltBlocksMod;
import com.legopitstop.basaltblocks.blocks.BlockItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BasaltItems {

    // Register Items
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BasaltBlocksMod.MOD_ID);

    // Basalt
    public static final RegistryObject<Item> BASALT_BUTTON_ITEM = ITEMS.register("basalt_button",
            () -> new BlockItemBase(BasaltBlocks.BASALT_BUTTON.get()));
    public static final RegistryObject<Item> BASALT_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_pressure_plate",
            () -> new BlockItemBase(BasaltBlocks.BASALT_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> BASALT_SLAB_ITEM = ITEMS.register("basalt_slab",
            () -> new BlockItemBase(BasaltBlocks.BASALT_SLAB.get()));
    public static final RegistryObject<Item> BASALT_STAIRS_ITEM = ITEMS.register("basalt_stairs",
            () -> new BlockItemBase(BasaltBlocks.BASALT_STAIRS.get()));
    public static final RegistryObject<Item> BASALT_WALL_ITEM = ITEMS.register("basalt_wall",
            () -> new BlockItemBase(BasaltBlocks.BASALT_WALL.get()));

    // Smooth Basalt
    public static final RegistryObject<Item> SMOOTH_BASALT_ITEM = ITEMS.register("smooth_basalt",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_BASALT.get()));
    public static final RegistryObject<Item> SMOOTH_BASALT_BUTTON_ITEM = ITEMS.register("smooth_basalt_button",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_BASALT_BUTTON.get()));
    public static final RegistryObject<Item> SMOOTH_BASALT_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_basalt_pressure_plate",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> SMOOTH_BASALT_SLAB_ITEM = ITEMS.register("smooth_basalt_slab",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_BASALT_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_BASALT_STAIRS_ITEM = ITEMS.register("smooth_basalt_stairs",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_BASALT_STAIRS.get()));
    public static final RegistryObject<Item> SMOOTH_BASALT_WALL_ITEM = ITEMS.register("smooth_basalt_wall",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_BASALT_WALL.get()));

    // Polished Basalt
    public static final RegistryObject<Item> CHISELED_POLISHED_BASALT_ITEM = ITEMS.register("chiseled_polished_basalt",
            () -> new BlockItemBase(BasaltBlocks.CHISELED_POLISHED_BASALT.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_SLAB_ITEM = ITEMS.register("polished_basalt_slab",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_SLAB.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_STAIRS_ITEM = ITEMS.register("polished_basalt_stairs",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_STAIRS.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_WALL_ITEM = ITEMS.register("polished_basalt_wall",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_WALL.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BUTTON_ITEM = ITEMS.register("polished_basalt_button",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BUTTON.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_PRESSURE_PLATE_ITEM = ITEMS.register("polished_basalt_pressure_plate",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_PRESSURE_PLATE.get()));

    // Smooth Polished Basalt
    public static final RegistryObject<Item> SMOOTH_POLISHED_BASALT_ITEM = ITEMS.register("smooth_polished_basalt",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_POLISHED_BASALT.get()));
    public static final RegistryObject<Item> SMOOTH_POLISHED_BASALT_SLAB_ITEM = ITEMS.register("smooth_polished_basalt_slab",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_POLISHED_BASALT_SLAB.get()));
    public static final RegistryObject<Item> SMOOTH_POLISHED_BASALT_STAIRS_ITEM = ITEMS.register("smooth_polished_basalt_stairs",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_POLISHED_BASALT_STAIRS.get()));
    public static final RegistryObject<Item> SMOOTH_POLISHED_BASALT_WALL_ITEM = ITEMS.register("smooth_polished_basalt_wall",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_POLISHED_BASALT_WALL.get()));
    public static final RegistryObject<Item> SMOOTH_POLISHED_BASALT_BUTTON_ITEM = ITEMS.register("smooth_polished_basalt_button",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_POLISHED_BASALT_BUTTON.get()));
    public static final RegistryObject<Item> SMOOTH_POLISHED_BASALT_PRESSURE_PLATE_ITEM = ITEMS.register("smooth_polished_basalt_pressure_plate",
            () -> new BlockItemBase(BasaltBlocks.SMOOTH_POLISHED_BASALT_PRESSURE_PLATE.get()));

    // Polished Basalt Bricks
    public static final RegistryObject<Item> POLISHED_BASALT_BRICK_DOOR_ITEM = ITEMS.register("polished_basalt_brick_door",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICK_DOOR.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BRICK_TRAPDOOR_ITEM = ITEMS.register("polished_basalt_brick_trapdoor",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICK_TRAPDOOR.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BRICKS_ITEM = ITEMS.register("polished_basalt_bricks",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICKS.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BRICK_PILLAR_ITEM = ITEMS.register("polished_basalt_brick_pillar",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICK_PILLAR.get()));
    public static final RegistryObject<Item> CRACKED_POLISHED_BASALT_BRICKS_ITEM = ITEMS.register("cracked_polished_basalt_bricks",
            () -> new BlockItemBase(BasaltBlocks.CRACKED_POLISHED_BASALT_BRICKS.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BRICK_SLAB_ITEM = ITEMS.register("polished_basalt_brick_slab",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICK_SLAB.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BRICK_STAIRS_ITEM = ITEMS.register("polished_basalt_brick_stairs",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICK_STAIRS.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BRICK_WALL_ITEM = ITEMS.register("polished_basalt_brick_wall",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICK_WALL.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BRICK_BUTTON_ITEM = ITEMS.register("polished_basalt_brick_button",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICK_BUTTON.get()));
    public static final RegistryObject<Item> POLISHED_BASALT_BRICKS_PRESSURE_PLATE_ITEM = ITEMS.register("polished_basalt_brick_pressure_plate",
            () -> new BlockItemBase(BasaltBlocks.POLISHED_BASALT_BRICK_PRESSURE_PLATE.get()));

    // Basalt Cobblestone
    public static final RegistryObject<Item> BASALT_COBBLESTONE_ITEM = ITEMS.register("basalt_cobblestone",
            () -> new BlockItemBase(BasaltBlocks.BASALT_COBBLESTONE.get()));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_SLAB_ITEM = ITEMS.register("basalt_cobblestone_slab",
            () -> new BlockItemBase(BasaltBlocks.BASALT_COBBLESTONE_SLAB.get()));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_STAIRS_ITEM = ITEMS.register("basalt_cobblestone_stairs",
            () -> new BlockItemBase(BasaltBlocks.BASALT_COBBLESTONE_STAIRS.get()));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_WALL_ITEM = ITEMS.register("basalt_cobblestone_wall",
            () -> new BlockItemBase(BasaltBlocks.BASALT_COBBLESTONE_WALL.get()));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_BUTTON_ITEM = ITEMS.register("basalt_cobblestone_button",
            () -> new BlockItemBase(BasaltBlocks.BASALT_COBBLESTONE_BUTTON.get()));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_PRESSURE_PLATE_ITEM = ITEMS.register("basalt_cobblestone_pressure_plate",
            () -> new BlockItemBase(BasaltBlocks.BASALT_COBBLESTONE_PRESSURE_PLATE.get()));

}
