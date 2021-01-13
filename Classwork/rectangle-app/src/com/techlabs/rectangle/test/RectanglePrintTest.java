package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectanglePrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(22,33);
		Rectangle r2 = new Rectangle(10,54);
		getInfo(r1);
		getInfo(r2);

	}
	public static void getInfo(Rectangle r) {
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
	}

}
