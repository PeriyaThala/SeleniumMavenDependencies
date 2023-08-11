package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizeWidget {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/resizable");
		driver.manage().window().maximize();
//		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
//		Thread.sleep(2000);
		Actions action = new Actions(driver); //creating object of Actions class in order use options available in Actions class
		action.dragAndDropBy(drag, 100, 50).perform();

	}

}
