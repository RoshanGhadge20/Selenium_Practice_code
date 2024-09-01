package working_with_xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_css 
{
	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		/*
		 * Working with css selectors - Customized CSS Locators 
		 * 1. Tag and id
		 * driver.findElement(By.cssSelector("*#name")).click();
		 * 
		 * 2.Tag and Class 
		 * 	driver.findElement(By.cssSelector("*.form-control")).click();
		 *
		 * 3. Tag and Attribute
		 * 	driver.findElement(By.cssSelector("tagname[attribute='value']"));
		 * 
		 * 4 Tag and Class attribute
		 * 	driver.findElement(By.cssSelector("tagname.classname[attribute='value']"));
		 */

		driver.quit();
		System.out.println("End of program code");
	}
}
