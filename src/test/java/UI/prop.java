package UI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class prop {

	public static void main(String[] args) throws IOException {

//		Class properties can be used for the properties that can be saved to a stream or loaded from the stream. FileInputStream -> to read the data from the file and FileOutputStream -> to write the data to the file.
		
		Properties propp = new Properties();
		FileInputStream fis = new FileInputStream("D:\\SeleniumMvn\\src\\test\\resources\\Properties\\testdata.Properties");
		propp.load(fis);
		System.out.println(propp.getProperty("browser"));
		System.out.println(propp.getProperty("url"));
		
		FileOutputStream fos = new FileOutputStream("D:\\SeleniumMvn\\src\\test\\resources\\Properties\\testdata.Properties");
		propp.setProperty("testdata", "29839937937");
		propp.store(fos, "vasu you made it");

	}

}
