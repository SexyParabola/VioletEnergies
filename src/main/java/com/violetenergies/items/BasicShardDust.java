package com.violetenergies.items;

import com.violetenergies.VioletEnergies;

import net.minecraft.item.Item;

public class BasicShardDust extends Item{
	
	public BasicShardDust(){
		super();
		this.setCreativeTab(VioletEnergies.tabVioletEnergies);
		this.setTextureName(VioletEnergies.MODID + ":basicShardDust");
	}
}

