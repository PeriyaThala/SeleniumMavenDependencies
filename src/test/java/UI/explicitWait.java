package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWait {

	public static void main(String[] args) {
		/*
		 * tO AVOID SYNCHRONIZATION ISSUES -> WAITS ARE NEEDED 
		 * WHY EXPLICIT WAIT IS NEEDED? 
		 * 
		 * aS WE KNOW THAT IMPLICIT WAIT CAN BE DECLARED AT ONCE FOR ALL THE WEBELEMENT.
		 * SO BY DEFAULT IF WE ARE GIVING WAITING TIME LIKE 10 SECONDS THEN THERE IS A CATCH
		 * nOT ALL THE WEBELEMENTS WILL LOAD WITH IN 10 SECONDS SOME MIGHT TAKE LESS THAN 10S OR SOME MIGHT TAKE MORE THAN 10, 20, 40, 1MINUTE ETC..
		 * 
		 * SO FOR SUCH ELEMENTS WHICH IS TAKING MORE THAN WHAT IS PROVIDED IN IMPLICIT WAIT-> THEN WE CAN USE EXPLICIT WAIT FOR SUCH WEB ELEMENTS
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement mousehover = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]"));
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).perform();
		
//		To use Explicit wait -> there is a seperate class called WebDriverWait

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/div[2]/div[1]/nav[2]/ul/li[4]/a"))).click();

		driver.quit();
		

	}

}
