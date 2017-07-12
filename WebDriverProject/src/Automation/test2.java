package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test2 {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	/*driver.get("https://jqueryui.com/resources/demos/slider/default.html");

	
WebElement 	a=driver.findElementByXPath("//div[@id='slider']/span");
	
	Actions action= new Actions(driver);
	
	action.dragAndDropBy(a, 300, 0).perform();*/
	
	driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
	
	WebElement 	a=driver.findElementByXPath(".//*[@id='resizable']/div[3]");
	Actions action= new Actions(driver);
	
	action.dragAndDropBy(a, 300, 200).perform();

	}

}
