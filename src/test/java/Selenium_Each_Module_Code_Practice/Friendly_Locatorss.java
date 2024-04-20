package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Friendly_Locatorss {
	public static void main(String[] args)
	{
		
		// Practice set for the friendly locators 
		
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("Headless");
		WebDriver driver=new ChromeDriver(opt);
		
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
				
		// below Relative Locators
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]")).click();
		WebElement checkBox = driver.findElement(By.xpath("//span[contains(text(),'Check Box')]"));
        WebElement belowCheckBox = driver.findElement(RelativeLocator.with(By.tagName("span")).below(checkBox));
        String belowCheckBoxText = belowCheckBox.getText();
        System.out.println(belowCheckBoxText);

        //Above relative locators 
        WebElement abovecheckbox=driver.findElement(RelativeLocator.with(By.tagName("span")).above(checkBox));
		String abovetext=abovecheckbox.getText();
		System.out.println(abovetext);
		
		
		driver.close();
		System.out.println("End of program execution");
		
		
	}

}
