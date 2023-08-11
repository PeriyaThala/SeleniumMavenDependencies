package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement firstelement = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(firstelement).perform();// perform operation is must to execute before executing build()
		driver.quit();
		

	}

}
