package Handling_Windows_Based_Authentication_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handing_window_based_authentications {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		//Working with windows based authentication pop-ups
		driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();
		Thread.sleep(2000);
		
		/**
		 * Way to write a username & password into the URL itself
		 * 
		 * https://username:password@baseURL
		 * 
		 */
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		driver.close();
		System.out.println("End of Program Execution");
	}

}
