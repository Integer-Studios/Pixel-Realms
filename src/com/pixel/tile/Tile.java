package com.pixel.tile;

import com.pixel.start.PixelLogger;
import com.pixel.world.WorldManager;

public class Tile {

	public Tile(int x, int y, int worldID) {
		
		this.posX = x; 
		this.posY = y;
		this.worldID = worldID;
	
	}
	
	public void propagate() {
		
		WorldManager.current().getChunk(this).tiles.put(identify(), this);
		
	}
	
	public int identify(){
		
		return (posY * WorldManager.getWorld(worldID).c) + posX;
		
	}
	
	public int posX, posY, worldID;
	
}
