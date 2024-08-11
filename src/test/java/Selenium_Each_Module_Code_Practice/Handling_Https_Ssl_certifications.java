package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Https_Ssl_certifications
{
	public static void main(String[] args) 
	{
		/*
		 * Working with the HTTPs & SSL in chrome or any other browser if any site is
		 * not secure then also we can access that website through the selenium in our
		 * browser window
		 */
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");
		options.addArguments("Headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*
		 * Setting up proxy into your browser 
		 * ChromeOptions opt=new ChromeOptions();
		 * Proxy proxy=new Proxy(); 
		 * proxy.setHttpProxy("IpAddress:Codename");
		 * opt.setCapability("proxy", "proxy");
		 */
		
		driver.quit();
		System.out.println("End of program Execution");
	}

}
