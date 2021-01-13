package com.techlab.account;

public class SavingAcoount extends Account {
	
	public SavingAcoount(int accno, String accName, double balance) {
		super(accno, accName, balance);
		// TODO Auto-generated constructor stub
	}
	
	public boolean transaction_flag;

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		transaction_flag = false;
		if(amt >= 500) {
			transaction_flag = true;
		}
		
	}

}
