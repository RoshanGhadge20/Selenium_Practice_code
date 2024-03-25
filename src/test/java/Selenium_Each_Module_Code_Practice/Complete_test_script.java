package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Complete_test_script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Working_with_webelement.All_WebElement(driver);
		Working_with_radiobuttons.radio_buttons(driver);
		Working_with_checkboxes.click_checkbox(driver);
		Working_with_checkboxes.click_checkbox(driver);
		Working_with_dropdowns.drp_down(driver);
		driver.close();
		System.out.println("End of Program Execution");
	}

}
