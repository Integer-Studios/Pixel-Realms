package com.pixel.input;

public interface MouseBinderFull extends MouseBinder {

	void mouseDragged(int oldX, int oldY, int newX, int newY);

	void mouseMoved(int oldX, int oldY, int newX, int newY);

	void mouseWheelMoved(int change);

}
