		package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();

	}

}
