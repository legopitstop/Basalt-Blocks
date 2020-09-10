package com.legopitstop.basaltblocks;

import com.legopitstop.basaltblocks.init.BasaltBlocks;
import com.legopitstop.basaltblocks.init.BasaltItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("basaltblocks")
public class BasaltBlocksMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "basaltblocks";

    public BasaltBlocksMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        BasaltBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BasaltItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // Custom Tab
    public static final ItemGroup TAB = new ItemGroup("basaltBlocksTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BasaltBlocks.POLISHED_BASALT_BRICKS.get());
        }
    };
}