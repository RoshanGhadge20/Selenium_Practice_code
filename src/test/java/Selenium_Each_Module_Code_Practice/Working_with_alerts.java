package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_alerts
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		handling_alerts(driver);
		
		driver.quit();
		System.out.println("End of program execution");
		
	}

	public static void handling_alerts(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Alert window is getting handled properly");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		String msg=driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println("Message appears in prompt window"+msg);
		driver.switchTo().alert().sendKeys("Roshan Ghadge");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.cssSelector("p#demo")).getText());
	}
}
