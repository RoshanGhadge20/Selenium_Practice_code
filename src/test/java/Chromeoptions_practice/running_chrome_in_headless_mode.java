package Chromeoptions_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Selenium_Each_Module_Code_Practice.Finding_all_bokenlinks_in_webpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class running_chrome_in_headless_mode
{
	public static void main(String[] args)
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("Headless");

		/*
		 * // Another way to run chromebrowser in headless mode
		 * options.addArguments("--start-maximized");
		 */
		
		/*
		 * To run url in incognito mode , it will open side which are insecure withot ssl 
		 * options.setAcceptInsecureCerts(true);
		 */
		
		/*
		 * To browser allow the insure website running on page 
		 * options.setInce
		*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://chatgpt.com/c/a92df418-b386-4903-8ee5-0ded0928bd0d");

		driver.quit();
		System.out.println("End of program code");
		}
	
}
