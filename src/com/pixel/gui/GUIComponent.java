package com.pixel.gui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import com.pixel.util.TextureLoader;

public class GUIComponent {

	public Image image;
	public int x, y, width, height;
	public String texture;
	
	public GUIComponent(int x, int y, int width, int height, String texture) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;		
		this.texture = texture;

	}
	
	public void render(GameContainer c, Graphics g) {
		
		if (this.image == null) {
			this.image = TextureLoader.load(texture);
			this.image.setFilter(Image.FILTER_NEAREST);

		}
		image.draw(x,y, width, height);
		
	}
	

	public void setTexture(String s) { 
		texture = s;
		image = TextureLoader.load(texture);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
}
