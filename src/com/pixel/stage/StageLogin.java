package com.pixel.stage;

import com.pixel.gui.GUIButton;
import com.pixel.gui.GUIComponent;
import com.pixel.gui.GUIComponentText;
import com.pixel.start.PixelRealms;
import com.pixel.util.TextureLoader;

public class StageLogin extends Stage {
	
	public void initializeGUI() {
		super.initializeGUI();
		gui.add(new GUIComponent(0, 0, 900, 600, "gui/login.png"));
		gui.add(new GUIButton((TextureLoader.displayWidth/2 - 85) + 10, (TextureLoader.displayHeight/2-60)+125, 170, 70, new GUIComponentText("Login", 55, 8, 35),  "login"));

	}
	
	public void buttonPressed(GUIButton button) {
		super.buttonPressed(button);

		if (button.identifier == "login") {
			
			PixelRealms.game.setStage(StageType.STAGE_MAIN_MENU);
			
		}
		
	}
		
}
