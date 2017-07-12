package com.krishna.Login;

public class LoginTest {
	
	static int no=100; // Default -only within Package 
	
	public String name="Sri"; //public  //Any package in the project 
	
	private float price=10.23f; //only with in the class 
	
	
	public void add(){
		System.out.println("this is add method ");
	}
	
	void sub(){
		
		System.out.println("this is sub method ");
	}
	
	private void login(){
		System.out.println("this is login method ");
	}
	

	public static void main(String[] args) {
		
		LoginTest t1= new LoginTest();
		System.out.println(t1.price);

	}

}
