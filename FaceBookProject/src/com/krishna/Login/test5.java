package com.krishna.Login;

public class test5 {
	
	static test4 t4;
	
	public static test4 t(){
		
		t4= new test4();
		return t4;
	}
	
	public static void add(int i)
	{
		// if conditions
		
		if(i<5){
			System.out.println("hi");
		} else {
			System.out.println("java");
		}
		
	}
	
	
	public static void display(char i){
		
		switch (i){
		
		case 'A':
			System.out.println("A grade");
			break;
		case 'B':
			System.out.println("B grade");
			break;
			
		case 'C':
			System.out.println("C grade");
			break;
			
		
		}
	}
	
	
	public static void main(String[] args) {

		
		test5.display('A');
		test4 a=test5.t();
		a.display1();

	}

}
