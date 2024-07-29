import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class running_chrome_in_headless_mode {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("Headless");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://chatgpt.com/c/a92df418-b386-4903-8ee5-0ded0928bd0d");

		driver.quit();
		System.out.println("End of program code");
	}
}
