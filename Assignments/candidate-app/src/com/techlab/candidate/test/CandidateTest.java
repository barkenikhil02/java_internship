package com.techlab.candidate.test;

import com.techlab.candidate.Candidate;

public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Candidate c1 = new Candidate(1,"Nikhil",21,"5");
		Candidate c2 = new Candidate(1,"Hello",21,"4");

		c1.whoIsBetter(c2);
		if(!(c1.isBetter)) {
			System.out.println(c2.getName() + " is better than " + c1.getName());
		}
		else {
			System.out.println(c1.getName() + " is better than " + c2.getName());
		}
		

	}
}
