package com.violet.violetmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class VioletCoreBlock extends Block{
	protected VioletCoreBlock(){
		super(Material.ground);
		this.setCreativeTab(VioletMod.tabVioletMod);
		this.setBlockTextureName(VioletMod.MODID + ":violetCoreBlock");
	}

}
