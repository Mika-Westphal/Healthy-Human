package de.igamblenull.healthyhuman.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OnTickEvent {
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        if(event.phase == TickEvent.Phase.END && Minecraft.getMinecraft().world != null) {
            EntityLivingBase player = Minecraft.getMinecraft().player;
            if(player.getMaxHealth() < 2) {
                player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
                player.setHealth(20);
            }
        }
    }
}