package actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class ActionTest {

	public static WebDriver driver;
	static int i=0;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
		"C:/Eclipse/LearningSelenium/drivers/chromedriver.exe");
		 //creating driver object
		 WebDriver  driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
		WebElement contribute= driver.findElement(By.xpath("//a[text()='Contribute']"));
		 WebElement documentation= driver.findElement(By.xpath("//a[text()='Documentation']"));
		 Actions action= new Actions(driver);
		 action.moveToElement(contribute).moveToElement(documentation).click().build().perform();*/
		ActionTest.TakeSnap(driver);
	    //FileUtils.copyFile(scr, dest);						
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		ActionTest.TakeSnap(driver);
		Actions action= new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		ActionTest.TakeSnap(driver);
		//driver.switchTo().frame(1);
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		ActionTest.TakeSnap(driver);
		action.dragAndDropBy(drag, 300, 100).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Resizable")).click();
		driver.quit();
	}
	
	public static void TakeSnap(WebDriver driver) throws IOException{
		i=i+1;
		String filename =  new SimpleDateFormat("yyyyMMddhh").format(new Date());
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:/testresult/"+filename+i+".png");
	}
}
