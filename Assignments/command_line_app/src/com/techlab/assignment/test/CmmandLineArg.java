package com.techlab.assignment.test;

public class CmmandLineArg {

	public static void main(String[] args) {
	    int sum=5;
	    for (int i=0;i<args.length;i++) {
//	      System.out.println(Integer.parseInt(args[i]));
	      sum+=Integer.parseInt(args[i]);
	    }
	    System.out.println("Sum is ="+sum);
	    System.out.println("Average is ="+(float)(sum*1.0/args.length));
	  }

	}
