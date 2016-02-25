package com.pixel.piece;

import com.pixel.world.WorldManager;

public class Piece {

	public Piece(int x, int y, int worldID) {
		
		this.posX = x; 
		this.posY = y;
	
	}
	
	public void propagate() {
		
		WorldManager.current().getChunk(this).pieces.put(identify(), this);
		
	}
	
	public int identify(){
		
		return (posY * WorldManager.getWorld(worldID).c) + posX;
		
	}
	

	public int posX, posY, worldID;
	
}
