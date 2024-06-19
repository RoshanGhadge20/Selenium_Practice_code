package Selenium_Each_Module_Code_Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class File_download 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("");

		//Before downloading any file we need to check that if that same file already exitst in directory 
		File f=new File("Path of file");
		if(f.exists())
		{
			System.out.println("File is already exists");
		}
		else 
		{
			f.delete();
			System.out.println("File is deleted");

		}


		//Go to specific URL & click on download button 
		WebElement element=driver.findElement(By.className("--"));
		element.click();



	}

}
