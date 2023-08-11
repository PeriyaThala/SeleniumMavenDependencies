package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.xpath("//input[@class=\"Automation\"]"));
		Actions action = new Actions(driver);
		action.scrollToElement(checkbox);
		action.perform();
		Thread.sleep(2000);
		
		WebElement radio1 = driver.findElement(By.id("male"));
		radio1.click();
		System.out.println(radio1.isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type=\"radio\"]")).size());
		driver.close();

	}

}
