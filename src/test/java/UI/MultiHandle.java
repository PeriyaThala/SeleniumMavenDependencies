package UI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("marketing");
		driver.findElement(By.xpath("/html/body/div[10]/div/div[6]/div[1]/div/div[3]/div/div[2]/div/a")).click();
		Thread.sleep(4000);
//		Eventhough it navigates to next window, still the focus will be on current or existing window only. when you click on some button which redirects to next window, then we have to follow below steps by using get windows handle 
		
//		getWindowHandles returns set<>.. the difference between set and list is that set will not have duplicates but list can contain duplicates
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator(); // Iterator is used to iterate in the sets.
		String parentwindow = iterator.next(); // It is used to navigate to next window. Iterator will be outside. when used first time "next" it will go to parent window, then second time if you use "next" it will go to child window and so on...
		System.out.println(parentwindow);
		String Childwindow = iterator.next();
		System.out.println(Childwindow);
		driver.switchTo().window(Childwindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("Vasu");
		driver.findElement(By.name("UserLastName")).sendKeys("Vanshika");
		driver.switchTo().window(parentwindow);
		driver.quit();

	}

}
