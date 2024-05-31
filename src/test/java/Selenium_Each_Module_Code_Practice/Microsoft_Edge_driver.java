package Selenium_Each_Module_Code_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Microsoft_Edge_driver {
	
	public static void main(String[] args) {
		/* Method 1
		 * System.setProperty("webdriver.edge.driver",
		 * "C://Users//Admin//Downloads//edgedriver_win64//msedgedriver.exe"); WebDriver
		 * driver=new EdgeDriver();
		 * 
		 * driver.get(
		 * "https://www.browserstack.com/guide/launch-edge-browser-in-selenium");
		 * driver.quit(); System.out.println("End of program code execution");
		 */
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.browserstack.com/guide/launch-edge-browser-in-selenium");
		driver.quit();
		System.out.println("End of program code execution");
	}

}
