package com.pixel.stage;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import com.pixel.gui.*;

public class Stage {

	/**
	 * @param args
	 */
	
	public ArrayList<GUIComponent> gui = new ArrayList<GUIComponent>();
	
	public void update(GameContainer c, int delta) {
		
		
	}
	

	public void init(GameContainer c) {
		
		initializeGUI();
		
	}
	
	public void initializeGUI() {
		
		
		
	}

	public void render(GameContainer c, Graphics g) {
		
		for (GUIComponent component : gui) {

			component.render(c, g);
			
		}
		
	}
	
}
