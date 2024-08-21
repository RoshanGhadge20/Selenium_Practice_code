package Automation_Testing_Practice_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_of_each_section_of_page {
	public static void main(String[] args) throws InterruptedException {
		// Practice set to working with each section -
		// https://www.browserstack.com/guide/page-object-model-in-selenium

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		Automation_testing_practice_pages obj = new Automation_testing_practice_pages(driver);

		System.out.println("Title of the page :- " + driver.getTitle());

		// Working with form details with sendkeys method
		obj.fill_details();

		// Working with select dropdown
		obj.select_country();

		// working with colors
		obj.fetch_colors();

		// Working with calender
		obj.today_date_pick();

		// Working with navigate forward/backword
		WebElement orangeHRM = driver.findElement(By.xpath("//a[text()='orange HRM']"));
		orangeHRM.click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Working with webtables
		/*
		 * System.out.println("-------Printing WebTableTable Data-------");
		 * obj.table_heading(); obj.table_data();
		 */

		// Working with pagination concepts
		System.out.println("---- working with pagination table -----");
		obj.pagination_table();

		// Working with tabs
		System.out.println("--- Working with tabs ----");
		obj.search_field_tab();

		// Working with new browser windows
		System.out.println(" --- Working with new browser window ---");
		obj.browser_window();

		// Working with JS Windows
		System.out.println(" ---- Working with JS Windows ---- ");
		obj.alert_window();

		// Performing Double click
		System.out.println("---- Performing Double Click ---- ");
		act.doubleClick(obj.double_click_btn);
		// System.out.println("button text"+(obj.verify_txt_field).getText());


		// Performing drag & drop operation
		System.out.println("Performing Drag & Drop Operation");
		act.dragAndDrop(obj.draggable_field, obj.droppable_field).build().perform();

		//Working with Slider
		System.out.println("--- Working with JS Slider ---");
		act.dragAndDropBy(obj.slider, 50, 0);
		
		//Working with Frames
		/*
		 * WebElement frame_id=driver.findElement(By.id("frame-one796456169"));
		 * driver.switchTo().frame(frame_id);
		 */
		System.out.println("Working with frames");
		obj.working_with_frames();
		
		
		
			
		
		

		driver.quit();
		System.out.println("End of program code execution");

	}
}
