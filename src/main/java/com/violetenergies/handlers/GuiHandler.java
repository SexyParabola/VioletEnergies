package com.violetenergies.handlers;

import com.violetenergies.VioletEnergies;
import com.violetenergies.containers.ContainerChemicalCharger;
import com.violetenergies.gui.GuiChemicalCharger;
import com.violetenergies.tileentities.TileEntityChemicalCharger;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null){
			switch(ID){
			case VioletEnergies.guiIDChemicalCharger:
				if (entity instanceof TileEntityChemicalCharger){
					return new ContainerChemicalCharger(player.inventory, (TileEntityChemicalCharger) entity);
				}
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null){
			switch(ID){
			case VioletEnergies.guiIDChemicalCharger:
				if (entity instanceof TileEntityChemicalCharger){
					return new GuiChemicalCharger(player.inventory, (TileEntityChemicalCharger) entity);
				}
				return null;
			}
		}
		return null;
	}

}
