package CDP_Protocols;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;

import com.github.dockerjava.api.model.LogConfig.LoggingType;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;
import org.openqa.selenium.chrome.ChromeDriver;

public class logging_javascript_error_from_Selenium_script
{
	// Sample program code

	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	LogEntries entry=driver.manage().logs().get(LoggingType.BROWSER);
	List<LogEntry> logsEntries=entry.getAll();
	For(LogEntry e:logEntries)
	{
		System.out.println(e.getMessage);
	}
}
