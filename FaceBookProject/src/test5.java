
public class test5 {
	
		 int empno=5; //instance variable 
		
		static String empname; //static variable 
		
		static boolean b;
		static float f;
		static char c;
	
	public static void main(String[] args) {
	
		System.out.println("welcome to java ");
		System.out.println(empname);
		//System.out.println(empno);
		
		System.out.println(b);
		System.out.println(f);
		System.out.println(c);
	}
	
	//instance method 
	public void display(){
		
		int b=30; //local variable to display method 
		System.out.println(b);
		
		
	}
	
	//static method 
	public static void add(){
		String name="Sri";
		System.out.println(name);
		
	}

}
