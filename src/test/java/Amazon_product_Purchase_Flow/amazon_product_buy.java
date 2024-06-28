package Amazon_product_Purchase_Flow;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	private static final Logger logg = LogManager.getLogger(amazon_product_buy.class);

	@BeforeClass
	public static void tear_up() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		logg.info("Webdriver initiated");
	}

	@Test(priority = 1)
	public void implement_wait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		logg.info("Implemented implicit wait");
	}

	@Test(priority = 2)
	public void Making_obj_of_utility() {
		objElements_Utility = new Web_Elements_Utility(driver);
		logg.info("Object of utility class is created");
	}

	@Test(priority = 3)
	public void login_with_mobile_number() {
		objElements_Utility.login_with_mobile();
		logg.info("Method called login with mobile number");
	}

	@Test(priority = 4)
	public void Verify_page_title() {
		String exp_title = "Your Amazon.in";
		String act_title = driver.getTitle();
		logg.info("Actual title: " + act_title);
		if (exp_title.equals(act_title)) {
			logg.info("Title of page matches: " + act_title);
		} else {
			logg.error("Fail, Page title does not match");
		}
	}

	@Test(priority = 5)
	public void Searching_product() throws InterruptedException {
		objElements_Utility.Search_Product();
		logg.info("Method called searching product");
	}

	@Test(priority = 6)
	public void Finding_list_of_prod() {
		List<WebElement> pro_element = driver.findElements(By.cssSelector("div[data-cy='title-recipe']"));
		for (WebElement product : pro_element) {
			logg.info(product.getText());
		}
	}

	@Test(priority = 7)
	public void count_link() {
		logg.info("Total Number of links: " + objElements_Utility.count_number_of_links());
	}

	@Test(priority = 8)
	public void check_detail_screen() throws InterruptedException {
		objElements_Utility.get_details();
		Set<String> win_han= driver.getWindowHandles();
		Iterator<String> it=win_han.iterator();
		while(it.hasNext())
		{
			System.out.println("Window Id:- "+ (it.next()).toString());
		}
	}

	String chil_winString="F8ECA481E5F89378D66AF70D9EA7251F";
	@Test(priority = 9)
	public void buy_now() throws InterruptedException {
		driver.switchTo().window(chil_winString);
		objElements_Utility.click_buy_now();
	
	}

	@AfterClass
	public void Tear_down() {
		if (driver != null) {
			driver.quit();
		}
		logg.info("Webdriver closed");
	}
}
