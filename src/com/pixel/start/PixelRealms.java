package com.pixel.start;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.pixel.stage.Stage;
import com.pixel.stage.StageLogin;

public class PixelRealms extends BasicGame {

	public Stage stage;
	
	public PixelRealms(String title) throws SlickException {
		super(title);
		stage = new StageLogin();
		
	}
	
	public static void main(String[] args) {

		PixelLogger.log("-- V2.0 Initiating --");
		
		try {
			initializeLWJGL();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initializeLWJGL() throws SlickException {
		
		PixelRealms game = new PixelRealms("Pixel Realms");
		
		AppGameContainer container = new AppGameContainer(game);
        container.setDisplayMode(900, 600, false);
        container.setVSync(true);                     // Turn VSync
        container.setMaximumLogicUpdateInterval(35); // Max. 200 miliseconds can pass
        container.setMinimumLogicUpdateInterval(25);

		container.start();
			
	}

	@Override
	public void render(GameContainer c, Graphics g) throws SlickException {

		stage.render(c, g);
		
	}

	@Override
	public void init(GameContainer c) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer c, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

}