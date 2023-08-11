package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLcertificates {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
//		Accepting insecured certs as Global Profile using "DesiredCapabilities" class
		
		DesiredCapabilities dc = new DesiredCapabilities();
		/*
		*dc.setAcceptInsecureCerts(true);// This is one option but we can also use setCapability
		*/
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
//		for browser specific handling insecured certs then 
//		for chrome browser handling we can use chromeoption class. so technically what we are doing here is ChromeDriver 
//		as default configurations. on top of it we are going to merge the additional configuration declared in DesiredCapabilities with chrome by using ChromeOption class
		
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		
		
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://self-signed.badssl.com/");
		
// THIS IS OLD CODE LETS TRY UPDATED ONE IN NEW SSLCERTIFICATES2.JAVA CLASS
	}

}
