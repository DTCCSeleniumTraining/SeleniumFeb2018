package tests;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import wrappers.SeMethods;

public class LoginLeaftaps extends SeMethods{
	
	@Test
	public void login() {
		
		//Open the browser
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		
		//Find the username and enter the value
		enterById("username", "DemoSalesManager");

		//Find the password and enter the value
		enterById("password", "crmsfa");

		//Click Login button
		clickByClassName("decorativeSubmit");

		


	}

}
