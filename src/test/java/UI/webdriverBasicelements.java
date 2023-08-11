package UI;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriverBasicelements {

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
		
		driver.get("https://customer.avysh.com/users/login");
		driver.manage().window().maximize();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
//		driver.navigate().to("https://www.iitb.ac.in/");		
////		driver.close();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class = \"inventory_list\"]/div")); //FIND IT VASU hINT -> "s" (FINDELEMENTSs is the list<webelement> type and findelement is the webelement type.
//		System.out.println(webelements);
//		
//		driver.navigate().to("https://www.sugarcrm.com");
//		String windowhandle = driver.getWindowHandle();
//		System.out.println(windowhandle);
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/button[4]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[4]/div/div/div/div[1]/div/a")).click();
//		Set<String> windowhandles = driver.getWindowHandles();
//		System.out.println(windowhandles);

//		driver.quit();
	}

}
