package com.violet.violetmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class VioletBlock extends Block{
	protected VioletBlock(){
		super(Material.ground);
		this.setCreativeTab(VioletMod.tabVioletMod);
	}
	
	public IIcon Side0;
	public IIcon Side1;
	public IIcon Side2;
	public IIcon Side3;
	public IIcon Side4;
	public IIcon Side5;

	public void registerBlockIcons(IIconRegister icon){
		Side0 = icon.registerIcon(VioletMod.MODID + ":violetBlock");
		Side1 = icon.registerIcon(VioletMod.MODID + ":violetBlockTop");
		Side2 = icon.registerIcon(VioletMod.MODID + ":violetBlock");
		Side3 = icon.registerIcon(VioletMod.MODID + ":violetBlock");
		Side4 = icon.registerIcon(VioletMod.MODID + ":violetBlock");
		Side5 = icon.registerIcon(VioletMod.MODID + ":violetBlock");
		
	}
	
	public IIcon getIcon(int side, int meta){
		if(side == 0){
			return Side0;
		}else if(side == 1){
			return Side1;
		}else if(side == 2){
			return Side2;
		}else if(side == 3){
			return Side3;
		}else if(side == 4){
			return Side4;
		}else if(side == 5){
			return Side5;
		}
		return null;
	}
	
	

}
