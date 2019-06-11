package net.zertia.mod.main;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.zertia.mod.init.BlockMod;
import net.zertia.mod.init.ItemMod;
import net.zertia.mod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModMain {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		ItemMod.init();
		ItemMod.register();
		BlockMod.init();
		BlockMod.register();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.registerRenders();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
