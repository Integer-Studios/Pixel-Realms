package com.pixel.input;

import java.util.ArrayList;

import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;


public class MouseClickListener implements MouseListener {

	public static ArrayList<MouseBinding> bindings = new ArrayList<MouseBinding>();
	
	public static void clearMouseBindings() {
		bindings = new ArrayList<MouseBinding>();
	}
	
	public static void addMouseBinding(MouseBinding m) {
		bindings.add(m);
	}
	
	public static void removeMouseBinding(MouseBinding m) {
		bindings.remove(m);
	}

	@Override
	public void mouseClicked(int button, int x, int y, int clickCount) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bindings.size(); i++) {
			bindings.get(i).mouseClicked(button, x, y, clickCount);
		}
	}

	@Override
	public void mouseDragged(int oldX, int oldY, int newX, int newY) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bindings.size(); i++) {
			bindings.get(i).mouseDragged(oldX, oldY, newX, newY);
		}
	}

	@Override
	public void mouseMoved(int oldX, int oldY, int newX, int newY) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bindings.size(); i++) {
			bindings.get(i).mouseMoved(oldX, oldY, newX, newY);
		}
	}

	@Override
	public void mousePressed(int button, int x, int y) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bindings.size(); i++) {
			bindings.get(i).mousePressed(button, x, y);
		}
	}

	@Override
	public void mouseReleased(int button, int x, int y) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bindings.size(); i++) {
			bindings.get(i).mouseReleased(button, x, y);
		}
	}

	@Override
	public void mouseWheelMoved(int change) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bindings.size(); i++) {
			bindings.get(i).mouseWheelMoved(change);
		}
	}
	
	
	@Override
	public void inputEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputStarted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAcceptingInput() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setInput(Input arg0) {
		// TODO Auto-generated method stub
		
	}

}
