package Selenium_Each_Module_Code_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver",
				"E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		drp_down(driver);
		driver.close();
		System.out.println("End of Program Execution");

	}

	public static void drp_down(WebDriver driver) {
		WebElement drp_dw=driver.findElement(By.cssSelector("select#country"));
		Select sc=new Select(drp_dw);
		List<WebElement> options=sc.getOptions();
		for (WebElement opt:options)
		{
			String txt=opt.getText();
			System.out.println(txt);
			if(txt.equalsIgnoreCase("India"))
			{
				opt.click();
				//System.out.println("India is getting selected");
			}
		}
		
	}
	
	

}
