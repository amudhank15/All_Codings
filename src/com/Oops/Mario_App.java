package com.Oops;

public class Mario_App extends Gaming {
	@Override
	public void mobile(int number) {
		System.out.println("contact:"+number);
		super.mobile(number);
	}
	
	public static void main(String[] args) {
		Mario_App m= new Mario_App();
		m.login(1244444444);
		m.mobile(11111111);
	}
	

}
