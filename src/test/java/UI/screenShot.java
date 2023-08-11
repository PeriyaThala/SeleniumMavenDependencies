package UI;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) throws IOException {

		
		Date currentdate = new Date();
		System.out.println(currentdate); // using date class we can get current date and then convert to string and use it as screenshot attchments file name 
		String ScreenshotName = currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(ScreenshotName);
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/giftcard/personalise");
		File ScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		/*
		 * FileUtils.copyFile(ScreenshotFile, new File(".//screenshot/screen.png"));//basically every time you run this code.. it will overwrite the same screenshot attachment  -> so we can use date class		
		 */
		FileUtils.copyFile(ScreenshotFile, new File(".//screenshot//"+ScreenshotName+".png"));
		
		

	}

}
