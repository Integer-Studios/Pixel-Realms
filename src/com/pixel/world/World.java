package com.pixel.world;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import com.pixel.piece.Piece;
import com.pixel.start.PixelLogger;
import com.pixel.tile.Tile;

public class World {

	public int c;
	public Map<Integer, WorldChunk> chunks;
	public int id;

	public World(int id) {
		
		this.id = id;
		chunks = Collections.synchronizedMap(new LinkedHashMap<Integer, WorldChunk>());
		
	}
	
	public void generate() {
		
		for (int x = 0; x < c; x ++) {
			
			for (int y = 0; y < c; y ++) {
				
				new Tile(x,y, id).propagate();
				
			}
			
		}
		
		PixelLogger.debug("Chunks", chunks.size());
		
	}

	public WorldChunk getChunk(Tile tile) {

		return getChunk(tile.posX, tile.posY, false);
		
	}
	
	public WorldChunk getChunk(Piece piece) {
		
		return getChunk(piece.posX, piece.posY, false);
		
	}
	
	public WorldChunk getChunk(int x, int y, boolean chunk) {
		int identifier;
		
		if (chunk) {
			
			identifier = ((y) * (c >> 4)) + (x);
			
		} else {
			
			identifier = ((y >> 4) * (c >> 4)) + (x >> 4);
		
		}
		
		if (chunks.containsKey(identifier)) {
			
			return chunks.get(identifier);
			
		} else {
			if (chunk) {
				
				return (new WorldChunk(id, x, y)).propagate();
				
			} else {
				
				return (new WorldChunk(id, x >> 4, y >> 4)).propagate();
				
			}
			
		}
		
	}
	

}


