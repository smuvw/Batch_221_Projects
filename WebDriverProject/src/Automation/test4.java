package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//ChromeDriver driver = new ChromeDriver();
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.macys.com/");
		Thread.sleep(7000);
		WebElement menu_kid=driver.findElement(By.xpath(".//*[@id='flexid_5991']/a"));
		//Thread.sleep(7000);
		Actions action=new Actions(driver);
		
		action.moveToElement(menu_kid).perform();
		
driver.findElement(By.xpath(".//*[@id='flexLabel_/shop/kids-clothes/kids-jeans/Size_range/Boys%202-7%7CBoys%208-20?id=63008']/a")).click();
		
	}

}
