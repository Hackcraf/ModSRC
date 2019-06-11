package net.zertia.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.zertia.mod.main.Reference;

public class ItemMod {
	
	public static Item item;
	
	public static void init() {
		item = new Item().setUnlocalizedName("item").setCreativeTab(CreativeTabs.tabBlock).setTextureName(Reference.MOD_ID + ":item");
	}
	
	public static void register() {
		GameRegistry.registerItem(item, "item");
	}
}
