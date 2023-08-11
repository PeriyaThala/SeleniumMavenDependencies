package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Links {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
//		finding all the links in the webpage
		
		/*
		 * List<WebElement> alltags = driver.findElements(By.tagName("a"));
		 * System.out.println(alltags.size());
		 * 
		 * for(int i =0; i<alltags.size(); i++) {
		 * 
		 * System.out.println(alltags.get(i).getAttribute("href"));
		 * System.out.println(alltags.get(i).getText()); }
		 */

//		finding all the dropdowns in the webpage

		
		List<WebElement> alltags1 = driver.findElements(By.tagName("option"));
		System.out.println(alltags1.size());
		
		for(int i =0; i<alltags1.size(); i++) {
			
			System.out.println(alltags1.get(i).getAttribute("value"));
			System.out.println(alltags1.get(i).getText());
		}
		
		
		WebElement sig = driver.findElement(By.id("how-select"));
		Select select = new Select(sig);
		
//		To find all the options of selected dropdown field alone
		
		List<WebElement> getop = select.getOptions();
		System.out.println(getop);
		System.out.println(getop.size());
		for(int i =0; i<getop.size(); i++) {
			
			System.out.println(getop.get(i).getAttribute("value"));
//			System.out.println(getop.get(i).getText());
		}
		
		
		driver.quit();

	}

}
