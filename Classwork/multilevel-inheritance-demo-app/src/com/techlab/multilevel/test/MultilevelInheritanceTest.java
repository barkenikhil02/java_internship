package com.techlab.multilevel.test;

import com.techlab.multilevel.Animal;
import com.techlab.multilevel.BabyDog;
import com.techlab.multilevel.Dog;

public class MultilevelInheritanceTest {

  public static void main(String[] args) {
  Animal a=new Animal();
  a.eat(); //class method
  
  Dog b=new Dog();
  b.eat();// parent class method
  b.bark(); //class method
  
  BabyDog bb=new BabyDog();
  bb.eat();// grand parent class method
  bb.bark();// parent class method
  bb.weep(); // class method
  
  }

}