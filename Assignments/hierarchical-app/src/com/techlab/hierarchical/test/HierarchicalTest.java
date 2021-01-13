package com.techlab.hierarchical.test;

import com.techlab.hierarchical.Boy;
import com.techlab.hierarchical.Infant;
import com.techlab.hierarchical.Kid;
import com.techlab.hierarchical.Man;

public class HierarchicalTest {

  public static void main(String[] args) {
    case1();
    case2();
    case3();

    atThePark(new Man());
    atThePark(new Boy());
    atThePark(new Infant());
    atThePark(new Kid());

    case4();

  }

  public static void case1() {
    // here reference type is Man and object type is
    // also Man so methods in a Man class is accessible
    Man mobj = new Man();
    mobj.eat(); // method in Man class
    mobj.play(); // method in Man class
  }

  public static void case2() {
    // here reference type is Boy and object type is also Boy.

    // Boy is a child class of Man class so All non private member
    // of Man class is also accessible to Boy class

    Boy obj1 = new Boy();
    obj1.eat();// method in Man(parent) class
    obj1.play(); // method in Boy class
    obj1.read();// method in Boy class
  }

  public static void case3() {
    // here reference type is Man and object type is Boy
    // so only method which we can access is should be
    // present in Man class And this can be done only if there is
    // a relationship of inheritance

    // (when we compile the compiler will do the method
    // resolution based on the reference type (means the compiler
    // will only see the method is present in a reference type
    // of class or not )
    // [if method is present in reference type then no error else
    // compile time error]
    // At the RunTime JVM will do or assign the method based on
    // Object type (means if the method is overridden in object
    // type of class than that overridden method will invoke or
    // other method which is not overridden will invoke from
    // reference type))
    Man mobj = new Boy();
    mobj.eat();
    mobj.play();// overriding the Man's play() method
    // mobj.read() // this method is not present in Man so inaccessible
  }

  public static void case4() {
    // Object class is a parent of all the classes by default so
    // Object type can hold any type of class object

    Integer k = 10; // autoboxing
    Object x;
    x = 10;
    // here by means of autoboxing 10 will be automatically
    // converted to Integer Wrapper class object
    // (Now 10 is stored in a object of type Integer)
    // as Integer is a child class of Object class so Object class
    // reference 'x' can hold the child class(Integer) object
    // Integer -> Object
    System.out.println(x.getClass());// gives object type of class
    // System.out.println(k == x);// (true) as k is pointing to
    // // a object containing 10 and also x is

    x = "Hello";
    // "Hello" is a type of String and String is also the
    // child class of Object class so it is possible to assign
    // String -> Object
    System.out.println(x.getClass());// gives object type of class

    x = new Man();// Man ->Object by default
    System.out.println(x.getClass());// gives object type of class

  }

  public static void atThePark(Man m) {
    // explanation is similar to case3
    // A parent type reference can hold the object of same type
    // or its child type class and the only method name which
    // can be accessible which is present in a reference type

    System.out.println("At the park");
    m.eat();
    m.play();
  }

}