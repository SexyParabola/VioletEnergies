package com.violet.violetmod;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class VioletModFuelHandler implements IFuelHandler{
	@Override
	public int getBurnTime(ItemStack fuel){
		
		if(fuel.getItem() == Items.book){
			return 300;
		}else if(fuel.getItem() == VioletMod.violetIngot){
			return 100;
		}else if(fuel.getItem() == VioletMod.crushedCoal){
			return 300;
		}else if(fuel.getItem() == VioletMod.violetCore){
			return 14400;
		}else if(Block.getBlockFromItem(fuel.getItem()) == VioletMod.violetCoreBlock){
			return 100000;	
		}else if(fuel.getItem() == VioletMod.violetShard){
			if(fuel.getItemDamage() >= 0){
				return  (int) ((fuel.getItemDamage()*-300F)+2700);
			}else{return 0;
			}
			}else{
			return 0;
		}
	}
}
