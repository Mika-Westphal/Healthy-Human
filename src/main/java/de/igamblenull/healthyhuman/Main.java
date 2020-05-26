package de.igamblenull.healthyhuman;

import de.igamblenull.healthyhuman.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, acceptedMinecraftVersions = "1.12.2", canBeDeactivated = true)
public class Main {
    public static final String MODID = "healthy_human";
    public static final String NAME = "Healthy Human";
    public static final String VERSION = "1.0";
    public static final String CLIENT_PROXY_CLASS = "de.igamblenull.healthyhuman.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "de.igamblenull.healthyhuman.proxy.CommonProxy";

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //FMLCommonHandler.instance().bus().register(new OnTickEvent());
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event) {

    }
}
