package Selenium_Each_Module_Code_Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check_dropdown_options_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Check that dropdown options are sorted 
		WebElement element=driver.findElement(By.id("country"));
		Select se=new Select(element);
		List<String> originalList=new ArrayList<>();
		List<String> tempList=new ArrayList<>();
		
		List<WebElement> options=se.getOptions();
		for(WebElement e:options)
		{
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		
		Collections.sort(tempList);
		if(originalList==tempList)
		{
			System.out.println("Options are sorted in order");
		}
		else {
			System.out.println("Options are not sorted in order");
		}
		
		
		driver.close();
		System.out.println("End of program execution");
	}

}
