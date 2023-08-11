package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLcertificates3 {
	
	public static String browser = "Firefox";
	public static WebDriver driver;

	public static void main(String[] args)  {
		
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
//			co.setAcceptInsecureCerts(true);
			co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			driver = new ChromeDriver(co);
		} else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fo = new FirefoxOptions();
			fo.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			driver = new FirefoxDriver(fo);
		}
		driver.get("https://expired.badssl.com/");
		
	}

}
