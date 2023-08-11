package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoSlider {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
//		Thread.sleep(2000);
		WebElement box2 = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(box2, -50, 125).perform(); //x and y coordinates depends on basic position of the element choosen. from there it will take 0, -ve and +ve
		
		action.contextClick().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
