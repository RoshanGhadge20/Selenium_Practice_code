package Selenium_Each_Module_Code_Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_Iframes {
	public static void main(String[] args) {
		/*
		 * What is Iframe:- 
		 * An iframe is also known as an inline frame. It is a tag used in HTML5 to
		 * embed an HTML document within a parent HTML document.
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		//To get total number of iframes present into the webpage
		int count_of_iframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Number of iFrames present into the webpage:- "+ count_of_iframes);
		
		//Working with Iframes by its methods to handle 
		//driver.switchTo().frame(1);
		//System.out.println("First Frame :- "+driver.findElement(By.xpath("//iframe[@class='cnx-apstag-loader']")).getText());
		
		//driver.switchTo().frame("google_ads_iframe_/24132379/guru99.com_300x250_2_0");
		//System.out.println("Second Frame :- "+driver.findElement(By.xpath("//iframe[@title='3rd party ad content']")).getText());
		
		//WebElement locator=driver.findElement(By.xpath("//iframe[@title='goog_1515208364']"));
		//driver.switchTo().frame(locator);
		//System.out.println("Third Frame :- "+driver.findElement(By.xpath("//iframe[@title='goog_1515208364']")).getText());
		
		
		//System.out.println("End of program execution");
		
		
		// Printing all the frames 
		List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		Iterator<WebElement> iterator=iframes.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().getText());
		}
		
		driver.quit();
		
	}
}
