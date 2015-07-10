package com.violet.violetmod;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class VioletShard extends Item{
	
	protected VioletShard(){
		super();
		this.setMaxDamage(9);
		this.setHasSubtypes(true);
		this.setCreativeTab(VioletMod.tabVioletMod);
		this.setTextureName(VioletMod.MODID + ":violetShard");
	}
}