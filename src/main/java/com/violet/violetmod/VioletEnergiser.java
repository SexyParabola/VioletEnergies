package com.violet.violetmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VioletEnergiser extends Block {
	protected VioletEnergiser(){
		super(Material.ground);
		this.setCreativeTab(VioletMod.tabVioletMod);
		this.setBlockTextureName(VioletMod.MODID + ":violetEnergiser");
		this.setHardness(2.0F);
	}

}
