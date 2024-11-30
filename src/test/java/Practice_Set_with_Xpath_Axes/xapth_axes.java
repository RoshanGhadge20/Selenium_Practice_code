package Practice_Set_with_Xpath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.protocol.a.NativeConstants.StringSelfDataType;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.SelfCallHandle;

public class xapth_axes 
{
	public static void main(String[] args) 
	
	{
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
			
		//Working with Xath Axes 
		
		//1. Self Node 
		WebElement self_node = driver.findElement(By.className("userform"));
		
		
		/* 2 Parent Node 
		Syntaxt = //xpath_of_current_node/parent::tagname 
		*/
		driver.findElement(By.xpath("//div[@class='userform']/parent::div"));
		
	
		/* 3 Child Node 
		Syntaxt = //xpath_of_current_node/child::tagname 
		*/
		driver.findElement(By.xpath("//div[@class='userform']/child::input[2]"));
		
		
		
		
		
		
		driver.quit();
		
	}
}
