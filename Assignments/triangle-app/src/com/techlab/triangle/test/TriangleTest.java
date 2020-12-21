package com.techlab.triangle.test;

import com.techlab.triangle.Triangle;

public class TriangleTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    Triangle t=new Triangle();
    System.out.println(" area= "+t.area(3,4));
    System.out.println(" Primeter = "+t.perimeter(2, 3, 4));
    

  }

}