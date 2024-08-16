package FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindBy_Element 
{
	@FindBy(id = "name")
	WebElement namElement;
	@FindBy(id = "email")
	WebElement emailElement;
	WebDriver driver;

	public FindBy_Element(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
