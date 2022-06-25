package com.Oops;

public class Student {
	private void details() {
		System.out.println("Student Details:");

	}
	public void details(String name) {
		System.out.println("Student name is:"+name);

	}
	public void details(char sec, String dept) {
		System.out.println("Student sec:"+sec);
		System.out.println("Student department:"+dept);

	}
	public void details(int m1,int m2,int m3) {
		System.out.println("Student marks:"+m1+","+m2+","+m3);

	}
	public static void main(String[] args) {
		Student a= new Student();
		a.details();
		a.details("Amudhan");
		a.details('A', "Computer Science");
		a.details(49, 78, 93);
	}

}
