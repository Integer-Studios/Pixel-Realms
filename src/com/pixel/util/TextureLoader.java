package com.pixel.util;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.pixel.start.PixelLogger;

public class TextureLoader {
    
	public static final String RESET = "\u001B[0m";
	public static String red_color = "\u001B[31m";
	
	public static Image load(String path) {
		
		Image image = loadImage(path);
		image.setFilter(Image.FILTER_NEAREST);
		
		return image;
		
	}

	public static Image loadImage(String path) {
            try {
               return new Image(path);
            } catch (SlickException e) {
         
            } 
            catch (RuntimeException e) {
            	e.printStackTrace();
            	PixelLogger.err("Failed to load image. Skipping.");
            }
           return null;
       }
	}
