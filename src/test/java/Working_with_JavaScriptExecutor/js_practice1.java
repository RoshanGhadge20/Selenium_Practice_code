package Working_with_JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class js_practice1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		long startTime = System.currentTimeMillis();

		try 
		{
			driver.get("https://testautomationpractice.blogspot.com/");

			// Working with Javascript Executor
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Sending values into a field
			js.executeScript("document.getElementById('name').value='Roshan Ghadge';");

			// Performing click operation using Javascript Executor
			js.executeScript("document.getElementById('field2').click();");

			// Javascript executor to interact with checkboxes
			js.executeScript("document.getElementById('male').checked=false;");

			// Javascript executor to refresh the browser window
			js.executeScript("location.reload()");

			// Wait for page reload to complete
			Thread.sleep(3000);

			// Navigate to another URL
			driver.navigate().to("https://www.browserstack.com/guide/javascriptexecutor-in-selenium");

			// Wait for page to load
			Thread.sleep(3000);

			// Javascript executor to scroll down the page asynchronously
			js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			long min=TimeUnit.MILLISECONDS.toMinutes(totalTime);
			System.out.println("Total Time required for Test execution in min:- " + min);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		
		finally
		{
			driver.quit();
			System.out.println("End of program execution");
		}
	}
}
