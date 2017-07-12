package com.krishna.Login;

public class Test2 {
	
	int no;
	String name;
	
	//constructor 
	
	/*Test2(int no,String name){
		
		//this.no=no;
		//this.name=name;
		
		System.out.println(no+"**********"+name);
		
	}*/
	
	Test2(int age,String name){
		  System.out.println(age+","+name);
		 }
	

	public static void main(String[] args) {
		
		Test2 t2= new Test2(10,"sri");
		
		System.out.println(t2.no);
		System.out.println(t2.name);
		
	}

}
