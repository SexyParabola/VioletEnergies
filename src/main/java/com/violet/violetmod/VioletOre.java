package com.violet.violetmod;

import java.util.Random;

import com.google.common.base.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class VioletOre extends Block {
	
	
	protected VioletOre() {
	super(Material.rock);
	this.setCreativeTab(VioletMod.tabVioletMod);
	this.setHardness(3.0F);
	this.setBlockTextureName(VioletMod.MODID + ":violetOre");
	}
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune){
		return VioletMod.violetDust;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random){
		return 4;
	}

}
