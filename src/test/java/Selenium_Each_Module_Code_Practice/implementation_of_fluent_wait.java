package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.FluentWait;

public class implementation_of_fluent_wait 
{
	// Syntax 
	/*
	 * Wait wait = new FluentWait(WebDriver reference) .withTimeout(timeout,
	 * SECONDS) .pollingEvery(timeout, SECONDS) .ignoring(Exception.class);
	 * 
	 * WebElement foo=wait.until(new Function<WebDriver, WebElement>() { public
	 * WebElement applyy(WebDriver driver) { return
	 * driver.findElement(By.id("foo")); } });
	 */
	WebDriver driver;
	//Declare and initialise a fluent wait
	FluentWait wait = new FluentWait(driver);
	//Specify the timout of the wait
	wait.withTimeout(5000, TimeUnit.MILLISECONDS);
	//Sepcify polling time
	wait.pollingEvery(250, TimeUnit.MILLISECONDS);
	//Specify what exceptions to ignore
	wait.ignoring(NoSuchElementException.class)

	//This is how we specify the condition to wait on.
	//This is what we will explore more in this chapter
	wait.until(ExpectedConditions.alertIsPresent());
}
