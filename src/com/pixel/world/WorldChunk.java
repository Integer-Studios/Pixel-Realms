package com.pixel.world;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import com.pixel.piece.Piece;
import com.pixel.tile.Tile;

public class WorldChunk {

	public Map<Integer, Tile> tiles;
	public Map<Integer, Piece> pieces;
	
	public int worldID, x, y;
	
	public WorldChunk(int worldID, int x, int y) {
		
		this.x = x; 
		this.y = y;
		this.worldID = worldID;
		tiles = Collections.synchronizedMap(new LinkedHashMap<Integer, Tile>());
		pieces = Collections.synchronizedMap(new LinkedHashMap<Integer, Piece>());
		
	}
	
	public WorldChunk propagate() {
		
		WorldManager.getWorld(worldID).chunks.put(identify(), this);
		return this;
		
	}
	
	public int identify(){
		
		return (y * WorldManager.getWorld(worldID).c) + x;
		
	}
	
}
