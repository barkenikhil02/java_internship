package com.techlabs.rectangle;

public class Rectangle {
	private float width;
	private float height;
	private final float START_RANGE = 1.0f;
	private final float END_RANGE = 100.0f;
	public Rectangle(float width, float height ) {
		if(width<START_RANGE) {
			this.width=1.0f;
		}
		else if(width>END_RANGE){
			this.width=100.0f;
		}
		else {
		this.width = width;
		}
		if(height<START_RANGE) {
			this.height=1.0f;
		}
		else if(height>END_RANGE){
			this.height=100.0f;
		}
		else {
		this.height = height;
		}
	}
	public Rectangle(int width, int height ) {
		if(width<START_RANGE) {
			this.width=1.0f;
		}
		else if(width>END_RANGE){
			this.width=100.0f;
		}
		else {
		this.width = width;
		}
		if(height<START_RANGE) {
			this.height=1.0f;
		}
		else if(height>END_RANGE){
			this.height=100.0f;
		}
		else {
		this.height = height;
		}
	}
	public float getWidth() {
		return width;
	}
	public float getHeight() {
		return height;
	}
	

}
