package com.pixel.stage;

import java.util.concurrent.ConcurrentHashMap;

import com.pixel.start.PixelRealms;
import com.pixel.world.*;

public class StageWorld extends Stage {
	
	private ConcurrentHashMap<Integer, World> worlds = new ConcurrentHashMap<Integer, World>();
	public World world;
	
	public StageWorld(PixelRealms pixel) {
		super(pixel);
	}
	
	public void setWorld(int identifier) {
		
		worlds.put(world.id, world);
		world = worlds.get(identifier);
		
	}
	
}
