package com.techlab.contact.test;

import java.util.Scanner;

import com.techlab.contact.Contact;

public class ContactTest {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Contact cobj = new Contact();
		String fname, lname, phoneno, emailid;
		int num;

		do {
			System.out.println("1  display contact \n2  add contact " + "\n3  delete contact "
					+ "\n4  update phone no \n5  Search contact\n6  exit\nEnter choice ");
			num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1: {
				String data = cobj.display();
				if (data == "") {
					System.out.println("Data not found");
				} else
					System.out.println(data);
				break;
			}
			case 2: {
				System.out.println("Enter First Name: ");
				fname = sc.nextLine().trim();
				System.out.println("Enter Last Name: ");
				lname = sc.nextLine().trim();
				System.out.println("Enter Phone no: ");
				phoneno = sc.nextLine().trim();
				System.out.println("Enter Email id: ");
				emailid = sc.nextLine().trim();

				if (cobj.add(fname, lname, phoneno, emailid) == 1) {
					System.out.println("Data successfully inserted");
				} else
					System.out.println("Data not inserted");
				break;
			}
			case 3: {
				System.out.println("Enter First name and Last name of contact want to delete:\n ");
				fname = sc.nextLine();
				String s[] = fname.split(" ");
				fname = s[0];
				lname = s[1];
				int row = cobj.delete(fname, lname);
				if (row >= 1) {
					System.out.println("" + row + " rows has been deleted successfully");
				} else {
					System.out.println("No rows has been deleted");
				}
				break;
			}
			case 4: {
				System.out.println("update phone no:\n");
				System.out.println("Enter First name : ");
				fname = sc.nextLine().trim();
				System.out.println("Enter Last name : ");
				lname = sc.nextLine().trim();
				System.out.println("Enter old Phone no : ");
				phoneno = sc.nextLine().trim();
				boolean row;
				row = cobj.show(fname, lname, phoneno);
				if (row == true) {
					System.out.println("Enter new phone no :");
					String newphoneno = sc.nextLine().trim();
					cobj.update(fname, lname, phoneno, newphoneno);
					System.out.println("phone no has been updated successfully");
				} else {
					System.err.println("No such details is detected!!!!!");
				}
				break;

			}
			case 5: {
				System.out.println("Enter Fname: ");
				fname = sc.nextLine().trim();
				System.out.println("Enter Lname: ");
				lname = sc.nextLine().trim();
				String data = cobj.search(fname, lname);
				if (data == "") {
					System.out.println("No data is present");
				} else
					System.out.println(data);
				break;
			}
			default:
				break;

			}

		} while (num != 5);

		cobj.closeConnection();

	}

}