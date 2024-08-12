package working_with_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_xpath 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Working with basic of xpaths
		driver.findElement(By.id("name")).sendKeys("Roshan Ghadge");
		// driver.findElement(By.className("")).sendKeys("");
		// driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.partialLinkText("New Browser")).click();
		driver.findElement(By.linkText("New Browser Window")).click();
		driver.findElement(By.tagName("input")).click();
		

		// Working with types xpaths -> Absolute
		/*
		 * 1. Absolute xpath 
		 * 2. Relative xpath
		 * 
		 * driver.findElement(By.xpath("//tagname[@attribute='value']));
		 * driver.findElement(By.xpath("Abosulte xpath")
		 *
		 */
		
		driver.close();
		System.out.println("End of program code");
	}

}
