package com.legopitstop.basaltblocks.util;

import com.legopitstop.basaltblocks.BasaltBlocksMod;
import com.legopitstop.basaltblocks.init.BasaltBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BasaltBlocksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BasaltBlocks.POLISHED_BASALT_BRICK_DOOR.get(),RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BasaltBlocks.POLISHED_BASALT_BRICK_TRAPDOOR.get(),RenderType.getCutout());
    }
}