package Flipkard_Flow;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class getting_all_list_of_product 
{
	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");

		// getting the list of products that are added to the card
		List<WebElement> productsElement = driver.findElements(By.className("a.T2CNXf.QqLTQ-"));
		for (WebElement product : productsElement) 
		{
			System.out.println(product.getText());
		}

		driver.quit();
		
		System.out.println("End of progrm execution");
		
	}

}
