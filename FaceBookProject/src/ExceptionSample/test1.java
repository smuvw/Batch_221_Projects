package ExceptionSample;

public class test1 {
	
	
	public void m1(){
		
	try {
		
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}
		
	} catch(Exception e){
		System.out.println("error");
		e.getMessage();
	}
	
	}
	
	public void m2(){
		
				
		try {
			System.out.println("welcome to java ");
			System.out.println("welcome to selenium");
			System.out.println(10/0);
			
		} catch(Exception e)

		{
		System.out.println("test is failed");
		//e.printStackTrace();
	System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("welcome to UFT");
		} catch (Exception e) {
			System.out.println("test is failed");
		}
		
		System.out.println("welcome to VB");
	}

	public static void main(String[] args) {
		test1 t1= new test1();
		t1.m2();
		t1.m1();
	

	}

}
