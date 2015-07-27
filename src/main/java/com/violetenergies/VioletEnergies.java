 package com.violetenergies;

import com.violetenergies.blocks.ChemicalCharger;
import com.violetenergies.blocks.VioletOre;
import com.violetenergies.handlers.FuelHandler;
import com.violetenergies.handlers.GuiHandler;
import com.violetenergies.handlers.WorldGenHandler;
import com.violetenergies.items.BasicShard;
import com.violetenergies.items.BasicShardDust;
import com.violetenergies.items.VioletDust;
import com.violetenergies.items.Violetium;
import com.violetenergies.tileentities.TileEntityChemicalCharger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = VioletEnergies.MODID, version = VioletEnergies.VERSION)
public class VioletEnergies {
	
    public static final String MODID = "violetEnergies";
    public static final String VERSION = "0.1_Alpha";
    
    public static Block violetOre;
    public static Block chemicalChargerIdle;
    public static Block chemicalChargerActive;
    public static final int guiIDChemicalCharger = 0;
    
    public static Item violetium;
    public static Item violetDust;
    public static Item basicShard;
    public static Item basicShardDust;
    
    @Instance(MODID)
    public static VioletEnergies instance;
    
    public static CreativeTabs tabVioletEnergies = new CreativeTabsVioletEnergies("violetEnergies");
    
    @EventHandler
    public void init(FMLPreInitializationEvent event){
    
    	violetOre = new VioletOre().setBlockName("violetOre");
    	GameRegistry.registerBlock(violetOre, violetOre.getUnlocalizedName().substring(5));
    	
    	violetium = new Violetium().setUnlocalizedName("violetium");
    	GameRegistry.registerItem(violetium, violetium.getUnlocalizedName().substring(5));
    	
    	violetDust = new VioletDust().setUnlocalizedName("violetDust");
    	GameRegistry.registerItem(violetDust, violetDust.getUnlocalizedName().substring(5));
    	
    	basicShard = new BasicShard().setUnlocalizedName("basicShard");
    	GameRegistry.registerItem(basicShard, basicShard.getUnlocalizedName().substring(5));
    	
    	basicShardDust = new BasicShardDust().setUnlocalizedName("basicShardDust");
    	GameRegistry.registerItem(basicShardDust, basicShardDust.getUnlocalizedName().substring(5));
    	
    	//Machines
    	
    	chemicalChargerIdle = new ChemicalCharger(false).setBlockName("chemicalChargerIdle").setCreativeTab(tabVioletEnergies);
    	GameRegistry.registerBlock(chemicalChargerIdle, chemicalChargerIdle.getUnlocalizedName().substring(5));
    	
    	chemicalChargerActive = new ChemicalCharger(true).setBlockName("chemicalChargerActive");
    	GameRegistry.registerBlock(chemicalChargerActive, chemicalChargerActive.getUnlocalizedName().substring(5));
    	
    	//GameRegistry.registerTileEntity(TileEntityChemicalCharger.class, "chemicalCharger");
    	
    }
    	@EventHandler
        public void init(FMLInitializationEvent event){
    		
    	GameRegistry.registerTileEntity(TileEntityChemicalCharger.class, "chemicalCharger");
    		
    	//Crafting
    	GameRegistry.addRecipe(new ItemStack(VioletEnergies.basicShardDust,1),"IHI", "H#H", "IHI", '#', Items.redstone, 'I', VioletEnergies.violetDust, 'H', Items.coal);
    	GameRegistry.addRecipe(new ItemStack(VioletEnergies.chemicalChargerIdle,1),"IHI", "H#H", "IHI", '#', Blocks.iron_block, 'I', Items.iron_ingot, 'H', VioletEnergies.violetium);
    	
//    	GameRegistry.addShapelessRecipe(new ItemStack(VioletEnergies.basicShard,1, 8), VioletEnergies.basicShard, Items.coal);
//    	GameRegistry.addShapelessRecipe(new ItemStack(VioletEnergies.basicShard,1, 7), VioletEnergies.basicShard, Items.coal, Items.coal);
//    	GameRegistry.addShapelessRecipe(new ItemStack(VioletEnergies.basicShard,1, 6), VioletEnergies.basicShard, Items.coal, Items.coal, Items.coal);
//    	GameRegistry.addShapelessRecipe(new ItemStack(VioletEnergies.basicShard,1, 5), VioletEnergies.basicShard, Items.coal, Items.coal, Items.coal, Items.coal);
//    	GameRegistry.addShapelessRecipe(new ItemStack(VioletEnergies.basicShard,1, 4), VioletEnergies.basicShard, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal);
//    	GameRegistry.addShapelessRecipe(new ItemStack(VioletEnergies.basicShard,1, 3), VioletEnergies.basicShard, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal);
//    	GameRegistry.addShapelessRecipe(new ItemStack(VioletEnergies.basicShard,1, 2), VioletEnergies.basicShard, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal);
//    	GameRegistry.addShapelessRecipe(new ItemStack(VioletEnergies.basicShard,1, 1), VioletEnergies.basicShard, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal, Items.coal);
    	
    	//Smelting
    	GameRegistry.addSmelting(new ItemStack(VioletEnergies.basicShardDust), new ItemStack(VioletEnergies.basicShard), 0.5F);
    	GameRegistry.addSmelting(new ItemStack(VioletEnergies.violetDust), new ItemStack(VioletEnergies.violetium), 1.0F);
    	GameRegistry.addSmelting(new ItemStack(VioletEnergies.violetOre), new ItemStack(VioletEnergies.violetium), 1.0F);
    	
    	
    	//Handlers
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	GameRegistry.registerWorldGenerator(new WorldGenHandler(), 1);
    	NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    	//LanguageRegistry.instance().addStringLocalization(key, value);
    	
    }


}
