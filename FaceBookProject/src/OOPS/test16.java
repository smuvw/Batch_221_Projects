package OOPS;

public class test16  extends test15{

	
public void m1(){
		
		System.out.println("this is m1 from test16 class");
	}

public void add(int a,int b){
	System.out.println(a+b);
}
public void add(int a,int b,int c){
	System.out.println(a+b+c);
}

public void add(int a,float b,int c){
	System.out.println(a+b+c);
}

public void add(Object[] a){
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
}

	public static void main(String[] args) {
		
		test16 t16= new test16();
		
		t16.m1();
		t16.add(1, 2);
		t16.add(1, 2, 3);
		
		Object[] b={1,10,12,"Selenium"};
		
		t16.add(b);
		
		t16.m16();
	}
	
	
	public  void m16(){
		System.out.println("this is m16");
	}

}
