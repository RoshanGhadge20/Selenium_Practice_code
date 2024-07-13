package Selenium_Each_Module_Code_Practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_waits {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Working with implicit waits
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//implicit wait is defines through the driver.manage().timeouts() => method 
		
		//Working with colors
		Selecting_colors_code(driver);
		
		//Working with Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		// Explicit wait is always defines through the webdriverwait 
		
		
		
		
		driver.close();
		System.out.println("End of program execution");
	}

	public static void Selecting_colors_code(WebDriver driver) {
		WebElement color_code=driver.findElement(By.cssSelector("Select#colors"));
		Select sc=new Select(color_code);
		List<WebElement> options=sc.getOptions();
		for (WebElement opt:options)
		{
			String color=opt.getText();
			System.out.println(color);
			if(color.equalsIgnoreCase("Red"))
			{
				opt.click();
				System.out.println("Red color is selected");
				break;
			}
		}
	}

}
