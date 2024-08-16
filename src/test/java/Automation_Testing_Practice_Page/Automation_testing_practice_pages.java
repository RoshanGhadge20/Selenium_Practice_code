package Automation_Testing_Practice_Page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Automation_testing_practice_pages 
{
	WebDriver driver;

	//Locating all the elements

	@FindBy(css = "input.form-control[id='name']")
	WebElement namefield;
	
	@FindBy(css = "input.form-control[id=email")
	WebElement emailfield;
	
	@FindBy(css = "input.form-control[id=phone")
	WebElement phonefield;
	
	@FindBy(css = "textarea.form-control[id='textarea']")
	WebElement addressfield;
	
	@FindBy(css = "input[id='male']")
	WebElement genderfield;
	
	@FindBy(css = "input[id=sunday]")
	WebElement dayfield;
	
	@FindBy(css="select[id='country']")
	WebElement drpdwnfield;
	
	@FindBy(css = "select.form-control[id='colors'] option")
	List<WebElement> colors;
	
	//List<WebElement> colors=driver.findElements(By.cssSelector("select.form-control[id='colors'] option"));
	
	@FindBy(css = "input#datepicker")
	WebElement datepicker;
	
	@FindBy(xpath = "//a[normalize-space()='16'][1]")
	WebElement today_date;
	
	@FindBy(css = "table[name='BookTable'] tbody tr th")
	List<WebElement> table_heding;
	
	@FindBy(css = "table[name='BookTable'] tbody tr td")
	List<WebElement> table_data;
	
	
	
	
	
	
	

Automation_testing_practice_pages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void fill_details() 
	{
		namefield.sendKeys("Roshan Ghadge");
		emailfield.sendKeys("rsg@gmail.com");
		phonefield.sendKeys("1234567891");
		addressfield.sendKeys("Nerul Navi Mumbai");
		genderfield.click();
		dayfield.click();
	}
	
	public void select_country() 
	{
		Select sc=new Select(drpdwnfield);
		List<WebElement> options=sc.getOptions();
		for(WebElement option:options)
		{
			if(option.getText().contains("India"))
			{
				option.click();
			}
		}
		
	}
	
	public void fetch_colors()
	{
		  Iterator<WebElement> it=colors.iterator();
		  while(it.hasNext())
		  {
			  System.out.println((it.next()).getText());
		  }
	}
	
	public void today_date_pick() throws InterruptedException
	{
		datepicker.click();
		Thread.sleep(2000);
		today_date.click();
	}
	
	public void table_heading()
	{
		Iterator<WebElement> th=table_heding.iterator();
		  while(th.hasNext())
		  {
			  System.out.print(((th.next()).getText())+" ");
		  }
		  System.out.println();
	}
	public void table_data()
	{
		Iterator<WebElement> td=table_data.iterator();
		while(td.hasNext())
		{
			System.out.print(((td.next()).getText())+" ");
			System.out.println("");
			
		}
		//System.out.println(" ");
	}


	
	
	
	
}
