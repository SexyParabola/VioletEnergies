package com.violet.violetmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabsVioletMod extends CreativeTabs {

public CreativeTabsVioletMod(String tabLabel){
	super(tabLabel);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem(){
		return Item.getItemFromBlock(Blocks.dirt);
	}

}
