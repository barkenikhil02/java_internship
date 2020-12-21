package com.techlab.circle;

public class Circle {
	private float radius;
	private String color = "yellow";
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		if(radius>0&&radius<20) {
		this.radius = radius;
		}
		else {
			System.out.println("Radius between 0 to 20");
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color=="black"||color=="blue"||color=="green") {
		this.color = color;
		}
	}
	
}
