package working_with_xpath.Internet_herokuapp_site_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.passay.dictionary.sort.BubbleSort;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		// Working with frames
		System.out.println("Working with Frames");
		/*
		 * driver.findElement(By.linkText("Frames")).click();
		 * driver.findElement(By.linkText("Nested Frames")).click();
		 * //driver.switchTo().frame("frameset-middle"); WebElement
		 * framElement=driver.findElement(By.xpath("//frame[@name='frame-left']"));
		 * driver.switchTo().frame("frame-left"); String frametext=
		 * framElement.getText(); System.out.println("Getting an Frameset name:- "+
		 * frametext);
		 */

		// Working with Geolocations
		/*
		 * driver.findElement(By.linkText("Geolocation"));
		 * driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
		 * String
		 * lattitude=driver.findElement(By.cssSelector("div[id='lat-value']")).getText()
		 * ; System.out.println("Lattitude details "+lattitude); String
		 * longitude=driver.findElement(By.cssSelector("div[id='long-value']")).getText(
		 * ); System.out.println("Longitude details "+longitude);
		 */

		// Working with Horizontal Slider
		System.out.println("Working with Horizontal Slider");
		driver.findElement(By.linkText("Horizontal Slider")).click();
		WebElement sliderElement = driver.findElement(By.xpath("//input[@onchange='showValue(this.value)']"));
		Actions action = new Actions(driver);
		action.clickAndHold(sliderElement);
		action.moveByOffset(40, 0).build().perform();
		driver.navigate().back();

		// Working with Hovers
		driver.findElement(By.linkText("Hovers")).click();
		WebElement imgElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]"));
		action.moveToElement(imgElement);
		System.out.println("Working with mouse hover completed");
		driver.navigate().back();

		// Working with Infinite Scroll
		driver.findElement(By.linkText("Infinite Scroll")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(350,0)", "");
		driver.navigate().back();
		System.out.println("Page scrolled sucessfully");

		// working with Inputs
		// we can perform this by passing values into the sendkeys method

		// Working with Jquery Menu - Need to check it once

		// Working with Javascript Alerts by driver.switchto().alert().accept();

		// Working with JavaScript onload event error

		// Working with Key Presses
		driver.findElement(By.linkText("Key Presses")).click();
		WebElement textElement = driver.findElement(By.cssSelector("*[id='target']"));
		textElement.sendKeys("Roshan Ghadge");
		String resuElement = driver.findElement(By.cssSelector("*[id='result']")).getText();
		String[] updatedString = resuElement.split(":");
		System.out.println("Updated String:- " + updatedString);
		driver.navigate().back();

		// Working with Large & Dip DOM

		// Working with Multiple Windows
		/*
		 * driver.findElement(By.linkText("Multiple Windows")).click(); int i=1;
		 * while(i<2){ driver.findElement(By.linkText("Click Here")).click(); i++; }
		 * 
		 * Set<String> windowhandles=driver.getWindowHandles(); Iterator<String> it=
		 * windowhandles.iterator(); while (it.hasNext()) { String id = (String)
		 * it.next(); System.out.println("Getting an each windowhandles: "+id); }
		 * driver.navigate().back();
		 */

		// Working with Nested Frames

		// Working with Notification message

		// Working with Redirect Link
		driver.findElement(By.linkText("Redirect Link")).click();
		WebElement linkedElement = driver.findElement(By.cssSelector("*[id='redirect']"));
		action.keyDown(Keys.CONTROL).click(linkedElement).keyUp(Keys.CONTROL).build().perform();
		System.out.println("Getting clicked into the new tab");

		driver.quit();
		System.out.println("End of program code execution");
	}
}
