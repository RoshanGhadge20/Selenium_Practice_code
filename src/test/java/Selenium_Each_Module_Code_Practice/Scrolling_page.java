package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_page
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		
		// Horizontally scrolling the page content
		/*
		 * This will scroll the page Horizontally till the element is found
		 * js.executeScript("arguments[0].scrollIntoView();", Element);
		 */	
		
		driver.quit();
		System.out.println("End of program Execution");


	}

}
