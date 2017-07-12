package OOPS;

public class test8 extends test7{

	
	public void m3(){
		System.out.println("this is m3 method");
	}
	
	//test7 - Parent or super class
	//test8 - child or sub class
	
	public static void main(String[] args) {
		
		test8 t8= new test8();
		
		t8.no=100;
		System.out.println(t8.no);
		t8.name="sri";
		System.out.println(t8.name);
		t8.m1();
		t8.m2();
		t8.m3();
		

	}

}
