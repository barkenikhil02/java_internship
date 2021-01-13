package com.techlab.srp.test;

import com.techlab.srp.Invoice;
import com.techlab.srp.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice = new Invoice(101, "Nikhil", 500.0, 25.0f);
		InvoicePrinter printer = new InvoicePrinter(invoice);

	}

}
