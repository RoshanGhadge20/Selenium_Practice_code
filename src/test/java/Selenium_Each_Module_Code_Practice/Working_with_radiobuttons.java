package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Working with radio buttons in page 
		
		radio_buttons(driver);
		System.out.println("End of program execution");
		driver.close();
		
		
	}
	
	public static void radio_buttons(WebDriver driver)
	{
		driver.findElement(By.cssSelector("input#male")).click();
	}

}
