package Selenium_Each_Module_Code_Practice;

import java.time.chrono.ThaiBuddhistEra;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll_up_and_scroll_down
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		//Performing scrolldown operations 
		JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,350)", "");
		System.out.println("Performed Scroll down operation");
		Thread.sleep(2000);
		
		
		jsExecutor.executeScript("window.scrollBy(0,-350)", "");
		System.out.println("performed scroll down operation");
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("End of Program code execution");
		
		
		
		
	}
}
