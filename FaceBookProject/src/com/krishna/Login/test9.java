package com.krishna.Login;

public class test9 {
	
		static test8 t8;
	
	public static test8 display(){
		
		t8= new test8();
		
		return t8;
		
	}
	
	public void display1(test8 t8){
		int a=t8.m1(7);
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		//test8 t=test9.display();
		//t.m1(3);
		
		test9 t9= new test9();
		test8 t8= new test8();
		
		t9.display1(t8);
		
	
	}

}
