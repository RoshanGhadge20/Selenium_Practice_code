package FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FindBy_Element 
{
	//Working with FindBy
	@FindBy(id = "name")
	WebElement namElement;
	@FindBy(id = "email")
	WebElement emailElement;
	WebDriver driver;
	
	//Working with Findbys->  When the required WebElement objects need to match all of the given criteria use @FindBys annotation
	/*
	 * @FindBys( {
	 * 
	 * @FindBy(className = "a"),
	 * 
	 * @FindBy(className = "b")
	 * 
	 * })
	 */
	
	
	// Working with Findall ->
	/*
	 * @FindAll : When required WebElement objects need to match at least one of the
	 * given criteria use @FindAll annotation
	 * 
	 * @FindAll({
	 * 
	 * @FindBy(className = “class1”)
	 * 
	 * @FindBy(className = “class2”) }) private List<WebElement>
	 * elementsWithEither_class1ORclass2 Here List elementsWithEither_class1ORclass2
	 * will contain all those WebElement that satisfies any one of the criteria.
	 * 
	 */
	

	public FindBy_Element(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
