package com.techlab.heirarchical.test;

import com.techlab.heirarchical.Boy;
import com.techlab.heirarchical.Infant;
import com.techlab.heirarchical.Kid;
import com.techlab.heirarchical.Man;

public class HierarchicalTest {

	  public static void main(String[] args) {
	    Man mobj=new Man();
	    mobj.eat();
	    mobj.play();
	    
	    Boy obj1=new Boy();
	    obj1.eat();
	    obj1.play(); // overriding the Man's play() method
	    obj1.read();
	    
	    Kid kobj=new Kid();
	    kobj.play();// overriding the Man's play() method
	    kobj.eat();
	    
	    Infant iobj=new Infant();
	    iobj.play();// overriding the Man's play() method
	    iobj.eat();
	    
	  }

	}