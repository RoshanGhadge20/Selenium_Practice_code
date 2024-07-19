package FindBy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBy_practice 
{

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		
		//Here we are defining the behaviour of chromebrowser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Headless");
		
		//Creating object of webdriver
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		long start_time = System.currentTimeMillis();
		
		driver.get("https://testautomationpractice.blogspot.com/");

		FindBy_Element fndByelement = new FindBy_Element(driver);
		fndByelement.namElement.sendKeys("RG");
		fndByelement.emailElement.sendKeys("rg@gmail.com");

		driver.quit();
		
		long end_time = System.currentTimeMillis();
		
		System.out.println("End of program code");
		System.out.println("Program code execution completed into :- " + (end_time - start_time) + " miliseconds");
		long total_time = TimeUnit.MILLISECONDS.toMinutes(end_time - start_time);
		System.out.println("Execution time into minutes:- " + total_time);

	}

	private static void quit() {
		// TODO Auto-generated method stub

	}

}
