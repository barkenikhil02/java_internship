package com.techlab.assignment.test;

public class StringTest {

	  public static void main(String[] args) {
	    String s="https://www.swabhavtech.com@2java?Nikhil";
	    System.out.println("Company name: "+s.substring(12, 19)+" "+s.substring(19, 23));
	    System.out.println("lang : "+s.substring(29,33));
	    System.out.println("Intern name: "+s.substring(34));

	  }

	}