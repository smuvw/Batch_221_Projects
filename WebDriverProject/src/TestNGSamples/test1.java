package TestNGSamples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class test1 {
	
	ChromeDriver driver;
	
	
	
	@BeforeMethod
	public void m1(){
		System.out.println("BEfore Method-M1");
	}
	
	@AfterMethod
	public void m2(){
		System.out.println("After Method-M2");
	}
	
	@Test(priority=1)
	public void openBrowser(){
		
		driver= new ChromeDriver();
		Assert.assertEquals("HI", "Welcome");
	}
	
	@Test(priority=2,dependsOnMethods="openBrowser")
	public void OpenApp(){
		driver.get("https://www.facebook.com/");
		
	
	}
	
	@BeforeClass
	public void m3(){
		System.out.println("before class");
	}
	

}
