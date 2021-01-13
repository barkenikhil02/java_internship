package com.techlab.account.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account(1,"Nikhil", 1000);
		System.out.println("Current Balance= "+a.getBalance());
		a.deposit(100);
		System.out.println("Current Balance= "+a.getBalance());
		a.withDraw(600);
		System.out.println("Current Balance= "+a.getBalance());
		a.withDraw(100);
		if(!a.lowBal) {
			
			System.out.println("Current Balance= "+a.getBalance());
		}
		else {
			System.out.println("Low balance");
		}
		storingIntoFile(a);
		retriveAccountDetails(a);
		

	}
	private static void storingIntoFile(Account a) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"J:\\java_internship\\Assignments\\account-app\\src\\AccountDetail.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(a);
			out.flush();
			out.close();
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	private static Account retriveAccountDetails(Account a) {
		try {
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("J:\\java_internship\\Assignments\\account-app\\src\\AccountDetail.txt"));
			
			a = (Account) in.readObject();
			System.out.println(a.getAccName());
			in.close();
		}catch(Exception e) {
			System.err.println(e);
		}
		return a;
	}

}
