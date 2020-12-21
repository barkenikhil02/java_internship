package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c[] = new Circle[3];
//		c.setRadius(5.0f);
//		c.setColor("black");
//		System.out.println("Radius= "+c.getRadius());
//		System.out.println("Color= "+c.getColor());
			c[0]=new Circle();
			c[1]=new Circle();
			c[2]=new Circle();
			c[0].setRadius(1.0f);
			c[0].setColor("black");
			c[1].setRadius(2.0f);
			c[1].setColor("green");
			c[2].setRadius(3.0f);
			c[2].setColor("blue");
		
		
			for(int i=0;i<3;i++) {
				circleInfo(c[i]);
			}
			largeCircle(c);
			smallCircle(c);
		

	}
	public static void circleInfo(Circle c) {
		System.out.println("radius= "+c.getRadius());
		System.out.println("color= "+c.getColor());
	}
	public static void smallCircle(Circle c[]) {
		int min = (int)Math.round(c[0].getRadius());
		for(int i=0;i<3;i++) {
			if(Math.round(c[i].getRadius())<min) {
				min=(int)(Math.round(c[i].getRadius()));
			}
		}
		System.out.println("Minimum radius is= "+min);
	}
	public static void largeCircle(Circle c[]) {
		int max = (int)Math.round(c[0].getRadius());
		for(int i=0;i<3;i++) {
			if(Math.round(c[i].getRadius())>max) {
				max=(int)(Math.round(c[i].getRadius()));
			}
		}
		System.out.println("Maximum radius is= "+max);
		
	}

}
