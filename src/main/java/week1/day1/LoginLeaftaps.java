package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeaftaps {

	public static void main(String[] args) {
		//Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
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
