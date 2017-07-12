
public class test7 {

	public static void main(String[] args) {
		
		test7 t7= new test7();
		t7.display();
		t7.display();
	
		t7.add(10, 20);
		t7.add(40, 50);
		
		test7.sub(60, 30);
		test7.sub(100, 50);
		
		
		int a=t7.mul(6, 5);
		System.out.println(a);
		
		t7.add(a, 5);
		
		String b=t7.message();
		System.out.println(b);
		
		int c=test7.m1();
		System.out.println(c);
	}
	
	
	//instance method 
	public void display(){
		
		System.out.println("this is display method");
		
	}
	
	public void add(int a,int b){
		
		int c=a+b;
		System.out.println(c);
		
	}
	
	public void login(String uname,String Pwd){
		
	}
	
	//static method 
	public static void sub(int a,int b){
		int c=a-b;
		System.out.println(c);
		
	}
	
	
	public int mul(int a,int b){
		
		int c=a*b;
		return c;
		
	}
	
	
	public String message(){
		
		return "welcome";
	}
	
	public static int m1(){
		
		return 10;
	}
	
	

}
