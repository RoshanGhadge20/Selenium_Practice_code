package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Alerts  
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		// Working with windows alerts
		WebElement searchElement = driver.findElement(By.cssSelector("input[name=cusid]"));
		WebElement submit_btn = driver.findElement(By.cssSelector("input[name=submit]"));
		WebElement reset_btn = driver.findElement(By.cssSelector("input[name=res]"));
		
		searchElement.sendKeys("Roshan");
		submit_btn.click();
		
		//Handling windows alerts 
		Alert  alert=driver.switchTo().alert();
		alert.accept(); // To accept the alert with msg box => 'OK'
		
		/*
		 *alert.dismiss() // To dismiss the alert box with => 'Cancel' 
		 *alert.sendkeys() // To send the any text/value within the alert box 	
		 * 
		 */ 
		
		Thread.sleep(2000);
		
		/*
		 * searchElement.sendKeys("Roshan"); submit_btn.click(); alert.dismiss();
		 */
		
		driver.quit();
		System.out.println("End of program code ");
	}
}
