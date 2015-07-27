package com.violetenergies.gui;

import org.lwjgl.opengl.GL11;

import com.violetenergies.VioletEnergies;
import com.violetenergies.containers.ContainerChemicalCharger;
import com.violetenergies.tileentities.TileEntityChemicalCharger;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiChemicalCharger extends GuiContainer {

	public static final ResourceLocation bground = new ResourceLocation(VioletEnergies.MODID + ":textures/gui/guiChemicalCharger.png");

	public TileEntityChemicalCharger chemicalCharger;

	public GuiChemicalCharger(InventoryPlayer inventoryPlayer, TileEntityChemicalCharger entity) {
		super(new ContainerChemicalCharger(inventoryPlayer, entity));

		this.chemicalCharger = entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	public void drawGuiContainerForegroundLayer(int pa1, int par2) {
		String name = this.chemicalCharger.hasCustomInventoryName() ? this.chemicalCharger.getInventoryName()
				: I18n.format(this.chemicalCharger.getInventoryName(), new Object[0]);

		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6,
				4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 119, this.ySize - 96 + 2,
				4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if(this.chemicalCharger.isBurning()) {
			int k = this.chemicalCharger.getBurnTimeRemainingScaled(40);
			int j = 40 - k;
			drawTexturedModalRect(guiLeft + 29, guiTop + 65, 176, 0, 40 - j, 10);
		}
		
		int k = this.chemicalCharger.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 10, k + 1, 16);
	}
}
