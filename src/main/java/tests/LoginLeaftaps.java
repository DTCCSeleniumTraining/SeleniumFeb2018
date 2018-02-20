package tests;

import wrappers.SeMethods;

public class LoginLeaftaps extends SeMethods{
	
	
	public void login() {
		
		//Open the browser
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		
		//Find the username and enter the value
		enterById("username", "DemoSalesManager");

		//Find the password and enter the value
		enterById("password", "crmsfa");

		//Click Login button
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");

		


	}

}
