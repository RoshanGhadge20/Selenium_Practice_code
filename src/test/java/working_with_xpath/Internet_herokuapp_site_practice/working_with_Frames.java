package working_with_xpath.Internet_herokuapp_site_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		//Working with frames
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
		
		
		//Working with Geolocations
		driver.findElement(By.linkText("Geolocation"));
		driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
		String lattitude=driver.findElement(By.cssSelector("div[id='lat-value']")).getText();
		System.out.println("Lattitude details "+lattitude);
		String longitude=driver.findElement(By.cssSelector("div[id='long-value']")).getText();
		System.out.println("Longitude details "+longitude);
		
		
		
		
		driver.close();
		System.out.println("End of program code execution");
	}
}
