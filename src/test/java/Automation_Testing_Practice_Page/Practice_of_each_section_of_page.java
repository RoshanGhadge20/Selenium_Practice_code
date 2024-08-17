package Automation_Testing_Practice_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_of_each_section_of_page 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Practice set to working with each section - https://www.browserstack.com/guide/page-object-model-in-selenium

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		Automation_testing_practice_pages obj=new Automation_testing_practice_pages(driver);

		System.out.println("Title of the page :- "+driver.getTitle());

		//Working with form details with sendkeys method
		obj.fill_details();

		// Working with select dropdown
		obj.select_country();

		//working with colors
		obj.fetch_colors();

		//Working with calender 
		obj.today_date_pick();

		//Working with navigate forward/backword
		WebElement orangeHRM=driver.findElement(By.xpath("//a[text()='orange HRM']"));
		orangeHRM.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Working with webtables 
		/*
		 * System.out.println("-------Printing WebTableTable Data-------");
		 * obj.table_heading(); 
		 * obj.table_data();
		 */
		
		// Working with pagination concepts 
		System.out.println("---- working with pagination table -----");
		obj.pagination_table();
		





		driver.quit();
		System.out.println("End of program code execution");



	}
}


