package com.techlab.account.test;

import com.techlab.account.*;

public class AccountTest {
	
	public static void main(String args[]) {
		
		CurrentAccount ca = new CurrentAccount(1,"Nikhil",1000);
		
		SavingAcoount sa = new SavingAcoount(2,"Hello",2000);

		ca.deposit(100);
		ca.withdraw(800);
		if(!ca.transaction_flag) {
			System.out.println("Failed Withdraw");
		}
		else {
			System.out.println("Success Withdraw");
		}
		sa.deposit(100);
		printt(ca);
		printt(sa);
		
		
	}

	private static void printt(Account a) {
		// TODO Auto-generated method stub
		System.out.println("Account no= "+a.getAccno());
		System.out.println("Account name= "+a.getAccName());
		System.out.println("Account Balnace= "+a.getBalance());
		
	}

	
}
