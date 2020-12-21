package com.techlabs.rectangle;

public class Rectangle {
	private float width;
	private float height;
	public float getWidth() {
		return width;
	}
	public float getHeight() {
		return height;
	}
	public void setWidth(float newWidth) {
		if(newWidth<0) {
			width=1.0f;
		}
		else if(newWidth>100){
			width=100.0f;
		}
		else {
		width = newWidth;
		}
	}
	public void setHeight(float newHeight) {
		if(newHeight<0) {
			height=1.0f;
		}
		else if(newHeight>100){
			height=100.0f;
		}
		else {
		height = newHeight;
		}
	}
	

}
