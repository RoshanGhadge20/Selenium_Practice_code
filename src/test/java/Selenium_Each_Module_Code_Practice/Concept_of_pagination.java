package Selenium_Each_Module_Code_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Concept_of_pagination {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// Working with concepts of paginations

		System.out.println("Paginations Concepts");

		List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']/li"));
		for (WebElement page : pages) {
			List<WebElement> tablecontent = driver
					.findElements(By.cssSelector("div[class='table-container'] tbody tr"));
			for (WebElement tablerow : tablecontent) {
				System.out.println(tablerow.getText());
			}
			System.out.println("----------");
		}

		driver.quit();
		System.out.println("End of program code");
	}
}
