package working_with_cookies;

import java.util.Set;

/*import org.openqa.selenium.Cookie*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class demo_cookies {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// working with cookies
		
		int count = driver.manage().getCookies().size();
		System.out.println("Total Number of cookies are:- " + count);

		/*
		 * // Cookie cookie = new Cookie("RG", 2011); driver.manage().addCookie(new
		 * Cookie("RG", "2011"));
		 */

		// getting list of cookies file name
		Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
		for (org.openqa.selenium.Cookie cobjCookie : cookies) {
			System.out.println("Cookies information:- " + cobjCookie.getName());
		}

		/*
		 * //to get any specified of cookie with its session id
		 * System.out.println("Getting an cookie with specific of session id"+
		 * driver.manage().getCookieNamed("-"));
		 */

		// deleting all cookies
		driver.manage().deleteAllCookies();
		System.out.println("All cookies are deleted ");

		driver.quit();
		System.out.println("End of program execution");
	}

}
