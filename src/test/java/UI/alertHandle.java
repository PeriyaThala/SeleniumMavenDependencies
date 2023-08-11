package UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"button\"][@value=\"Alert\"]")).click();
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
		
		/*
		 * Instead of above three lines we can use below code to keep the code clean 
		 * Alert alertonpage = driver.switchTo().alert();
		 * String alerttext = alertonpage.getText();
		 * System.out.println(alerttext);
		 * alertonpage.accept();
 		 */
		
		System.out.println(driver.getTitle());
	}

}
