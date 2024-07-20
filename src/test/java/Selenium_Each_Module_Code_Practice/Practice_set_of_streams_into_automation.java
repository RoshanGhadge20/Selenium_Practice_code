package Selenium_Each_Module_Code_Practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_set_of_streams_into_automation
{
    public static void main(String[] args) 
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://testautomationpractice.blogspot.com/");
        
        // Use a more appropriate locator strategy
        List<WebElement> elementslist = driver.findElements(By.xpath("//select[@id='country']"));
        
        // Debug: Print fetched elements
        System.out.println("Fetched Elements:");
        for (WebElement element : elementslist) 
        {
            System.out.println(element.getText());
        }
        
        List<String> originaList = elementslist.stream().map(s -> s.getText().trim()).collect(Collectors.toList());
        List<String> sorteList = originaList.stream().sorted().collect(Collectors.toList());
        
        System.out.println("Original List: " + originaList);
        System.out.println("Sorted List: " + sorteList);
        
        // Verify that the sorted list is actually sorted
        Assert.assertEquals(sorteList, originaList.stream().sorted().collect(Collectors.toList()));
        
        driver.quit();
        System.out.println("End of program code");
    }
}
