package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class supbost {
	public static String Browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("marketing");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[6]/div[1]/div/div[3]/div/div[2]/div/a")).click();

	}

}
