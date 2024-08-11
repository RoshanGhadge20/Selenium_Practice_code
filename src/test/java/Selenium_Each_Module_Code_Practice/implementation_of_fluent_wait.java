package Selenium_Each_Module_Code_Practice;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.FluentWait;

public class implementation_of_fluent_wait 
{
	/* Syntax
	 * Wait wait = new FluentWait(WebDriver reference) .withTimeout(timeout,
	 * SECONDS) .pollingEvery(timeout, SECONDS) .ignoring(Exception.class);
	 * 
	 * WebElement foo=wait.until(new Function<WebDriver, WebElement>() { public
	 * WebElement applyy(WebDriver driver) { return
	 * driver.findElement(By.id("foo")); } });
	 */
	
	WebDriver driver;
	//Declare and initialise a fluent wait
	FluentWait wait = (FluentWait) new FluentWait(driver)
	//Specify the timout of the wait
	.withTimeout(Duration.ofSeconds(5000))
	//Sepcify polling time
	.pollingEvery(Duration.ofSeconds(5))
	//Specify what exceptions to ignore
	.ignoring(NoSuchElementException.class)

	//This is how we specify the condition to wait on.
	//This is what we will explore more in this chapter
	.until(ExpectedConditions.alertIsPresent());
}
