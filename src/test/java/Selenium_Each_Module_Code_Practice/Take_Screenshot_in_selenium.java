package Selenium_Each_Module_Code_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Take_Screenshot_in_selenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Taking screenshot in selenium 
		File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des=new File("E://Selenium_Practice_Code_learning//Selenium_practice_code//Screenshots//demo.png");
		FileUtils.copyFile(f, des);
		
		driver.close();
		System.out.println("End of program Execution");
		
	}

}
