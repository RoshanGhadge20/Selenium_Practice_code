package Amazon_product_Purchase_Flow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Elements_Utility {
	WebDriver driver;

	/**
	 * Syntax to write down the webelement using findby
	 * 
	 * @FindBy(xpath="") WebElement element_name;
	 * @FindBy(how=How.css, using="") WebElement element_name;
	 */

	// Created a constructor for pagefactory all element initialization
	public Web_Elements_Utility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Keeping all the Web_Element store into this file

	@FindBy(css = "input#ap_email")
	WebElement login_FieldElement;
	@FindBy(css = "input.a-button-input")
	WebElement login_btnElement;
	@FindBy(css = "input[name='password']")
	WebElement pass_FieldElement;
	@FindBy(css = "input[type='submit']")
	WebElement sign_btnElement;
	@FindBy(css = "input#twotabsearchtextbox")
	WebElement search_fieldElement;
	@FindBy(css = "input#nav-search-submit-button")
	WebElement search_iconElement;
	@FindBy(css = "div[data-cy='title-recipe']")
	WebElement list_ofproductsElement;
	@FindBy(css = "div.s-suggestion-container")
	WebElement suggestion_Element;

	public void login_with_mobile() {
		login_FieldElement.sendKeys("8767003565");
		login_btnElement.click();
		pass_FieldElement.sendKeys("roshan2000");
		sign_btnElement.click();
	}

	public void Search_Product() throws InterruptedException {
		search_fieldElement.sendKeys("Realme 10 Pro");
		// Thread.sleep(5000);

		/*
		 * getting an StaleElementReferenceException over here while executing the code
		 * Sol:- 1 ( Thread.sleep(3000)) Sol:- 2 ( implement webdriver wait over here (
		 * explicit)
		 */
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = w
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.s-suggestion-container")));
		List<WebElement> sugg_prod = driver.findElements(By.cssSelector("div.s-suggestion-container"));
		for (WebElement element : sugg_prod) {
			System.out.println("List of suggested products are:- " + element.getText());
		}
		search_iconElement.click();
	}

}
