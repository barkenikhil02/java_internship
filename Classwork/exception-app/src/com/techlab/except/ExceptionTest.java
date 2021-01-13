package com.techlab.except;

public class ExceptionTest {

	public static void main(String[] args) {
		int a,b;
		// TODO Auto-generated method stub
		try {
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		int c = a/b;
		System.out.println("Resukt "+c);
		System.out.println("End of program");

	}

}
