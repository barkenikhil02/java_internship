package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.setHeight(100.3f);
		r.setWidth(10.0f);
		System.out.println("Height= "+r.getHeight());
		System.out.println("Width= "+r.getWidth());
		
	}
}
