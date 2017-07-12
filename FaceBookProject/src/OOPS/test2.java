package OOPS;

public class test2 extends test1 {
	
	//test1 - Super class  or Parent 
	//test2 - child class 
	
	int sal=200;
	String Address;
	
	public void sal1(){
		System.out.println( "this is sal");
		System.out.println(super.sal);
	}
	
	public void  display(){
		System.out.println("this is from test2");
	}

	public static void main(String[] args) {
		
		test2 t2= new test2();
		/*t2.empno=100;
		System.out.println(t2.empno);
		t2.name="sri";
		System.out.println(t2.name);
			t2.Address="Main st";
		t2.display();*/
		t2.sal1();
		
		
		
		

	}

}
