package com.techlab.db.test;

import com.techlab.db.*;

public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Icrudable aobj = new AddressDb();
		Icrudable bobj = new CustomerDb();
		Icrudable cobj = new InvoiceDb();
		
		printt(aobj);
		printt(bobj);
		printt(cobj);

	}

	private static void printt(Icrudable obj) {
		// TODO Auto-generated method stub
		System.out.println("_________________");
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
		
	}

}
