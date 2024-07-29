package ChromeDriverToolProtocols_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

import com.github.dockerjava.api.model.Network;
import com.google.common.base.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extract_network_reponsecode_and_status 
{
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		// Initialization of Chrome DevTools
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.requestWillBeSent(), 
        		request->{
        			Request req=request.getRequest();
        			System.out.println(req.geturlid);
        		}
		devTools.addListener(Network.responseReceived(), 
	        		response->{
	        			Response res=response.getResponse();
	        			System.out.println(req.status());
	        		}

        		
        );
		
		
	}
}
