package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLcertificates2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
//		co.setAcceptInsecureCerts(true);  // you can use this method or below method as per your convenience
		co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);	
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://self-signed.badssl.com/");
	
	}

}
