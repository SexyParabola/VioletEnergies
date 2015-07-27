package com.violetenergies.blocks;

import java.util.Random;

import com.violetenergies.VioletEnergies;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class VioletOre extends Block {
	public VioletOre() {
	super(Material.rock);
	this.setCreativeTab(VioletEnergies.tabVioletEnergies);
	this.setHardness(3.0F);
    this.setResistance(6.0F);
	this.setBlockTextureName(VioletEnergies.MODID + ":violetOre");
	}
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune){
		return VioletEnergies.violetDust;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random){
		return 4;
	}

}
