package com.techlab.person;

public class Person {

	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;
	public Person(String name, int age, String gender, float height, float weight) {
		this(name, gender,height,weight);
		this.age=age;
		
		
	}
	public Person(String name, String gender, float height, float weight) {
		this.name=name;
		this.age=25;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
		
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
	public void doWorkout(float weight) {
		this.weight = weight-((20/100)*weight);
	}
	public void doEat(float weight) {
		this.weight = weight+((5/100)*weight);
	}
}