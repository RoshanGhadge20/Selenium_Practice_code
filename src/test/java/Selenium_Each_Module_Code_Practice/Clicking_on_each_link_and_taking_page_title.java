package Selenium_Each_Module_Code_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clicking_on_each_link_and_taking_page_title 
{
	public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--start-maximized");
			WebDriver driver=new ChromeDriver(opt);
			driver.get("https://testautomationpractice.blogspot.com/");
			
			//To get total number of links present in webpage
			int no_of_linkscount=driver.findElements(By.tagName("a")).size();
			System.out.println("Total No of links persent in webpage :- "+no_of_linkscount);
			
			//To get all the links present in webpage
			/*
			 * List<WebElement> links=driver.findElements(By.tagName("a")); for(WebElement
			 * link:links) { String click_on_link=Keys.chord(Keys.CONTROL, Keys.ENTER);
			 * link.sendKeys(clik_on_link); }
			 */
			
			for(int i=1;i<no_of_linkscount;i++)
			{
				String click_on_link=Keys.chord(Keys.CONTROL, Keys.ENTER);
				driver.findElements(By.tagName("a")).get(i).sendKeys(click_on_link);
				//String linkURL=link.getAttribute("href");
				
			}
			
			//To get the title of each page window
			driver.switchTo().defaultContent();
			Set<String> windows=driver.getWindowHandles();
			Iterator<String> it=windows.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println("Paget Title:- "+ driver.getTitle());
				
			}
			driver.quit();
			System.out.println("End of program Executions");
		}
}
