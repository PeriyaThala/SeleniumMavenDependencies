package Sample;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moolya\\Downloads\\chromedriver_win32\\chromedriver.exe");// locally/manually downloaded web drivers. but as we have added mvn depandancies. we can skip this step and use below step.
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Moolya\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.com");
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Moolya\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver3 = new EdgeDriver();
		driver3.get("https://www.google.com");

	}

}
