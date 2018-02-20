package wrappers;

import wrappers.SeMethods;

public class LoginLeaftaps extends SeMethods{
	
	
	public void login() {
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	
	public void closeApp() {
		closeAllBrowsers();
	}

}
