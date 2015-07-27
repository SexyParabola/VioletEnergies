package com.violetenergies.items;

import com.violetenergies.VioletEnergies;

import net.minecraft.item.Item;

public class Violetium extends Item{
	public Violetium(){
		this.setCreativeTab(VioletEnergies.tabVioletEnergies);
		this.setTextureName(VioletEnergies.MODID + ":violetium");
	}
}
