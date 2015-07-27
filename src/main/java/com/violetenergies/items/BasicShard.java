package com.violetenergies.items;

import java.util.List;

import com.violetenergies.VioletEnergies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasicShard extends Item{
	
	public BasicShard(){
		super();
		this.setMaxDamage(9);
		this.setHasSubtypes(true);
		this.setCreativeTab(VioletEnergies.tabVioletEnergies);
		this.setTextureName(VioletEnergies.MODID + ":basicShard");
		//this.setMaxStackSize(64);
	}
	
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List, boolean par4)
//	{
//	par2List.add("\u00a77" + "Test");
//
//	par2List.add("\u00a77" + "your new line");
//	}
}

