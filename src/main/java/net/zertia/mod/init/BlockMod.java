package net.zertia.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.zertia.mod.blocks.BlockSimple;
import net.zertia.mod.main.Reference;

public class BlockMod {
	
	public static Block bloc, plante;
	
	public static void init() {
		bloc = new BlockSimple(Material.rock).setBlockTextureName(Reference.MOD_ID + ":bloc").setCreativeTab(CreativeTabs.tabBlock);
	    plante = new BlockCropsMod().setCreativeTab(CreativeTabs.tabDecorations).setBlockName("plante").setBlockTextureName(Reference.MOD_ID + ":cultureTest");
	}
	
	public static void register() {
		GameRegistry.registerBlock(bloc, "bloc");
		GameRegistry.registerBlock(plante, "plante");
	}
}
