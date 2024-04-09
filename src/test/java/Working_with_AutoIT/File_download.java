package Working_with_AutoIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_download {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		String path=System.getProperty("user.dir");
		ChromeOptions options = new ChromeOptions();
	    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("profile.default_content_settings.popups", 0);
	    chromePrefs.put("download.default_directory", path);
	    options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);		
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.manage().window().maximize();
		
		//System.out.println("Path of project is the:- "+ path);

		// Working with file upload practice
		
	  driver.findElement(By.cssSelector("#pickfiles")).click();
	  Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\AutoIT\\File_upload.exe");
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
	  "#processTask")));
	  driver.findElement(By.cssSelector("#processTask")).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
	  "#pickfiles"))); driver.findElement(By.cssSelector("#pickfiles")).click();
	  // wait until the file get's downloaded into the system
	  Thread.sleep(4000);
	  
	  // Ensure that file gets downloaded in local machine Thread.sleep(5000); 
	  //File f = new File("C:\\Users\\Admin\\Downloads\\ilovepdf_pages-to-jpg (2).zip");
	 File f=new File(path+"/ilovepdf_pages-to-jpg (2).zip");
	 
	  if (f.exists()) 
	  { 
		  System.out.println("File found in local system");
		  f.delete();
		  System.out.println("File get deleted from local system");
	  } 
	  else 
	  { 
		  System.out.println("File is not yet found in local system"); 
	  }
	  System.out.println("End of program Execution");
	}

}
