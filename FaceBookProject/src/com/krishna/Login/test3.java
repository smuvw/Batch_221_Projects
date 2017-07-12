package com.krishna.Login;

public class test3 {
	
	
	//instance block
	
	{
	
		System.out.println("welcome to Java class");
	}
	
	// constructor
	
	test3(){
		System.out.println("this is test3 constructor logic");
	}
	
	
	//static block
	
	static{
		System.out.println("welcome to static block code ");
	}
	
	
 //Main method 
	public static void main(String[] args) {
		
		test3 t3= new test3();
		test3 t4= new test3();
		test3 t5= new test3();
	}
	
	

}
