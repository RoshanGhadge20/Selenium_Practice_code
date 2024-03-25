package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Working with WebElements
		All_WebElement(driver);
		System.out.println("End of Program Execution");
		driver.close();
	}

	public static void All_WebElement(WebDriver driver) {
		driver.findElement(By.id("name")).sendKeys("Rohsan Ghadge");
		driver.findElement(By.cssSelector("input#email")).sendKeys("dummyemail@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("textarea#textarea")).sendKeys("Address is getting entered into the textarea");
	}

}
