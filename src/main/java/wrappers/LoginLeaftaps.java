package wrappers;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import tests.LearnDP;
import wrappers.SeMethods;

public class LoginLeaftaps extends SeMethods{
	
	public String excelFileName=null;
	
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
	@DataProvider(name="excelRead")
	public Object[][] fetchData() throws IOException {
		LearnDP dataprovider = new LearnDP();
		return dataprovider.readData(excelFileName);
		
	}

}
