package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_webdriver {
	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver",
				"E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
