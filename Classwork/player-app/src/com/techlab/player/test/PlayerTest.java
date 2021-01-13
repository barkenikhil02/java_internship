package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] p = new Player[2];
		p[0] = new Player("Nikil",21);
		System.out.println(p[0].getId()+" "+p[0].getName()+" "+p[0].getAge());
		p[1] = new Player("Hello",22);
		System.out.println(p[1].getId()+" "+p[1].getName()+" "+p[1].getAge());
//		whoIsElder(p);
		p[0].whoIsElder(p[1]);
		if(!(p[0].isElder)) {
			System.out.println(p[0].getName()+" is elder than "+p[1].getName());
		}
		else {
			System.out.println(p[1].getName()+" is elder than "+p[0].getName());
		}
		

	}
	
//	static void whoIsElder(Player p[]) {
//		if(p[0].getAge()>p[1].getAge()) {
//			System.out.println(p[0].getId()+"\n"+p[0].getName()+"\n"+p[0].getAge());
//		}
//		else {
//			System.out.println(p[1].getId()+"\n"+p[1].getName()+"\n"+p[1].getAge());
//		}
//	}

}
