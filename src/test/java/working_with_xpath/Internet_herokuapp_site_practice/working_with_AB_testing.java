package working_with_xpath.Internet_herokuapp_site_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working_with_AB_testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("A/B Testing")).click();

		// Working with A/B Testing
		System.out.println("Getting an page title for A/B Testing: " + driver.getTitle());
		String textElement = driver
				.findElement(By.xpath("//p[contains(text(),'Also known as split testing. This is a way in whic')]"))
				.getText();
		System.out.println(textElement);
		driver.navigate().back();

		// Working with Add/Remove Elements

		driver.findElement(By.linkText("Add/Remove Elements")).click();
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
		}
		driver.navigate().back();

		// Working with Basic Auth
		driver.findElement(By.linkText("Basic Auth")).click();
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.navigate().to("https://the-internet.herokuapp.com/");
		System.out.println("Basic authentication handled");

		// Working with Broken images
		driver.findElement(By.linkText("Broken Images")).click();
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for (WebElement image : images) {
			if (image.getAttribute("naturalWidth").equals("0")) {
				System.out.println(image.getAttribute("outerHTML") + " is broken.");
			} else {
				System.out.println(image.getAttribute("outerHTML") + "is correct");
			}

		}
		driver.navigate().back();

		// Working with Checkboxes
		driver.findElement(By.linkText("Checkboxes")).click();
		driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]")).click();
		System.out.println("Checkbox 1 is clicked");
		driver.navigate().back();

		// Working with Context Menu
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[7]/a")).click();
		WebElement clickablElement = driver.findElement(By.cssSelector("div[id='hot-spot']"));
		Actions action = new Actions(driver);
		action.contextClick(clickablElement).build().perform();
		String des = driver.switchTo().alert().getText();
		System.out.println(des);
		driver.switchTo().alert().accept();
		driver.navigate().back();

		// Digest Authentication is same as the basic authenticaion

		// Working with the disappearing elements
		driver.findElement(By.xpath("//*[@id='content']/ul/li[9]/a")).click();
		driver.findElement(By.linkText("Home")).click();
		// driver.navigate().back();
		Thread.sleep(2000);

		// Working with Drag and Drop
		driver.findElement(By.xpath("//*[@id='content']/ul/li[10]/a")).click();
		WebElement draggablElement = driver.findElement(By.cssSelector("div[draggable='true']"));
		WebElement droppableElement = driver.findElement(By.cssSelector("div[draggable='true']"));
		action.dragAndDrop(draggablElement, droppableElement).build().perform();
		driver.navigate().back();

		// Working with Dropdown
		driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
		WebElement drpdwnElement = driver.findElement(By.cssSelector("select[id='dropdown']"));
		Select select = new Select(drpdwnElement);
		select.selectByVisibleText("Option 1");
		driver.navigate().back();

		// working with Dynamic content

		// Working with Dynamic controls
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@label='blah']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		driver.navigate().back();

		// Working with Dynamic Loading

		// Working with Entry Ads
		driver.findElement(By.linkText("Entry Ads")).click();
		driver.findElement(By.cssSelector("a[id='restart-ad']")).click();
		driver.findElement(By.xpath("//*[@id='modal']/div[2]/div[3]/p")).click();
		driver.navigate().back();

		// Working with Exit Intent

		// Working with File Download
		driver.findElement(By.linkText("File Download")).click();
		driver.findElement(By.partialLinkText("20DCE143")).click();
		System.out.println("File gets downloaded");
		driver.navigate().back();

		// Working with File Upload
		/*
		 * driver.findElement(By.tagName("File Upload")).click();
		 * System.out.println((driver.getTitle()));
		 * driver.findElement(By.cssSelector("*[id='file-upload']")).click();
		 * 
		 */

		driver.quit();
		System.out.println("End of Program Executions");
	}

}
