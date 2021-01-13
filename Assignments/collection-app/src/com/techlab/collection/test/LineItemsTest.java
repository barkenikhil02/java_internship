package com.techlab.collection.test;

import java.util.ArrayList;
import com.techlab.collection.LineItems;

public class LineItemsTest {

  public static void main(String[] args) {
    ArrayList<LineItems> cart = new ArrayList<LineItems>();
    cart.add(new LineItems(101, "Apple", 30, 10));
    cart.add(new LineItems(105, "Banana", 15, 5));
    cart.add(new LineItems(199, "Toothpaste", 85, 2));
//    cart.add("java") // it is generic type=LineItem so 
//    String is not acceptable
    printCartItem(cart);
  }

  private static void printCartItem(ArrayList<LineItems> cart) {
    for (int i = 0; i < cart.size(); i++) {
      System.out.println(cart.get(i).toString());
    }
  }
}