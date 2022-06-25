package com.Oops;

public class Interface implements Whatsapp,Instagram{

	@Override
	public void signin() {
		System.out.println("amudhank11");
		
	}

	@Override
	public void pswrd() {
		System.out.println("abc@123");
		
	}

	@Override
	public void login() {
		System.out.println("amudhank12");
		
	}

	@Override
	public void password() {
		System.out.println("xyz@123");
		
	}
	public static void main(String[] args) {
		Interface i= new Interface();
		i.login();
		i.password();
		i.signin();
		i.pswrd();
	}

}
