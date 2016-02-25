package com.pixel.input;

public interface MouseBinding {

	public void mouseClicked(int button, int x, int y, int clickCount);

	public void mouseDragged(int oldX, int oldY, int newX, int newY);

	public void mouseMoved(int oldX, int oldY, int newX, int newY);

	public void mousePressed(int button, int x, int y);

	public void mouseReleased(int button, int x, int y);

	public void mouseWheelMoved(int change);

}
