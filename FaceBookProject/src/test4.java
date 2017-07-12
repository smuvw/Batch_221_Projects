
public class test4 {
	
	
	int no=100; //instance variable 
	
	static String empname="vasu"; //static variable 

	
	//Main method 
	
	public static void main(String[] args) {
		
		int a=10;  //local variable 
		System.out.println(a);
		
		test4 t4=new test4();
		
		System.out.println(t4.no);
		System.out.println(test4.empname);
		t4.display();
		
		
		
	}
	
	
	
	//display method 
	public void display(){
		
		String name="sri"; //local variable 
		System.out.println(name);
		System.out.println(no);
		System.out.println(empname);
	}
	

}
