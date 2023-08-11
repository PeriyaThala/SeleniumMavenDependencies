package Sample;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise2 {

	public static String Browser = "Edge";
	public static WebDriver driver;
	
	public static void main(String[] args) {

		if(Browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}
		driver.get("https://www.saucedemo.com/");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement username = driver.findElement(with(By.tagName("input")).above(password));
		WebElement login = driver.findElement(with(By.tagName("input")).below(password));
		login.click();
		

	}

}
