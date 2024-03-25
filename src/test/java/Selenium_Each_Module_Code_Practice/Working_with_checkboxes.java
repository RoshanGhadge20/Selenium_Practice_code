package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.close();
		System.out.println("End of Program Execution");
		
	}
	
	public static void click_checkbox(WebDriver driver)
	{
		driver.findElement(By.xpath("//label[text()='Sunday']")).click();
		driver.findElement(By.xpath("//label[text()='Monday']")).click();
		
	}
	

}
