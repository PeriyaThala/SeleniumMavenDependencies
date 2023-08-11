package UI;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement mousehover = driver.findElement(By.xpath("//li[@data-currenttabindex=\"4\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).perform();
//		Thread.sleep(2000); // ---> this is hard wait, it should not be done until unless if youre debugging or learning. imposing hard wait is like telling website to wait mandatory for given time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait we have give 10 secs -> if the searching element is not found then it will wait for a max of 10 secs but in thread it will wait for sure 10 seconds manditorly also in implicit as soon as the searching element is found it will continue execution
		
//		VASU ONE MORE THING... IMPLICIT WAIT ONCE YOU MENTIONED ABOVE, NOW YOU DONT HAVE TO MENTION FOR OTHER WEBELEMENTS, AS IT IS MENTIONED ONCE, IT WILL CONSIDER/APPLY THROUGHOUT WHEREEVER NEEDED OR NECESSARY FOR ALL SUCH WEBELEMENTS. 
		
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[4]/a")).click();
		driver.close();
		
	}

}
