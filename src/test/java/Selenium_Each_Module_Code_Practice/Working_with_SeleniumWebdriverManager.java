package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_SeleniumWebdriverManager 
{
	
	public static void main(String[] args)
{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String page_title=driver.getTitle();
		System.out.println(page_title);
		driver.close();
		System.out.println("End of program code");
	}

}
