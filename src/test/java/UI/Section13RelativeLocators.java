package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Section13RelativeLocators {

	public static String browser = "chrome"; // external file where we can get it from xls or csv etc
	public static WebDriver driver;
	public static void main(String[] args) {

		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		WebElement password = driver.findElement(By.id("password"));
		WebElement username = driver.findElement(with(By.tagName("input")).above(password));
		username.sendKeys("Vasu");
		WebElement button = driver.findElement(with(By.tagName("input")).below(password));
		button.click();
	}

}
