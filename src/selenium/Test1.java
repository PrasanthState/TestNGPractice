package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	//public static RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	 	//location of chrome driver
		System.setProperty("webdriver.chrome.driver",
			"C:/Eclipse/LearningSelenium/drivers/chromedriver.exe");
		//creating driver object
		WebDriver  driver = new ChromeDriver();
		// to launch an URL of any web applications
		//driver.get("https://www.facebook.com/r.php");
		driver.navigate().to("https://www.facebook.com/r.php");
		//driver.manage().window().maximize();
		//System.out.println(driver.getTitle());	
		String title = driver.getTitle();		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String text=driver.getPageSource();
		System.out.println(text);
		System.out.println(driver.getClass());
		/*
		System.out.println(title);
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		
		WebElement pageTitle=driver.findElement(By.xpath("//*[text()='Create a new account']"));
		String text=pageTitle.getText();
		System.out.println(text);
		*/
	
		/*driver.findElement(By.linkText("Cookies")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		*/
		/*driver.manage().timeouts().pageLoadTimeout(-1, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(-1, TimeUnit.SECONDS);*/
		
	//	driver.get("http://demo.guru99.com/test/delete_customer.php ");
		
		/*String primarywindow=driver.getWindowHandle();
		driver.findElement(By.linkText("Data Policy")).click();
		
		Set<String> secwin=driver.getWindowHandles();
		System.out.println(secwin.size());
		//int k=0;
		for(String hi : secwin){
			driver.switchTo().window(hi);
			System.out.println(driver.getTitle());
		}
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(primarywindow);
		System.out.println(driver.getTitle());
		//driver.findElement(By.tagName("//a"));
		
		*/
		
		
		//xpath = //tagname[@attributename='attributevalue']
		/*
		driver.findElement(By.name("firstname")).sendKeys("Naveetha");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Natarajan");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("naveetha94@gmail.com");
		
		WebElement element=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__' or @aria-label='Re-enter email address']"));
		element.sendKeys("Test");
		//Thread.sleep(3000);
		//String text = element.getText();
		System.out.println(element.getText());
		System.out.println(element.isEnabled());
		System.out.println(element.isDisplayed());
		System.out.println(element.getLocation());
		System.out.println(element.getAttribute("name"));
		WebElement day= driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByIndex(21);
		Thread.sleep(3000);
		sel.selectByIndex(5);
		Thread.sleep(5000);
		sel.selectByValue("0");
		Thread.sleep(5000);
		sel.selectByVisibleText("15");
		
		WebElement maleRadio=driver.findElement(By.xpath("//label[text()='Male']"));
		maleRadio.click();
		WebElement femRadio=driver.findElement(By.xpath("//input[@type='radio' and @value='1']//following-sibling::label[text()='Female']"));
		femRadio.click();
*/		
	}
}