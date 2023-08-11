package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		/*
		 * Steps to follow:
		 * 
		 * 1. switch to frame (if static/dynamic web table has frame)
		 * 2. get the no of rows
		 * 3. get the no of columns
		 * 4. iterate through rows and columns and get the text and print the text
		 */
		
//		we dont have frames for the above mentioned url so ignored step1
		
//		finding dynamic row xpath
		
		//*[@id="customers"]/tbody/tr -> for dynamic rows
		//*[@id="customers"]/tbody/tr[1] -> for static rows-> mention the row id in square brackets[]
		
//		finding dynamic column xpath
		//*[@id="customers"]/tbody/tr[1]/th -for dynamic columns 
		//*[@id="customers"]/tbody/tr[1]/th[1] -> for static column -> mention the row id and column id in square brackets[]
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowsize = rows.size();
		System.out.println(rowsize);
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));
		int columnsize = columns.size();
		System.out.println(columnsize);
		
		for(int i = 2; i<=rowsize; i++) {
			for(int j =1; j<=columnsize; j++) {
				WebElement table = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(table.getText()+"    ");// we are using print instead println so it will print and not break the line and giving some extra space between columns 
								
			}
			System.out.println();// using to print in next line after each coulmn ends or for every new row
		}
//		driver.close();

	}

}
