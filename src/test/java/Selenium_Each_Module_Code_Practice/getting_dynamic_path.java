package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class getting_dynamic_path 
{
	public static void main(String[] args) 
	{
		/*
		 * WebDriverManager.chromedriver().setup();
		 *  WebDriver driver=new ChromeDriver();
		 */
		String path=System.getProperty("user.dir");
		System.out.println("Path :- "+ path);
		
		//String path1=path+"/filename.extension";
		
		//driver.quit();
		System.out.println("End of program code execution");
	}
}
