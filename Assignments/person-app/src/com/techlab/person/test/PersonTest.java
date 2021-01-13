package com.techlab.person.test;

import com.techlab.person.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Hello",21,"Male",5.9f,49);
		Person p2 = new Person("World","Male",5.7f,65);
		p1.doWorkout(p1.getWeight());
		p2.doEat(p2.getWeight());
		System.out.println("Name= "+p1.getName()+"\nGender= "+p1.getGender()+"\nAge= "+p1.getAge()+"\nWeight= "+p1.getWeight());
		System.out.println(p2.getName()+"\n"+p2.getGender()+"\n"+p2.getAge()+"\n"+p2.getWeight());

	}

}