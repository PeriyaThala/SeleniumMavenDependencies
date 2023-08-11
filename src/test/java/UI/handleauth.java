package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleauth {
	
	public static String Username = "admin"; // read from CSV or XLS
	public static String Password = "admin"; // read from CSV or XLS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // you can enter the username and password in url itself for basic authentication like username:Password@
		*/
//		we can also externalize the above line by below method
		
		driver.get("https://"+Username+":"+Password+"@the-internet.herokuapp.com/basic_auth");
		driver.quit();
		

	}

}
