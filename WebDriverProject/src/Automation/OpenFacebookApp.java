package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebookApp {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("abc@gmail.com");
		driver.findElementByName("firstname").sendKeys("srini");
		driver.findElementByName("lastname").sendKeys("muvva");
		Thread.sleep(4000);
		driver.findElementById("u_0_m").click();
		driver.quit();
		

	}

}
