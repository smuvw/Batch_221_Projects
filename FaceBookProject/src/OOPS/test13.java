package OOPS;

public class test13 implements test12,test14,test12.test15 {

	public static void main(String[] args) {
		test13 t13= new test13();
		t13.add();
		t13.sub();
		t13.display();
		System.out.println(t13.empno);
		

	}

	@Override
	public void add() {
		System.out.println("this add ");
		
	}

	@Override
	public void sub() {
		System.out.println("this sub ");
		
	}

	@Override
	public void display() {
		System.out.println("this display ");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m15() {
		// TODO Auto-generated method stub
		
	}

}
