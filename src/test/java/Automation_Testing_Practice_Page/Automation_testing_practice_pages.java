package Automation_Testing_Practice_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
}
