package TestNGSamples;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test2 {
	@BeforeSuite
	public void m5(){
		System.out.println("Before Suite method");
	}
	@Test(priority=3)
	public void m4(){
		System.out.println("close browser");
	}

}
