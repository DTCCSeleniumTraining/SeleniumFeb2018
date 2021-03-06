package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginLeaftaps {
	
	 static RemoteWebDriver driver;

	public static void main(String[] args) {
		
		//Open the browser
		String browser = "firefox";
		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", 
					"./drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", 
					"./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			break;
		default:
			System.setProperty("webdriver.edge.driver", 
					"./drivers/MicrosoftWebDriver.exe");
			 driver =   new EdgeDriver();
			break;		
			}
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");

		//Maximize the browser
		driver.manage().window().maximize();

		//Find the username and enter the value
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Find the password and enter the value
		driver.findElementById("password").sendKeys("crmsfa");

		//Click Login button
		driver.findElementByClassName("decorativeSubmit").click();

		//Click the link CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		//Click the Leads link

		//click the link Create Lead

		//Enter the Company Name

		//Enter the Forename

		//Enter the surname

		//Click Create Lead button

		//Close the browser
		driver.close();














	}
}
