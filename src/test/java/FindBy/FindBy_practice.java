package FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBy_practice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		FindBy_Element fndByelement=new FindBy_Element(driver);
		fndByelement.namElement.sendKeys("RG");
		fndByelement.emailElement.sendKeys("rg@gmail.com");
		

		

		driver.quit();
		System.out.println("End of program code");

	}

	private static void quit() {
		// TODO Auto-generated method stub
		
	}

}
