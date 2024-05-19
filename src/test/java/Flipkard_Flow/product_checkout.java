package Flipkard_Flow;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class product_checkout {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("moto g6 play");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		// Clicking on searched product
		driver.findElement(By.className("KzDlHZ")).click();
		// Thread.sleep(2000);

		// Working with multiple windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		while (iterator.hasNext()) {
			String win = iterator.next();
			System.out.println("Windows ids:- " + win);
		}

		// adding product to the card from its details page
		driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();

		// On cart page
		driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();

		driver.quit();
		System.out.println("End of program execution");
	}

}
