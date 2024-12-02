package Selenium_Each_Module_Code_Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Options {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Working with dynamic elements
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("javatpoint");

		// Wait for suggestions to load
		Thread.sleep(2000);

		List<WebElement> elements = driver.findElements(By.cssSelector("ul[role='listbox'] li"));

		// Navigating through the all elements & clicking if & only if javatpoint option
		// is available
		for (int i = 0; i < elements.size(); i++) {
			System.out.println("Options available: " + elements.get(i).getText());
			if (elements.get(i).getText().equalsIgnoreCase("javatpoint")) {
				elements.get(i).click();
				break;
			}
		}

		/*
		 * // Another way for(WebElement option:elements) {
		 * if(option.getText().equalsIgnoreCase("javatpoint")) { option.click(); } }
		 */

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of Program code execution");
	}
}
