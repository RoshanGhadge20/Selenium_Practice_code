package Selenium_Grid_Practice;

import org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeFieldIntegrator;

public class selenium_grid
{
	/*
	 * How to setup Selenium Grid for Cross Browser Testing
	 * Step 1: Installation :- download selenium server jar
	 * 
	 * Step 2: Start Hub :- Hub is the central point in the Selenium Grid that routes the JSON test commands to the nodes. It receives test requests from the client and routes them to the required nodes. To set up the Selenium Hub, open the command prompt, and navigate to the directory where the Selenium Server Standalone jar file is stored (downloaded in Step 1) using the following command.
	 * java -jar selenium-server-standalone-<version>.jar -role hub
	 * 
	 * Step 3: Start Nodes
	 * Whether testers are looking to running a grid with new WebDriver functionality or with the Selenium 1 RC functionality or running both of them simultaneously, testers have to use the same Selenium Server Standalone jar file, to start the nodes. To start nodes open the command prompt and navigate to the directory, where the Selenium Server Standalone jar file is stored.
	 * java -jar selenium-server-standalone-<version>.jar -role node -hub https://localhost:4444/grid/register
	 * 
	 * Step 4: Configure Nodes
	 * When testers start the nodes, by default, it allows 11 browsers, i.e., 5 Firefox, 5 Chrome, and 1 Internet Explorer for concurrent use. It also allows testers to conduct a maximum of 5 concurrent tests by default.
	 * Testers can change this and other browser settings, by configuring nodes. This can be done by passing parameters to each of the -browser switches that represent a node, based on the parameters.
	 *  -browser browserName=firefox,version=4,maxInstances=4,platform=WINDOWS
	 *  
	 *  Step 5: Using Selenium Grid to run tests
	 *  Once the Selenium Grid setup is done by following the above 4 steps, testers can access the grid to run tests. If Selenium 1 RC nodes are being used, testers can use DefaultSelenium object and pass the same in the hub formation using the following command.
	 * Selenium selenium = new DefaultSelenium(“localhost”, 4444, “*firefox”, “https://www.browserstack.com”);
	 * DesiredCapabilities capability = DesiredCapabilities.firefox();
	 * WebDriver driver = new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"), capability);
	 * capability.setBrowserName();
		capability.setPlatform();
		capability.setVersion()
		capability.setCapability(,);

	 * -browser browserName=firefox,version=4,maxInstances=4,platform=WINDOWS
	 * capability.setBrowserName(“firefox” );
	   capability.setPlatform(“WINDOWS”);
		capability.setVersion(“4”);
	 * 
	 * capability.setBrowserName(“firefox” );
		capability.setVersion(“4”);
	 * 	
	 * 
	 */	
}
