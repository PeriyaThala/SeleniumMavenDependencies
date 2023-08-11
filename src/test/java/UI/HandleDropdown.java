package UI;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static String Browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		if (Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
//		  driver.get("https://www.sugarcrm.com/au/request-demo/");
//		  driver.manage().window().maximize();
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		  driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/button[4]")).click(); 
//		  WebElement dropdown = driver.findElement(By.id("how-select")); 
//		  Select select = new Select(dropdown);
//		  select.selectByValue("Previously Used");
//		  Thread.sleep(2000); 
//		  select.selectByVisibleText("YouTube");
//		  Thread.sleep(2000); 
//		  select.selectByIndex(6);
//		  
		 

//		execute the above code for handle dropdown1 and below code for handle dropdown2

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement multidropdown = driver.findElement(By.xpath("//*[@id=\"second\"][@class=\"col-lg-3\"]"));
		Select select = new Select(multidropdown);
		select.selectByIndex(3);
		Thread.sleep(1000);
		WebElement firstoption = select.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		select.selectByValue("burger");
		Thread.sleep(1000);
		select.selectByVisibleText("Donut");
		Thread.sleep(1000);
		List<WebElement> allmultiselected = select.getAllSelectedOptions();
		System.out.println(allmultiselected);
		System.out.println(allmultiselected.size());
		
		select.deselectAll();
		Thread.sleep(1000);
		System.out.println(allmultiselected.size());

		select.selectByValue("burger");
		Thread.sleep(1000);
		select.selectByVisibleText("Donut");
		Thread.sleep(1000);

		select.deselectByValue("burger");
		Thread.sleep(1000);
		List<WebElement> allmultiselected1 = select.getAllSelectedOptions();
		System.out.println(allmultiselected1);
		System.out.println(allmultiselected1.size());

//		driver.close();
	}

}
