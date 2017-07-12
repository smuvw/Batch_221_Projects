package com.krishna.Login;

public class test4 {
	
	//instance method
	
	public void display( int j){
		
		//for loop
		
		for(int i=j;i<=100;i++) {
			
			System.out.println("this is display method ");
			System.out.println(i);
		}
		
		System.out.println("out of for loop ");
		
	}
	
	
	
	public void display1(){
		//while loop
		
		int i=1;
		while(i<=10){
			
			System.out.println(1000);
			i++;
		}
		
		
	}
	
	
	public void display2(){
		// do while loop
		
		int i=123;
		
		do {
			System.out.println("welcome to selenium ");
			i++;
		} while(i<=10);
		
		
	}
	

	public static void main(String[] args) {
		
		test4 t4= new test4();
		
		t4.display(1);
		

	}

}
