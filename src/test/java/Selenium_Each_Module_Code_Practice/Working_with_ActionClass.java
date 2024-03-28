package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Working with Action class
		Actions act=new Actions(driver);
		double_click(driver, act);
		
		
		driver.close();
		System.out.println("End of Program Execution");
		}

	public static void double_click(WebDriver driver, Actions act) throws InterruptedException {
		WebElement button=driver.findElement(By.cssSelector("button[ondblclick='myFunction1()']"));
		act.doubleClick(button).build().perform();
		Thread.sleep(2000);
		String val_msg=driver.findElement(By.cssSelector("input#field2")).getAttribute("value");
		System.out.println(val_msg);
		Assert.assertEquals("Hello World!", val_msg );
	}
}
