package com.techlab.account;

public abstract class Account {
	
	private int accno;
	private String accName;
	private double balance;
	public Account(int accno, String accName, double balance) {
		super();
		this.accno = accno;
		this.accName = accName;
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public String getAccName() {
		return accName;
	}
	public double getBalance() {
		return balance;
	}
	
	public abstract void withdraw(double $);
	
	public void deposit(double amount) {
		this.balance += amount;
	}

}
