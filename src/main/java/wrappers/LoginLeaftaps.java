package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	
	@DataProvider(name="getData")
	public Object[][] fetchData() {
		String data[][] = new String[2][3];
		data[0][0] = "Testleaf";
		data[0][1] = "koushik";
		data[0][2] = "chatterjee";
		
		data[1][0] = "Wipro";
		data[1][1] = "Sethu";
		data[1][2] = "S";
		return data;
	}

}
