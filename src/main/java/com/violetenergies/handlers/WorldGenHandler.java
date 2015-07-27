package com.violetenergies.handlers;

import java.util.Random;

import com.violetenergies.VioletEnergies;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenHandler implements IWorldGenerator{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
		    generateNether(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 1:
		    generateEnd(world, random, chunkX * 16, chunkZ * 16);
		    break;
			}
		}
		private void generateEnd(World world, Random random, int x, int z){}
		 
		private void generateSurface(World world, Random random, int x, int z)
		{
		this.addOreSpawn(VioletEnergies.violetOre, world, random, x, z, 16, 16, 5 + random.nextInt(3), 24, 0, 32);
		}
		 
		private void generateNether(World world, Random random, int x, int z){
	//	int Xcoord = x + random.nextInt(16);
	//	    int Ycoord = 10 + random.nextInt(128);
	//	    int Zcoord = z + random.nextInt(16);
	//	    (new WorldGenMinable(Tutorial.tutorialBlock, 1, 15, Blocks.netherrack)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	
		public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
			assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
			assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
			assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
			assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
			assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
			 
			int diffBtwnMinMaxY = maxY - minY;
			for (int x = 0; x < chancesToSpawn; x++){
				int posX = blockXPos + random.nextInt(maxX);
				int posY = minY + random.nextInt(diffBtwnMinMaxY);
				int posZ = blockZPos + random.nextInt(maxZ);
				(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
			}
		}
	}