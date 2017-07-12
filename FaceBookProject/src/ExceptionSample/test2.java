package ExceptionSample;

public class test2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Open SQL DB connection ");
			System.out.println(10/2);
			
		} catch(Exception e){
			System.out.println("error in the prog");
			e.printStackTrace();
			
		} finally {
			System.out.println("close the DB connection");
		}

	}

}
