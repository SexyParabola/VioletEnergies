package com.violet.violetmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = VioletMod.MODID, version = VioletMod.VERSION)
public class VioletMod{
	
    public static final String MODID = "violetMod";
    public static final String VERSION = "0.1 Alpha";
    
    public static Block violetOre;
    public static Block violetBlock;
    public static Block violetCoreBlock;
    public static Block violetEnergiser;
    public static Item violetIngot;
    public static Item violetDust; 
    public static Item violetDustPressed;
    public static Item crushedCoal;
    public static Item violetShardBroken;
    public static Item violetShard;
    public static Item violetCore;
    
    public static CreativeTabs tabVioletMod = new CreativeTabsVioletMod("violetMod");
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//Blocks
    	violetOre = new VioletOre().setBlockName("violetOre");
    	GameRegistry.registerBlock(violetOre, violetOre.getUnlocalizedName().substring(5));
    	
    	violetBlock = new VioletBlock().setBlockName("violetBlock");
    	GameRegistry.registerBlock(violetBlock, violetBlock.getUnlocalizedName().substring(5));
    	
    	violetCoreBlock = new VioletCoreBlock().setBlockName("violetCoreBlock");
    	GameRegistry.registerBlock(violetCoreBlock, violetCoreBlock.getUnlocalizedName().substring(5));
    	
    	violetEnergiser = new VioletEnergiser().setBlockName("violetEnergiser");
    	GameRegistry.registerBlock(violetEnergiser, violetEnergiser.getUnlocalizedName().substring(5));
    	
    	//Items
    	violetIngot = new VioletIngot().setUnlocalizedName("violetIngot");
    	GameRegistry.registerItem(violetIngot, violetIngot.getUnlocalizedName().substring(5));
    	
    	violetDust = new VioletDust().setUnlocalizedName("violetDust");
    	GameRegistry.registerItem(violetDust, violetDust.getUnlocalizedName().substring(5));
    	
    	violetDustPressed = new VioletDustPressed().setUnlocalizedName("violetDustPressed");
    	GameRegistry.registerItem(violetDustPressed, violetDustPressed.getUnlocalizedName().substring(5));
    	
    	crushedCoal = new CrushedCoal().setUnlocalizedName("crushedCoal");
    	GameRegistry.registerItem(crushedCoal, crushedCoal.getUnlocalizedName().substring(5));
    	
    	violetCore = new VioletCore().setUnlocalizedName("violetCore");
    	GameRegistry.registerItem(violetCore, violetCore.getUnlocalizedName().substring(5));
    	
    	violetShardBroken = new VioletShardBroken().setUnlocalizedName("violetShardBroken");
    	GameRegistry.registerItem(violetShardBroken, violetShardBroken.getUnlocalizedName().substring(5));
    	
    	violetShard = new VioletShard().setUnlocalizedName("violetShard");
    	GameRegistry.registerItem(violetShard, violetShard.getUnlocalizedName().substring(5));
    	
    	
    	//Crafting
    	GameRegistry.addRecipe(new ItemStack(VioletMod.violetDustPressed),"##","##", '#', VioletMod.violetDust);
    	GameRegistry.addRecipe(new ItemStack(VioletMod.violetBlock),"#I#", "I#I", "#I#", '#', VioletMod.violetIngot, 'I', Items.gold_ingot);
    	GameRegistry.addRecipe(new ItemStack(VioletMod.violetCore),"IHI", "H#H", "IHI", '#', VioletMod.violetBlock, 'I', VioletMod.violetIngot, 'H', VioletMod.crushedCoal);
    	GameRegistry.addRecipe(new ItemStack(VioletMod.violetCoreBlock),"IHI", "H#H", "IHI", '#', VioletMod.violetBlock, 'I', VioletMod.violetIngot, 'H', VioletMod.violetCore);
    	//Shapeless
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetDust,4),VioletMod.violetDustPressed);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.crushedCoal), Items.coal);
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.coal), VioletMod.crushedCoal);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,9), VioletMod.violetCoreBlock);
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,1, 8), VioletMod.violetShard, Items.coal);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,1, 7), VioletMod.violetShard, Items.coal, Items.coal);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,1, 6), VioletMod.violetShard, Items.coal, Items.coal, Items.coal);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,1, 5), VioletMod.violetShard, Items.coal, Items.coal, Items.coal, Items.coal);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,1, 4), VioletMod.violetShard, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,1, 3), VioletMod.violetShard, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,1, 2), VioletMod.violetShard, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal);
    	GameRegistry.addShapelessRecipe(new ItemStack(VioletMod.violetShard,1, 1), VioletMod.violetShard, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal);
    	
    	//Furnace
    	GameRegistry.addSmelting(new ItemStack(VioletMod.violetDust), new ItemStack(VioletMod.violetIngot), 1.0F);
    	GameRegistry.addSmelting(new ItemStack(VioletMod.violetOre), new ItemStack(VioletMod.violetIngot,1,4),1.0F);
    	
    	//FuelHandler
    	GameRegistry.registerFuelHandler(new VioletModFuelHandler());
    	
    	//OreGen
    	GameRegistry.registerWorldGenerator(new VioletModWorldGen(), 1);
    	
    	//OreDictionary
    	
    }
    
}
