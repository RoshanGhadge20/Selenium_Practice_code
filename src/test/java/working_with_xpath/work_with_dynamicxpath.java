package working_with_xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class work_with_dynamicxpath {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Working with Dynamic xpaths
		/*
		 * 1. working with or operator driver.findElement(By.
		 * xpath("//tagname[@attribute='value' or @attribute='value']"));
		 * driver.findElement(By.
		 * xpath("//tagname[@attribute='value' and @attribute='value']"));
		 * 
		 * 2. Contains method
		 * driver.findElement(By.xpath("//tagname[contains(@id,'value')]"));
		 * driver.findElement(By.xpath("//tagname[contains(text(),'--text needs to be 
		 * search')]");
		 * 
		 * 3. Relative Xpath
		 * driver.findElement(By.xpath("//tagname[@attribute='value']"));
		 * 
		 * 4. Text method driver.findElement(By.xpath("//tagname[text()='value']"));
		 * 
		 * 5. Start-with
		 * driver.findElement(By.xpath("//tagname(start-with(@id,'value'))"));
		 * 
		 * 6. Chained xpath driver.findElement(By.
		 * xpath("//tagname[@attribute='Value' //tagname[@attribute='value']"))
		 * 
		 * 7. With OR & AND Operator 
		 * driver.findElement (by.xpath("//tagname[@att='value' OR @att='value']);
		 * driver.findElement (By.xpath("//tagname[@att='value' AND @att='value']);
		 */
	}

}
