package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowsPopUp {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		//WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse/LearningSelenium/drivers/chromedriver.exe");
				//creating driver object
				WebDriver  driver = new ChromeDriver();
				driver.get("https://blueimp.github.io/jQuery-File-Upload/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//wait= new WebDriverWait(driver,30);
				WebElement addfile=driver.findElement(By.xpath("//span[contains(@class,'fileinput-button')]/span[.='Add files...']/following-sibling::input[@name='files[]']"));
			//	addfile.click();
				
				Runtime.getRuntime().exec("C:/Users/prashan/Desktop/FileUpload.exe");
				
/*				Actions act= new Actions(driver);
				act.moveToElement(addfile).click().build().perform();
				Thread.sleep(4000);
*/				//addfile.click();
				//wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
				/*StringSelection stringSelection = new StringSelection("C:/Users/prashan/Desktop/SeleniumCertificationMarks.PNG");
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		        clipboard.setContents(stringSelection, null);	        
		        Robot robot = new Robot();
		        robot.delay(250);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.delay(150);
		        robot.keyRelease(KeyEvent.VK_ENTER);
*/	}

}
