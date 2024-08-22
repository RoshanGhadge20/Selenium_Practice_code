package Automation_Testing_Practice_Page;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Automation_testing_practice_pages 
{
	WebDriver driver;
	
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

	@FindBy(css = "input#datepicker")
	WebElement datepicker;

	@FindBy(xpath = "//a[normalize-space()='16'][1]")
	WebElement today_date;

	@FindBy(css = "table[name='BookTable'] tbody tr th")
	List<WebElement> table_heding;

	@FindBy(css = "table[name='BookTable'] tbody tr td")
	List<WebElement> table_data;

	@FindBy(css = ".pagination[id='pagination'] li")
	List<WebElement> pagination_count;

	@FindBy(css = "table[id='productTable'] tbody tr")
	List<WebElement> page_data;

	@FindBy(css = "*[id='Wikipedia1_wikipedia-search-input']")
	WebElement search_tab_field;

	@FindBy(css = "*[id='Wikipedia1_wikipedia-search-results'] div")
	List<WebElement> search_result;

	@FindBy(xpath = "//button[normalize-space()='New Browser Window']")
	WebElement new_browser_button;
	
	@FindBy(xpath = "//button[normalize-space()='Alert']")
	WebElement alert_btn;
	
	@FindBy(xpath = "//button[normalize-space()='Confirm Box']")
	WebElement conf_alert_btn;
	
	@FindBy(xpath = "//button[normalize-space()='Prompt']")
	WebElement prompt_btn;
	
	@FindBy(xpath = "//button[normalize-space()='Copy Text']")
	WebElement double_click_btn;
	
	@FindBy(css = "input[id='field2']")
	WebElement verify_txt_field;
	
	@FindBy(css = "*[id='draggable']")
	WebElement draggable_field;
	
	@FindBy(css = "*[id='droppable']")
	WebElement droppable_field;
	
	@FindBy(css = ".ui-slider-handle")
	WebElement slider;
	
	@FindBy(css = ".ui-icon-gripsmall-diagonal-se")
	WebElement resizable;
	
	//All  WebElements inside frames
	
	@FindBy(css = "input[name='RESULT_TextField-0']")
	WebElement nameElement;
	
	@FindBy(css = "input[id='RESULT_RadioButton-1_0']")
	WebElement genderElement;
	
	@FindBy(css = "input[name='RESULT_TextField-2']")
	WebElement dobElement;
	
	@FindBy(css = "select[name='RESULT_RadioButton-3']")
	WebElement dropdownlement;
	
	@FindBy(css = "input[name='Submit']")
	WebElement submitElement;
	

	
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

	public void pagination_table()
	{
		for(int i=0;i<pagination_count.size();i++)
		{
			System.out.println("---- Printing page "+ i+1 + "data ----");
			Iterator<WebElement> pd=page_data.iterator();
			while (pd.hasNext()) 
			{
				System.out.println((pd.next()).getText());
			}
			pagination_count.get(i).click();
		}
	}

	public void search_field_tab() 
	{
		search_tab_field.sendKeys("demo");
		System.out.println("Printing all search results");

		Iterator<WebElement> sr= search_result.iterator();
		while (sr.hasNext()) 
		{
			System.out.println((sr.next()).getText());

		}

	}

	public void browser_window() 
	{
		String main_win=driver.getWindowHandle(); 
		new_browser_button.click();
		Set<String> win_hand=driver.getWindowHandles();
		System.out.println("Total Number of windows opened into browser are "+ win_hand.size());
		Iterator<String> wh=win_hand.iterator();
		while (wh.hasNext())
		{
			byte[]  win_title = (wh.next()).getBytes();
			System.out.println("Window :- "+ win_hand.toString());

		}
		driver.switchTo().window(main_win);
	}
	
	public void alert_window()
	{
		alert_btn.click();
		driver.switchTo().alert().accept();
		
		conf_alert_btn.click();
		String conf_alert_msg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("Confirmation alert msg" +conf_alert_msg);
		prompt_btn.click();
		String prompt_msg=driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Roshan Ghadge");
		driver.switchTo().alert().accept();
		System.out.println("Prompt alert msg" +prompt_msg);
		
	}
	
	public void working_with_frames() 
	{
		driver.switchTo().frame("frame-one796456169");
		nameElement.sendKeys("RG");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", genderElement);
		dobElement.sendKeys("20/11/2000");
		System.out.println("Printing all select dropdown options from frame");
		Select scobj=new Select(dropdownlement);
		List<WebElement> options=scobj.getOptions();
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
			if((opt.getText().equals("QA Engineer")))
			{
				opt.click();
			}
		}
		submitElement.click();
		
	}

}
