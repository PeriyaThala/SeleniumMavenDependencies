package UI;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElements2 {
	
	public static String Browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		if(Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/button[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("vasuv0503@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.name("email")).clear();
		System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getSize());
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[3]/div/div[1]/div/div[1]/h2")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isSelected());
		driver.quit();

	}

}
