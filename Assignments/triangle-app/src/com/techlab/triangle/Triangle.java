package com.techlab.triangle;

public class Triangle {

	  private int base,height,a,b,c;

	  
	  public float area(int base,int height){
	    this.base=base;
	    this.height=height;
	    
	    return  ((float)(this.base*this.height*0.5));
	  }
	  
	  public float perimeter(int a,int b,int c){
	    this.a=a;
	    this.b=b;
	    this.c=c;
	    
	    return  ((float)(this.a+this.b+this.c));
	  }
	  
	  
	  
	}