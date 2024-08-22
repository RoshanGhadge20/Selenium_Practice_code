
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.fetch.Fetch;
import org.openqa.selenium.devtools.v122.network.model.ErrorReason;

public class NetworkFailedRequest 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

		ChromeDriver driver = new ChromeDriver();

		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		// java.util.Optional<java.lang.String> urlPattern
		Optional<List> org.openqa.selenium.devtools.v122.fetch.model.RequestPattern>> patterns = Optional.empty();

		devTools.send(Fetch.enable(patterns, Optional.empty()));

		devTools.addListener(Fetch.requestPaused(), request -> {

			devTools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));

		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();

	}

}
