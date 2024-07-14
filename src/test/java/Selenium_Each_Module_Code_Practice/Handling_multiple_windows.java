package Selenium_Each_Module_Code_Practice;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_multiple_windows 
{
	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Working the multiple of windows/tabs
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentwin = it.next();
		String childwin = it.next();
		System.out.println("Parent window title:- " + parentwin);
		System.out.println("Parent window title:- " + childwin);
		driver.switchTo().window(parentwin);
		driver.switchTo().window(childwin);
		driver.quit();
		System.out.println("End of program Execution");
	}

}
