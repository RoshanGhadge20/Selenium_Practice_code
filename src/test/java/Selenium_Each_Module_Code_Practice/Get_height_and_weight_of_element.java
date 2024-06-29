package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_height_and_weight_of_element {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Get height and weight of the webelement
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement namefield=driver.findElement(By.xpath("//input[@id='name']"));
		System.out.println(namefield.getRect().getDimension().getHeight());
		System.out.println(namefield.getRect().getDimension().getWidth());
		System.out.println(namefield.getRect().getHeight());
		System.out.println(namefield.getRect().getWidth());
		
		driver.close();
		System.out.println("End of program code");

	}

}