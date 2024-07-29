package Chromeoptions_practice;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seting_path_of_download_file_using_chromeoptions
{
	public static void main(String[] args) 
	
	{
		ChromeOptions options = new ChromeOptions();
		String downloadpath="E://";
		HashMap<String, Object> chromepref=new HashMap<String, Object>();
		chromepref.put("profile.default_content_setting_popup", 0);
		chromepref.put("download.default_directory", downloadpath);
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.quit();
		System.out.println("End of program code");

	}
}
