package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement sourceelement = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.keyDown(sourceelement, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform(); // as it has lot of operations to be performed in sequences, we have to use build and then perform
		Thread.sleep(1000);
		WebElement destinationelement = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
		Thread.sleep(1000);
		action.keyDown(destinationelement, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
