package ExceptionSample;

public class test3 {
	
	public static void validate(int age){
		
		if(age<18)
			throw new ArithmeticException(" not valied voter");
		else 
			System.out.println("welcome to vote");
		
	}

	public static void main(String[] args) {
		
		test3.validate(26);

	}

}
