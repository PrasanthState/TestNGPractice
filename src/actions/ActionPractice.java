package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:/Eclipse/LearningSelenium/drivers/chromedriver.exe");
			//creating driver object
			WebDriver  driver = new ChromeDriver();
			driver.get("https://jqueryui.com/");
			String text1=driver.getPageSource();
			System.out.println(text1);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().deleteCookieNamed("guru");
			//Move to Element
			WebElement contribute=driver.findElement(By.xpath("//a[text()='Contribute']"));
			WebElement documentation= driver.findElement(By.xpath("//a[text()='Documentation']"));
			Actions act= new Actions(driver);
			act.moveToElement(contribute).moveToElement(documentation).click().build().perform();
			//double Click
			driver.findElement(By.xpath("//a[text()='Commits & Pull Requests']")).click();
			//act.doubleClick());
			WebElement fork= driver.findElement(By.xpath("//a[.='Working With a Fork']"));
			act.contextClick(fork).build().perform();
			//Draggable
			driver.findElement(By.xpath("//a[text()='Draggable']")).click();	
			driver.findElement(By.id("IDS"));
			//Drag and Drop
		    WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		    act.dragAndDropBy(drag, 300,100).build().perform();
		    driver.switchTo().defaultContent();
			//Click and Hold
			driver.findElement(By.xpath("//a[text()='Droppable']")).click();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
			//WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
			//drag.sendKeys(arg0);
			act.clickAndHold(drag).dragAndDropBy(drag,200,20).build().perform();
			String text=driver.findElement(By.xpath("//*[text()='Dropped!']")).getText();
			drag.submit();
			driver.findElements(By.id("2"));
			act.keyDown(drag,Keys.ENTER);
			//verification
			if(text.equals("Dropped!")){
				System.out.println("Element dropped Successfully");
			}else{
				System.out.println("Element not dropped Successfully");
			}
			//act.clickAndHold().dragAndDrop(source, target)
	}	
	
}
