package com.Oops;

public class Player {
	public void details() {
		System.out.println("Player Details");

	}
	public void details(String name, String team) {
		System.out.println("name:"+name);
		System.out.println("team:"+team);

	}
	
	public void details(int age, int highscore) {
		System.out.println("age:"+age);
		System.out.println("highscore:"+highscore);

	}
	
	
	public static void main(String[] args) {
		Player a= new Player();
		a.details();
		a.details("Dhoni", "CSK");
		a.details(42, 36000);
	}
	


}
