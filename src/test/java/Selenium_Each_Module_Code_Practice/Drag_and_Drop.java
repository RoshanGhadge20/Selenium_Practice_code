package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act = new Actions(driver);
		drap_and_dropped(driver, act);
		driver.quit();
		System.out.println("End of program Execution");
	}

	public static void drap_and_dropped(WebDriver driver, Actions act) {
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		act.dragAndDrop(drag, drop).build().perform();
		String state = driver.findElement(By.cssSelector("div.ui-state-highlight")).getText();
		System.out.println(state);
	}

}
