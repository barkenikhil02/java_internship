package com.techlab.srp;

public class Invoice {

	private int no;
	private String name;
	private double amount;
	private double discountPercentage;
	private float gst;
	public Invoice(int no, String name, double amount, double discountPercentage) {
		super();
		this.no = no;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public double getAmount() {
		return amount;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public float getGst() {
		return gst;
	}
	
	public double calculateDiscount() {
		double discount = 0;
		return discount;
	}
	public double calculateGST() {
		double gst = 0;
		return gst;
	}
	public double calculateTotalCost() {
		double cost = 0;
		return cost;
	}
	
	
	
	

}
