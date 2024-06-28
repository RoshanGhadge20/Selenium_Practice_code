package Amazon_product_Purchase_Flow;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Elements_Utility {
	WebDriver driver;
	WebDriverWait wait;

	public Web_Elements_Utility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

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
	@FindBy(xpath = "//span[normalize-space()='10 Pro 5G (Dark Matter, 128 GB) (8 GB RAM)']")
	WebElement product;
	@FindBy(css = "#buy-now-button")
	WebElement buy_now_buttonElement;

	public void login_with_mobile() {
		login_FieldElement.sendKeys("8767003565");
		login_btnElement.click();
		pass_FieldElement.sendKeys("roshan2000");
		sign_btnElement.click();
	}

	public void Search_Product() throws InterruptedException {
		search_fieldElement.sendKeys("Realme 10 Pro");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		search_iconElement.click();
	}

	public void get_details() throws InterruptedException {
		try {
			WebElement productLink = wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//span[contains(text(),'realme 10 Pro 5G (Hyperspace, 128 GB) (6 GB RAM)')]")));
			productLink.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
	}

	public int count_number_of_links() {
		List<WebElement> count = driver.findElements(By.tagName("a"));
		int count_of_links = count.size();
		System.out.println(count_of_links);
		return count_of_links;
	}

	public void click_buy_now() {
		 try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        WebElement buyNowButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#buy-now-button")));
		        buyNowButton.click();
		        System.out.println("Clicked on the buy now button.");
		    } catch (NoSuchElementException e) {
		        System.out.println("Buy now button not found.");
		    }
	}
}
