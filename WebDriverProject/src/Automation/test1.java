package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/");
		//welcome to Java 
		System.out.println("hi");
		//driver.manage().window().maximize();
		
		driver.findElementByXPath(".//*[@id='sidebar']/aside[1]/ul/li[4]/a").click();
		
		WebElement a=driver.findElementByXPath(".//*[@id='content']/iframe");
		//page to Frame
		driver.switchTo().frame(a);
		driver.findElementByXPath(".//*[@id='selectable']/li[1]").click();
		//Frame to page 
		driver.switchTo().defaultContent();
				
		driver.findElementByXPath(".//*[@id='sidebar']/aside[1]/ul/li[5]/a").click();

	}

}
