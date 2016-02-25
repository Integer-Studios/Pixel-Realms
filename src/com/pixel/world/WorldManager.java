package com.pixel.world;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class WorldManager {

	public static Map<Integer, World> worlds;
	public static int currentID;
	
	public static World getWorld(int worldID) {
		
		return worlds.get(worldID);
		
	}
	
	public static void createWorld() {
	
		worlds = Collections.synchronizedMap(new LinkedHashMap<Integer, World>());
		World w = new World(1);
		w.c = 192;
		currentID = 1;
		worlds.put(1, w);
		w.generate();

	}
	

	public static World current() {
		
		return worlds.get(currentID);
		
	}
	
	
}
