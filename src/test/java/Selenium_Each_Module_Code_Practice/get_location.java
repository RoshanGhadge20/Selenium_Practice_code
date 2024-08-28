package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v122.debugger.model.Location;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_location {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//ChromeOptions to set chromepreferences 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();


		// Get height and weight of the webelement
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement namefield = driver.findElement(By.xpath("//input[@id='name']"));

		Point point=namefield.getLocation();
		int x=   point.getX();
		int y=   point.getY();
		System.out.println("location pointers :- "+ x + y);
		
		driver.quit();
		System.out.println("End of program code execution");
	}

}
