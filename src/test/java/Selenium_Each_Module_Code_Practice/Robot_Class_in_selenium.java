package Selenium_Each_Module_Code_Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot_Class_in_selenium {
	public static void main(String[] args) throws AWTException {		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Robot rbRobot=new Robot();
		rbRobot.keyPress(KeyEvent.VK_KP_UP);
		rbRobot.keyPress(KeyEvent.VK_DOWN);
		rbRobot.mousePress(InputEvent.BUTTON1_MASK);
		
		driver.quit();
		System.out.println("End of program execution");
	}

}
