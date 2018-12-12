package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class property {

	public static void main(String[] args) throws IOException {
		
		// file create
		File fp = new File("C:/Eclipse/LearningSelenium/prop.properties");
		// toread the contents from the file
		FileInputStream fileinput = new FileInputStream(fp);	
		Properties prop = new Properties();
		prop.load(fileinput);
		System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse/LearningSelenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url1"));
		driver.findElement(By.xpath(prop.getProperty("HomePageObject")));
	}

}
