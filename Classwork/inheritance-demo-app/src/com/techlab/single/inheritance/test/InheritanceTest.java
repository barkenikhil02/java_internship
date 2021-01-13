package com.techlab.single.inheritance.test;

import com.techlab.single.inheritance.Addition;
import com.techlab.single.inheritance.AdditionSub;

public class InheritanceTest {

  public static void main(String[] args) {
    AdditionSub a = new AdditionSub();
    System.out.println("Is a is instance of Additionsub "+(a instanceof AdditionSub));
    System.out.println("Is a is instance of Object "+(a instanceof Object));
    System.out.println("Is a is instance of Addition"+(a instanceof Addition));
    a.sub(4, 2);
    a.sum(4, 5);

  }

}