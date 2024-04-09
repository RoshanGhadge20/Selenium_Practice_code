package Working_with_AutoIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.manage().window().maximize();
		String path=System.getProperty("user.dir");
		//System.out.println("Path of project is the:- "+ path);

		// Working with file upload practice
		
		  driver.findElement(By.cssSelector("#pickfiles")).click();
		  Runtime.getRuntime().exec(
		  "C:\\Users\\Admin\\Desktop\\AutoIT\\File_upload.exe");
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
		  "#processTask")));
		  driver.findElement(By.cssSelector("#processTask")).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
		  "#pickfiles"))); driver.findElement(By.cssSelector("#pickfiles")).click();
		  
		  // Ensure that file gets downloaded in local machine Thread.sleep(5000); 
		  File f = new File("C:\\Users\\Admin\\Downloads\\ilovepdf_pages-to-jpg (2).zip");
		 //File f=new File(path+"/ilovepdf_pages-to-jpg (2).zip" 
		 
		  if (f.exists()) { System.out.println("File found in local system");
		  
		  } else { System.out.println("File is not yet found in local system"); }
		 
		System.out.println("End of program Execution");
	}

}
