package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentWait {

	public static void main(String[] args) {

		/*
		 * The advantage of Fluent Wait is that -> it has polling time. In implicit wait
		 * or explicit wait we dont know how often the polling or searching of an
		 * specified element with in a given time will happen. We can mention the
		 * polling time via Fluent Wait.. so every polling time mentioned it will search
		 * for the specified element
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		WebElement mousehover = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]"));

		Actions action = new Actions(driver);
		action.moveToElement(mousehover).perform();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(4))
				.pollingEvery(Duration.ofSeconds(2)).withMessage("Vasu is a fucking beats")
				.ignoring(NoSuchElementException.class);// you should use class of selenium
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[4]/a"))).click();
		driver.quit();

	}

}
