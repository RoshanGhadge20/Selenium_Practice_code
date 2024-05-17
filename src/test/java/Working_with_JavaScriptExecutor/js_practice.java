package Working_with_JavaScriptExecutor;

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
		js.executeScript("document.getElementById('name').value='Roshan Ghadge'");
		
		//Handling Authentication alert using javascriptExecutor
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Digest Authentication")).click();
		driver.switchTo().alert().authenticateUsing(new UserAndPassword("admin","admin"));
		
		
		
		driver.quit();
		System.out.println("End of program execution");
		
	}

}
