package Selenium_Each_Module_Code_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Complete_test_script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		Working_with_webelement.All_WebElement(driver);
		Working_with_radiobuttons.radio_buttons(driver);
		Working_with_checkboxes.click_checkbox(driver);
		Working_with_checkboxes.click_checkbox(driver);
		Working_with_dropdowns.drp_down(driver);
		Working_with_waits.Selecting_colors_code(driver);
		Working_with_calender.Selecting_date_from_Calender(driver,wait);
		
		Working_with_alerts.handling_alerts(driver);
		driver.close();
		System.out.println("End of Program Execution");
	}

}
