package com.violetenergies.handlers;

import com.violetenergies.VioletEnergies;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {
	
	@Override
	public int getBurnTime(ItemStack fuel){
		
		if(fuel.getItem() == VioletEnergies.basicShard){
			
			if(fuel.getItemDamage() > 0){
				//System.out.println(((fuel.getItemDamage()*-2400F)+21600));
				return  (int) ((fuel.getItemDamage()*-2400F)+21600);
				}else{
				return 0;
			}
		}else{
			return 0;
		}
	}
}
