package com.techlab.account;

import java.io.Serializable;

public class Account implements Serializable {
	private int accNo;
	private String accName;
	private double balance;
	public boolean lowBal = false;
	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(int deposit) {
		
		this.balance = this.balance+deposit;
	}
	public void withDraw(int withdraw) {
		if(this.balance-withdraw<500) {
			lowBal=true;
		}
		else {
			this.balance = this.balance-withdraw;
		}
	}
	
	
}