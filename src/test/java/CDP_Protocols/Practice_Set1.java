package CDP_Protocols;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Set1 {
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        // Initialization of Chrome DevTools
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        
        int width = 375;  // Device width
        int height = 812; // Device height
        int deviceScaleFactor = 3; // Device scale factor (high DPI)
        boolean isMobile = true; // Emulate mobile device

        devTools.send(Emulation.setDeviceMetricsOverride(
                width, height, deviceScaleFactor, isMobile, null, null, null, null, null, null, null, null, null, java.util.Optional.empty()
        ));
        
        driver.get("https://stackoverflow.com/questions/72423913/java-selenium-driver-getdevtools-is-undefined-for-the-type-chromedriver");

        driver.quit();
	}
}
