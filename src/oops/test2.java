package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	
	public test2(){
		System.out.println("This is constructors");
	}
	
	public static void main(String[] args) {
		test2 by=new test2();
		by.overridemethod();
	}
	public void overridemethod(){
		System.out.println("This is parent");
	}
}
