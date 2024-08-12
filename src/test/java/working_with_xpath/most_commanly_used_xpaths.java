package working_with_xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class most_commanly_used_xpaths
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		
		/* 	Practice set to most commonly used xpaths 
		 * 
		 * 1. Contains()
		 * Ex :- driver.findElement(By.xpath("//tagname[contains(@Attr,'value')]");
		 * 
		 * 2. start-with()
		 * Ex. driver.findElement(By.xpath("//tagname[start-with(@Att,'Values')]");
		 * 
		 * 3. Text()
		 * Ex. driver.findElement(By.xpath("//tagname[Text()='Text that needs to be search']");
		 * 	
		 * 4. Normalize space()
		 * Ex. driver.findElement(By.xpath("//tagname[normalize-space()='Text that needs to search']"); 
		 * 
		 */
	}

}
