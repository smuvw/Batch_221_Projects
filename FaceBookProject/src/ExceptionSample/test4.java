package ExceptionSample;

import java.io.File;

public class test4 {
	
	public static void dostuff() throws InterruptedException {
		domorestuff();
	}
	
	
	public static void domorestuff() throws InterruptedException {
		
		Thread.sleep(1000);
		
		File f= new File("C:\\newfolder\\text.txt");
	}

	public static void main(String[] args) throws InterruptedException  {
		
		test4.dostuff();
	}

}
