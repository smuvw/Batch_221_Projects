
public class test6 {
	
	int zipcode;
	static String city;

	public static void main(String[] args) {
		
		test5 t5= new test5();
		t5.empno=100;
		System.out.println(t5.empno);
		System.out.println(test5.empname);
		test5.add();
		
		test6 t6= new test6();
		t6.zipcode=60007;
		
		test6.city="chicago";

	}

}
