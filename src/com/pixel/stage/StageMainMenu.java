package com.pixel.stage;

import com.pixel.gui.GUIButton;
import com.pixel.gui.GUIComponent;
import com.pixel.gui.GUIComponentText;
import com.pixel.start.PixelRealms;
import com.pixel.util.TextureLoader;

public class StageMainMenu extends Stage {

	public void initializeGUI() {
		super.initializeGUI();
		gui.add(new GUIComponent(0, 0, 900, 600, "gui/home_screen.png"));
		gui.add(new GUIButton((TextureLoader.displayWidth/2)- 85, (TextureLoader.displayHeight)- 150, 170, 70, new GUIComponentText("Play", 55, 8, 35), "play"));

	}
	
	public void buttonPressed(GUIButton button) {
		super.buttonPressed(button);
		
		if (button.identifier == "play") {
		
			PixelRealms.game.setStage(StageType.STAGE_WORLD);
			
		}
		
	}
	
}
