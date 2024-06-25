package Amazon_product_Purchase_Flow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_product_buy {

    static WebDriver driver;
    static Web_Elements_Utility objElements_Utility;

    @BeforeClass
    public static void tear_up() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }

    @Test(priority = 1)
    public static void implement_wait() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public static void Making_obj_of_utility() {
        objElements_Utility = new Web_Elements_Utility(driver);
    }

    @Test(priority = 3)
    public static void login_with_mobile_number() {
        // login_with_mobile_number& password
        objElements_Utility.login_with_mobile();
        System.out.println("******* Test 1 Passed ******");
    }

    @Test(priority = 4)
    public static void Verify_page_title() {
        // Getting page title & verify it
        String exp_title = "Your Amazon.in";
        String act_title = driver.getTitle();
        System.out.println(act_title);
        if (exp_title.equals(act_title)) {
            System.out.println("Title of page :- " + act_title);
        } else {
            System.out.println("Fail, Page title does not match");
        }
       // System.out.println("******* Test 2 Passed ******");
    }

    @Test(priority = 5)
    public static void Searching_product() throws InterruptedException {
        objElements_Utility.Search_Product();
       // System.out.println("******* Test 3 *********");
    }

    @Test(priority = 6)
    public static void Findind_list_of_prod() {
        List<WebElement> pro_element = driver.findElements(By.cssSelector("div[data-cy='title-recipe']"));
        // Finding the list of products
        for (WebElement product : pro_element) {
           System.out.println(product.getText());
        }
        //System.out.println("****** Test 4 *******");
    }

    @AfterClass
    public static void Tear_down() {
        if (driver != null) {
            driver.quit();
        }
        //System.out.println("End Of program execution");
    }
}