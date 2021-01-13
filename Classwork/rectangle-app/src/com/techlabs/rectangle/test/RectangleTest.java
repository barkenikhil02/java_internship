package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(5.05f,10.0f);
		Rectangle r3 = new Rectangle(10,10);
		printRectangleInfo(r1);
		calculateArea(r1);
		printRectangleInfo(r2);
		calculateArea(r2);
		printRectangleInfo(r3);
		calculateArea(r3);
		
		
	}
	public static void printRectangleInfo(Rectangle r) {
		System.out.println("Height= "+r.getHeight());
		System.out.println("Width= "+r.getWidth());
	}
	public static void calculateArea(Rectangle r) {
		System.out.println("Area= "+r.getHeight()*r.getWidth());
	}
}
