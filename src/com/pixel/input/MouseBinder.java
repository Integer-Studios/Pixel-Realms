package com.pixel.input;

public interface MouseBinder {

	void mouseDown(int x, int y);
	void mouseDown(int button, int x, int y);
	void mouseUp(int x, int y);
	void mouseUp(int button, int x, int y);

}
