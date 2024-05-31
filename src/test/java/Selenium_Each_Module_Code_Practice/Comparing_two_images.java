package Selenium_Each_Module_Code_Practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Comparing_two_images {
	public static void main(String[] args) throws IOException {
		// Setup WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Find the element
		WebElement element = driver.findElement(By.id("name"));

		// Read the expected image from file
		BufferedImage expectedImage = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\Screenshots\\demo.png"));

		// Take a screenshot of the element using AShot
		BufferedImage actualImage = new AShot().takeScreenshot(driver, element).getImage();

		// Compare the images
		ImageDiffer imgDiffer = new ImageDiffer();
		ImageDiff diff = imgDiffer.makeDiff(actualImage, expectedImage);

		// Assert that there are no differences
		if (diff.hasDiff()) {
			System.out.println("Images are different");
		} else {
			System.out.println("Images are the same");
		}

		// Quit the driver
		driver.quit();
		System.out.println("Program code execution completed");
	}
}
