package Log4j_Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Example_Log4j {
	private static final Logger logg = LogManager.getLogger(Basic_Example_Log4j.class);

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		logg.info("Webdriver initiated");

		driver.quit();
		logg.info("Driver object closes all the browser windows/tabs");

		// System.out.println("End of program execution");

	}
}
