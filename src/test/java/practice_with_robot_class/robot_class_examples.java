package practice_with_robot_class;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi.ECVKO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robot_class_examples 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		

		Robot rb = new Robot();
		/*
		//Keypress & KeyRelease
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		 * 
		 */
		
		/*
		//Capturing screenshot
		Dimension dimension =Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle();
		BufferedImage imgBufferedImage = rb.createScreenCapture(rectangle);
		ImageIO.write(imgBufferedImage,"png","./screenshot");
		*/
		
		/*
		//Scrolling page with mouse wheel 
		rb.mouseWheel(15);
		Thread.sleep(2000);
		*/
		
		//Upload file with robot class 
		
		WebElement choosefile = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#singleFileInput")));

		String path="C:\\Users\\Admin\\OneDrive\\Desktop\\Tasks.txt";
		
		StringSelection stringSelection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
		rb.delay(1000);
		
		choosefile.click();
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(1000);
		
		
		
		System.out.println("File gets uploaded");
		Thread.sleep(5000);
		driver.quit();
	}
}
