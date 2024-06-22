package Amazon_product_Purchase_Flow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Web_Elements_Utility 
{
	WebDriver driver;
	/**
	 * Syntax to write down the webelement using findby
	 * 
	 * @FindBy(xpath="") WebElement element_name;
	 * @FindBy(how=How.css, using="") WebElement element_name;
	 */
	
	//Created a constructor for pagefactory all element initialization
	public Web_Elements_Utility(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//Keeping all the Web_Element store into this file 
	
	@FindBy(css = "input#ap_email") WebElement login_FieldElement;
	@FindBy(css = "input.a-button-input") WebElement login_btnElement;
	@FindBy(css = "input[name='password']") WebElement pass_FieldElement;
	@FindBy(css = "input[type='submit']") WebElement sign_btnElement;
	
	public void login_with_mobile() 
	{
		login_FieldElement.sendKeys("8767003565");
		login_btnElement.click();
		pass_FieldElement.sendKeys("roshan2000");
		sign_btnElement.click();
	}
	
	
}
