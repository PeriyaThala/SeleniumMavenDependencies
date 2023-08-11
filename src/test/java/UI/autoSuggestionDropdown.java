package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"themeSnipe\"]/div/div/div[1]/button")).click();
		driver.findElement(By.id("BE_flight_origin_city")).click();
		Thread.sleep(1000);
		/*
		 * driver.findElement(By.
		 * xpath("//input[@placeholder =\" \"][@class =\"required_field cityPadRight ac_input origin_ac\"]"
		 * )).sendKeys("Toronto"); driver.findElement(By.
		 * xpath("//input[@placeholder =\" \"][@class =\"required_field cityPadRight ac_input origin_ac\"]"
		 * )).sendKeys(Keys.ARROW_DOWN); driver.findElement(By.
		 * xpath("//input[@placeholder =\" \"][@class =\"required_field cityPadRight ac_input origin_ac\"]"
		 * )).sendKeys(Keys.ENTER);
		 */
		
//		The above code can be changed into simple format
		WebElement from = driver.findElement(By.xpath("//input[@placeholder =\" \"][@class =\"required_field cityPadRight ac_input origin_ac\"]"));
		from.sendKeys("Toronto");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		
		
//		you can use the below code for makemytrip website -> from field auto suggestion selection
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[3]/div/div[2]/div/span")).click();
		 * Thread.sleep(1000); driver.findElement(By.id("fromCity")).click();
		 * driver.findElement(By.xpath("//input[@type=\"text\"][@placeholder=\"From\"]")
		 * ).sendKeys("Sydney");
		 * driver.findElement(By.xpath("//input[@type=\"text\"][@placeholder=\"From\"]")
		 * ).sendKeys(Keys.ARROW_DOWN);
		 * driver.findElement(By.xpath("//input[@type=\"text\"][@placeholder=\"From\"]")
		 * ).sendKeys(Keys.ENTER);
		 */
//		driver.close();

	}

}
