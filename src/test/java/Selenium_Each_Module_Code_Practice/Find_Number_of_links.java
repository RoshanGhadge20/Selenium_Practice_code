package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Number_of_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		driver.close();
		System.out.println("End of program execution");

	}

}
