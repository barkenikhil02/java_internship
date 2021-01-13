package com.techlab.employee.test;

import com.techlab.employee.Programmer;

public class EmployeeTest {

	public static void main(String args[]) {
		Programmer p = new Programmer(1, "Nikhil", 2000, 1000);
		System.out.println(p.getId()+"\n"+p.getName()+"\n"+p.getSalary()+"\n"+p.getBonus());
	}
}
