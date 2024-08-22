package Working_with_JavaScriptExecutor;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor.*;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class operations_perfomed_with_js 
{
	private static Object[] argument;

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		long startTime=System.currentTimeMillis();
		
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
		
		//JavaScript executor to scrollig by using pixel
		js.executeScript("window.scrollBy(0,100)");
		
		/*
		 * //scrolling page till element found WebElement
		 * flagElement=driver.findElement(By.xpath(""));
		 * js.executeScript(argument[0].ScrollIntoview(),"flag");
		 */
			
		long endTime=System.currentTimeMillis();	
		long toatalTime=endTime-startTime;
		long min=TimeUnit.MILLISECONDS.toMinutes(toatalTime);
		System.out.println("Total Time required for Test execution in mins:- "+ min);
		
		driver.quit();
		System.out.println("End of program execution");
	}

}
