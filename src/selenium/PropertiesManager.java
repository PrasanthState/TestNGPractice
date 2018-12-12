package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class PropertiesManager {
	static FileInputStream fileinput=null;
	public static void main(String[] args) throws IOException {
		File fl = new File("C:/Eclipse/LearningSelenium/object.properties");
		try {
			 fileinput = new FileInputStream(fl);
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
		}
		
		Properties prop = new Properties();
		prop.load(fileinput);
		System.out.println(prop.getProperty("droppable"));
		System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse/LearningSelenium/drivers/chromedriver.exe");
				//creating driver object
				WebDriver  driver = new ChromeDriver();
				driver.get("https://jqueryui.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//driver.manage().deleteCookieNamed("guru");
				//Drag and Drop
				Actions act= new Actions(driver);		
				//Click and Hold
				driver.findElement(By.xpath(prop.getProperty("droppable"))).click();
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
				WebElement drag= driver.findElement(By.xpath(prop.getProperty("dragabble")));
				//drag.sendKeys(arg0);
				act.clickAndHold(drag).dragAndDropBy(drag,200,20).build().perform();
				String text=driver.findElement(By.xpath(prop.getProperty("dropped"))).getText();
				//verification
				if(text.equals("Dropped!")){
					System.out.println("Element dropped Successfully");
				}else{
					System.out.println("Element not dropped Successfully");
				}	
				
				
				
				
	}

}
