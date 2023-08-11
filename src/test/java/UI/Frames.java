package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		now we are switching from parent frame to sub/child frames
		driver.switchTo().frame(1); // this is by using frame by index
		/*
		 * We can also use frame by id or frame by name, or by webelement
		 * driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame"); //by id or name
		 */
		System.out.println(driver.getTitle());
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
//		now we have to switch back to parent frame from sub/child frames
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		

	}

}
