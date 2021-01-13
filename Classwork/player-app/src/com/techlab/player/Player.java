package com.techlab.player;

public class Player {
	private static int id=100;
	private String name;
	private int age;
	public boolean isElder = false;
	public Player( String name, int age){
		Player.id++;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void whoIsElder(Player p) {
		if(age<p.age) {
			isElder = true;
		}
		
	}
}
