package com.techlab.collection;

public class LineItems {
  private int id, quantity;
  private String name;
  private double unitPrice, totalCartPrice;

  public LineItems(int id, String name, 
      int quantity, double unitPrice) {
    super();
    this.id = id;
    this.quantity = quantity;
    this.name = name;
    this.unitPrice = unitPrice;
  }

  public int getId() {
    return id;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getName() {
    return name;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public double calculateTotalCartPrice() {
    return (double) unitPrice * quantity;
  }

  @Override
  public String toString() {
    return "LineItem [id = " + id + ", name = " + name + 
        ", unitPrice = " + unitPrice +
        ", quantity = " + quantity
        + ", calculateTotalCartPrice = " 
        + calculateTotalCartPrice() + "]";
  }

}