package Selenium_Each_Module_Code_Practice;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taking_partial_Screenshots
{
	public static void main(String[] args) throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        // Taking partial Screenshot with TakeScreenshot method
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        firstName.sendKeys("Roshan Ghadge");

        // Taking partial screenshot of the first name field
        File screenshot = firstName.getScreenshotAs(OutputType.FILE);

        // Define the destination file path
        File destinationFile = new File("E:\\Selenium_Practice_Code_learning\\Selenium_practice_code\\Screenshotspick.png");

        // Copy the screenshot to the destination file
        FileUtils.copyFile(screenshot, destinationFile);

        driver.close();
        System.out.println("End of program code");
	}
}
