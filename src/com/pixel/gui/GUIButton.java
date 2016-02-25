package com.pixel.gui;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class GUIButton extends GUIComponentSet{
	
	public GUIButton(int x, int y, int w, int h, GUIComponentText gct) {
		
		super(x, y, w, h, new GUIComponent[]{
				new GUIComponent(x, y, 20, 20, "/" + "gui" + "/" + "button" + "/" + "top_left.png"),
				new GUIComponent(x+w-20, y, 20, 20, "gui" + "/" + "button" + "/" + "top_right.png"),
				new GUIComponent(x, y+h-20, 20, 20, "gui" + "/" + "button" + "/" + "bottom_left.png"),
				new GUIComponent(x+w-20, y+h-20, 20, 20, "gui" + "/" + "button" + "/" + "bottom_right.png"),
				new GUIComponent(x+20, y, w-40, 20, "gui" + "/" + "button" + "/" + "top.png"),
				new GUIComponent(x+20, y+h-20, w-40, 20, "gui" + "/" + "button" + "/" + "bottom.png"),
				new GUIComponent(x+w-20, y+20, 20, h-40, "gui" + "/" + "button" + "/" + "right.png"),
				new GUIComponent(x, y+20, 20, h-40, "gui" + "/" + "button" + "/" + "left.png"),
				new GUIComponent(x+20, y+20, w-40, h-40, "gui" + "/" + "button" + "/" + "center.png"),
				new GUIComponentText(gct.text, x + gct.x, y + gct.y, gct.size),
		});
		posX = x;
		posY = y;
		width = w;
		height = h;
		text = gct.text;
	}
	
	public void setPressed(boolean b) {
		if (pressed) {
			components[0].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "top_left.png");
			components[1].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "top_right.png");
			components[2].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "bottom_left.png");
			components[3].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "bottom_right.png");
			components[4].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "top.png");
			components[5].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "bottom.png");
			components[6].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "right.png");
			components[7].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "left.png");
			components[8].setTexture("gui" + "/" + "button" + "/" + "pressed" + "/" + "center.png");
		} else {
			components[0].setTexture("gui" + "/" + "button" + "/" + "top_left.png");
			components[1].setTexture("gui" + "/" + "button" + "/" + "top_right.png");
			components[2].setTexture("gui" + "/" + "button" + "/" + "bottom_left.png");
			components[3].setTexture("gui" + "/" + "button" + "/" + "bottom_right.png");
			components[4].setTexture("gui" + "/" + "button" + "/" + "top.png");
			components[5].setTexture("gui" + "/" + "button" + "/" + "bottom.png");
			components[6].setTexture("gui" + "/" + "button" + "/" + "right.png");
			components[7].setTexture("gui" + "/" + "button" + "/" + "left.png");
			components[8].setTexture("gui" + "/" + "button" + "/" + "center.png");
		}
	}
	
	public void render(GameContainer c, Graphics g) {
		super.render(c, g);
	}

	public void setText(String s) {
		((GUIComponentText)components[9]).setText(s);
	}
	
	public void setFontColor(Color c) {
		((GUIComponentText)components[9]).fontColor = c;
	}
	
	public boolean pressed;
	public int width, height, posX, posY;
	public String text;
}
