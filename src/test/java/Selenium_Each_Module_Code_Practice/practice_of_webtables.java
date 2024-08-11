package Selenium_Each_Module_Code_Practice;

import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice_of_webtables {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//Working with webtables 
	int row_count=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
	System.out.println("Total Number of rows into the table are :- "+ row_count);
	
	int col_count=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
	System.out.println("Total Number of col into the table are :-"+col_count);
	
	/*
	 * //Printing all the records form table for ( int i=1;i<=row_count;i++) {
	 * for(int j=1;j<=col_count;j++) { System.out.print(driver.findElement(By.xpath(
	 * "//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText()); }
	 * System.out.println(" "); }
	 * 
	 */
	
	 for (int j = 1; j <= col_count; j++) 
	 {
         System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th[" + j + "]")).getText() + "\t");
         System.out.print("\t");
     }
     System.out.println();
     
     // Print the data rows
     for (int i = 2; i <= row_count; i++) 
     {
         for (int j = 1; j <= col_count; j++) 
         {
             System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText() + "\t");
             System.out.print("\t");
         }
         
         System.out.println();
     }
     
	
	driver.quit();
	System.out.println("End of Program code execution");
}
}
