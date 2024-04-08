package Working_with_ChromeDevTools_Protocols;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class ConsoleLogsCapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		//listeners - OnTestFailure
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.partialLinkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.id("exampleInputEmail1")).clear();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
		
		LogEntries entry= driver.manage().logs().get(LogType.BROWSER); //Get LogEntries object
		 List<LogEntry>logs = entry.getAll();  //LogEntryobject- getAll method return all logs in list
		 
		 for(LogEntry e : logs)//iterating through list and printing each log message
		 {
			 System.out.println(e.getMessage());  //Log4j
			
		 }
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
