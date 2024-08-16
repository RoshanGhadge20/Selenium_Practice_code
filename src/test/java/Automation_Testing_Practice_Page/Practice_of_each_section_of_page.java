package Automation_Testing_Practice_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_of_each_section_of_page 
{
	public static void main(String[] args) 
	{
		// Practice set to working with each section - https://www.browserstack.com/guide/page-object-model-in-selenium

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		Automation_testing_practice_pages obj=new Automation_testing_practice_pages(driver);
		
		System.out.println("Title of the page :- "+driver.getTitle());
		
		obj.fill_details();

		


		driver.quit();
		System.out.println("End of program code execution");



	}
}


