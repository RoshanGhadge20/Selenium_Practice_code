package Selenium_Each_Module_Code_Practice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_calender {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Explicit wait

		// Working with Calender Method 1 by using sendkeys method
		// driver.findElement(By.cssSelector("input#datepicker")).sendKeys("03/25/2024");

		// Working with Calender Method 2 by using webelements method
		// Selecting_date_from_Calender(driver, wait);

		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath("//button[@data-testid='uitk-date-selector-input1-default']")).click();
		driver.findElement(By.xpath("//div[@aria-lable='Monday, June 3, 2024, Selected start date']")).click();
		driver.findElement(By.xpath("//button[@data-stid='apply-date-selector']"));

		driver.close();
		System.out.println("End of Program Code");

	}

	public static void Selecting_date_from_Calender(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		driver.findElement(By.cssSelector("input#datepicker")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.ui-datepicker-header"))));
		driver.findElement(By.xpath("//a[normalize-space()='25']")).click();
		Thread.sleep(2000);
		String date = driver.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value");
		System.out.println("Selected Date:- " + date);
	}

}
