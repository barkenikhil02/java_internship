package com.techlab.candidate;

public class Candidate {

	private int id;
	private String name;
	private int age;
	public boolean isBetter = false;
	private String creditPoint;
	public Candidate(int id, String name, int age, String creditPoint) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.creditPoint = creditPoint;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCreditPoint() {
		return creditPoint;
	}
	public void whoIsBetter(Candidate c) {
		int res = creditPoint.compareToIgnoreCase(c.creditPoint);
		if(res<0) {
			isBetter = true;
		}
	}
	
	
	
}
