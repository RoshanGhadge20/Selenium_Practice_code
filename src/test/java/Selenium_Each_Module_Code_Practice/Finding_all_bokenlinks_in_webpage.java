package Selenium_Each_Module_Code_Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Finding_all_bokenlinks_in_webpage
{

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("Webdriver.chrome.driver", "E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Long start_time=System.currentTimeMillis();
		int count = 1;
		int no_of_links = driver.findElements(By.tagName("a")).size();
		System.out.println("Total Number of links present in webpage :- " + no_of_links);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		SoftAssert softAssert = new SoftAssert();

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();
				int responseCode = connection.getResponseCode();
				System.out.println("Response Code for " + url + " :- " + responseCode);
				if (responseCode > 400) {
					count++;
				}
				softAssert.assertTrue(responseCode > 400,
						"The link with Text '" + link.getText() + "' is broken with code " + responseCode);

			} catch (Exception e) {
				softAssert.fail("Exception occurred while checking the link: " + e.getMessage());
			} finally {
				if (connection != null) {
					connection.disconnect();
				}

			}
		}

		// softAssert.assertAll();
		Long end_time=System.currentTimeMillis();
		Long diff=end_time-start_time;
		System.out.println("Total time of execution:- "+ TimeUnit.MILLISECONDS.toSeconds(diff));
		
		driver.quit();
		System.out.println("Total No. of Broken links:- " + count);
		System.out.println("End of program execution");

	}

}
