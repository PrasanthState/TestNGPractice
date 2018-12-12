package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse/LearningSelenium/drivers/chromedriver.exe");
			//creating driver object
			WebDriver  driver = new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			Set<Cookie> cooky = driver.manage().getCookies();
			
			for(Cookie cook:cooky){
				System.out.println(cook);
			}
			Options opt=driver.manage();
			opt.deleteAllCookies();
			
			System.out.println(opt.getCookies());
			
			
			
			/*driver.findElement(By.name("submit")).click();
			Alert alert =driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.dismiss();
			System.out.println(alert.getText());
			alert.accept();
			//alert.dismiss();
			
			Actions act =new  Actions(driver);
			act.clickAndHold();
			act.release(target);*/
		}

	
	}
