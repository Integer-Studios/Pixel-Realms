package com.pixel.gui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import com.pixel.util.TextureLoader;

public class GUIComponent {

	public Image image;
	public int x, y, width, height;
	
	public GUIComponent(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;		
		
	}
	
	public void render(GameContainer c, Graphics g) {
		
		this.image = TextureLoader.load("resources/gui/home_screen.png");
		this.image.setFilter(Image.FILTER_NEAREST);
		image.draw(x,y, width, height);
		
	}
	
}
