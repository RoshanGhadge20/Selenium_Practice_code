package Working_with_JavaScriptExecutor;

import java.awt.Window;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor.*;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class js_practice {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Working with Javascript Executor 
		
		
		//Sending an values into the any field 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('name').value='Roshan Ghadge';");
		
		//Handling Authentication alert using javascriptExecutor
		/*
		 * driver.navigate().to("https://the-internet.herokuapp.com/");
		 * driver.findElement(By.linkText("Digest Authentication")).click();
		 * driver.switchTo().alert().authenticateUsing(new	
		 * UserAndPassword("admin","admin"));
		 */
		
		//Performing cilck operation by using javascript executor
		js.executeScript("document.getElementById('field2').click();");
		
		//Javascript executor to interact with the checkboxes
		js.executeScript("document.getElementById('male').checked=false;");
		
		//Javascript executor to refresh the browser window
		js.executeScript("location.reload()");
		
		//JavaScript executor to scrolldown the asynscript
		driver.navigate().to("https://www.browserstack.com/guide/javascriptexecutor-in-selenium");
		js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		driver.quit();
		System.out.println("End of program execution");
		
	}

}
