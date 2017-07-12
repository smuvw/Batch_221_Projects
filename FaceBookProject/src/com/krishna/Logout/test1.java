package com.krishna.Logout;

public class test1 {
	int no;
	String empname;
	
	
	//Singleton Pattern
//1. constructor with private 
	private test1(){
		
	}
	
//2.create object 
	
private static test1 instance = new test1();

//3. create the method with public static 

public static test1 getInstance(){
	
	return instance;
	
}

public void add(){
	System.out.println("this is add method");
}
	
	
}
