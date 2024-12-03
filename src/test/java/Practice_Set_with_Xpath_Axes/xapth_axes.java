package Practice_Set_with_Xpath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.protocol.a.NativeConstants.StringSelfDataType;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.SelfCallHandle;

public class xapth_axes {
	public static void main(String[] args)

	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();

		// Working with Xath Axes

		// 1. Self Node
		WebElement self_node = driver.findElement(By.className("userform"));

		/*
		 * 2 Parent Node Syntaxt = //xpath_of_current_node/parent::tagname
		 */
		driver.findElement(By.xpath("//div[@class='userform']/parent::div"));

		/*
		 * 3 Ancestor Node Syntaxt = 1. //xpath_of_current_node/ancestor::tagname 2.
		 * //xpath_current_node/ancestor::*
		 */
		driver.findElement(By.xpath("//div[@class='userform']/ancestor::*"));

		/*
		 * 4 Child Node Syntaxt = //xpath_of_current_node/child::tagname or
		 * //xpath_of_current_node/child::*
		 */
		driver.findElement(By.xpath("//div[@class='userform']/child::input[2]"));

		/*
		 * 5 Descendent Node Syntaxt = //xpath_of_current_node/descendent::tagname or
		 * //xpath_of_current_node/descendent::*
		 */
		driver.findElement(By.xpath("//div[@class='elementor-element-populated']/descendant::div"));

		/*
		 * 6 following Node Syntaxt = //xpath_of_current_node/following::tagname or
		 * //xpath_of_current_node/following::*
		 */
		driver.findElement(By.xpath("//div[@class='userform']/following::*"));

		/*
		 * 6 preceding Node Syntaxt = //xpath_of_current_node/preceding::tagname or
		 * //xpath_of_current_node/preceding::*
		 */
		driver.findElement(By.xpath("//div[@class='userform']/preceding::*"));

		/*
		 * 7 following-sibling Node Syntaxt =
		 * //xpath_of_current_node/following-sibling::tagname or
		 * //xpath_of_current_node/following-sibling::*
		 */
		driver.findElement(By.xpath("//div[@class='userform']/following-sibling::*"));

		/*
		 * 8 preceding-sibling Node Syntaxt =
		 * //xpath_of_current_node/preceding-sibling::tagname or
		 * //xpath_of_current_node/preceding-sibling::*
		 */
		driver.findElement(By.xpath("//div[@class='elementor-element-populated']/preceding-sibling:div"));

		driver.quit();

	}
}
