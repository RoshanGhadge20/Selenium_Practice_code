package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload 
{
	public static void main(String[] args) 
	{
		/** File Upload using the .sendkeys() method */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();

			driver.get("https://xndev.com/display-image/");
			WebElement element=driver.findElement(By.cssSelector("input[type='file']"));
			element.sendKeys("C://Users//Admin//Downloads//social.png");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception caughts");
		}

		driver.quit();
		System.out.println("End of program code execution");
	}

}
