package Selenium_Each_Module_Code_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_calender_controls 
{
	public static void main(String[] args) throws InterruptedException 
	{
        String expectedFromDateStr = "01/20/2020";
        String expectedToDateStr = "02/26/2020";
        String expectedFromDate = "20";
        String expectedToDate = "26";
        String testUrl = "https://jqueryui.com/datepicker/#date-range";

        /*
         * System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
     	*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(testUrl);
        Thread.sleep(5000);

        WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
        driver.switchTo().frame(frame);

        // Steps for the From Date
        WebElement fromDP = driver.findElement(By.xpath("//input[@id='from']"));
        fromDP.click();
        Thread.sleep(5000);

        WebElement fromMonth = driver.findElement(By.xpath("//div/select[@class='ui-datepicker-month']"));
        Select selectedFromMonth = new Select(fromMonth);
        selectedFromMonth.selectByVisibleText("Jan");
        Thread.sleep(5000);

        WebElement fromDay = driver.findElement(By.xpath("//td[not(contains(@class,'ui-datepicker-month'))]/a[text()='" + expectedFromDate + "']"));
        fromDay.click();
        Thread.sleep(10000);

        // Steps for the To Date
        WebElement toDP = driver.findElement(By.xpath("//input[@id='to']"));
        toDP.click();
        Thread.sleep(5000);

        WebElement toMonth = driver.findElement(By.xpath("//div/select[@class='ui-datepicker-month']"));
        Select selectedToMonth = new Select(toMonth);
        selectedToMonth.selectByVisibleText("Feb");
        Thread.sleep(5000);

        WebElement toDay = driver.findElement(By.xpath("//td[not(contains(@class,'ui-datepicker-month'))]/a[text()='" + expectedToDate + "']"));
        toDay.click();
        Thread.sleep(10000);

        // Verify whether the values are as expected
        String selectedFromDateStr = fromDP.getAttribute("value"); // get attribute is used for fetching the value of attribute ( Webelement )
        String selectedToDateStr = toDP.getAttribute("value");

        if (selectedFromDateStr.equals(expectedFromDateStr) && selectedToDateStr.equals(expectedToDateStr))
        {
            System.out.println("Unit Test of jQuery Calendar passed");
        } else 
        {
            System.out.println("Unit Test of jQuery Calendar failed");
        }

        driver.quit(); // Closing all the tabs
        System.out.println("End of Program Execution");
		}
}
