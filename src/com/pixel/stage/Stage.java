package com.pixel.stage;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import com.pixel.gui.*;
import com.pixel.start.PixelLogger;
import com.pixel.start.PixelRealms;

public class Stage {
	
	public boolean initialized = false;
	
	public enum StageType {
		
		STAGE_LOGIN,
		STAGE_MAIN_MENU,
		STAGE_WORLD
		
	}
	
	public ArrayList<GUIComponent> gui = new ArrayList<GUIComponent>();
	
	public void update(GameContainer c, int delta) {
		
		
	}
	

	public void init(GameContainer c) {
		
		initializeGUI();
		
		initialized = true;
		
	}
	
	public void initializeGUI() {
		
		
		
	}

	public void render(GameContainer c, Graphics g) {

		for (GUIComponent component : gui) {

			component.render(c, g);
			
		}
		
	}
	
	public void buttonPressed(GUIButton button) {
		
		
		
	}
	
}
