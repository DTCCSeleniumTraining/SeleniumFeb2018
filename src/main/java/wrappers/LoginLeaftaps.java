package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wrappers.SeMethods;

public class LoginLeaftaps extends SeMethods{
	@Parameters({"browser","url", "uName", "pswd"})
	@BeforeMethod
	public void login(String browser, String url, String userName, String passwd) {
		invokeApp(browser, url);
		enterById("username", userName);
		enterById("password", passwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	@AfterMethod
	public void closeApp() {
		closeAllBrowsers();
	}

}
