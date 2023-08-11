package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handleCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement generatebox = driver.findElement(By.id("ConfirmBox"));
		Actions action = new Actions(driver);
		action.scrollToElement(generatebox);
		action.perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]")).isSelected(); // to verify whether the checkbox is selected or not		
		driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElements(By.xpath("//*[@type=\"checkbox\"]")).size());
		driver.quit();

	}

}
