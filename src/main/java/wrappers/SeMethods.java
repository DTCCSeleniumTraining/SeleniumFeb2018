package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeMethods implements Wrappers{

	RemoteWebDriver driver;
	int i = 1;

	@Override
	public void invokeApp(String browser, String url) {
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

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Load the URL
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();
		
		takeSnap();


	}

	@Override
	public void enterById(String idValue, String data) {
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		System.out.println("The text field with id "+idValue+" entered with value :"+data);
		takeSnap();

	}

	@Override
	public void enterByName(String nameValue, String data) {
		driver.findElementByName(nameValue).clear();
		driver.findElementByName(nameValue).sendKeys(data);
		System.out.println("The text field with id "+nameValue+" entered with value :"+data);
		takeSnap();
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		driver.findElementByXPath(xpathValue).clear();
		driver.findElementByXPath(xpathValue).sendKeys(data);;
		System.out.println("The text field with id "+xpathValue+" entered with value :"+data);
		takeSnap();

	}

	@Override
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickById(String id) {
		driver.findElementById(id).click();
		System.out.println("The button with id "+id+" is clicked");
		takeSnap();

	}

	@Override
	public void clickByClassName(String classVal) {
		driver.findElementByClassName(classVal).click();
		System.out.println("The button with class name "+classVal+" is clicked");
		takeSnap();

	}

	@Override
	public void clickByName(String name) {
		driver.findElementByName(name).click();
		

	}

	@Override
	public void clickByLink(String name) {
		driver.findElementByLinkText(name).click();
		System.out.println("The link with name "+name+" is clicked");
		takeSnap();


	}

	@Override
	public void clickByLinkNoSnap(String name) {
		driver.findElementByLinkText(name).click();
		System.out.println("The link with name "+name+" is clicked");
		

	}

	@Override
	public void clickByXpath(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		System.out.println("The xpath with name "+xpathVal+" is clicked");
		takeSnap();
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		System.out.println("The xpath with name "+xpathVal+" is clicked");
		

	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void takeSnap() {
		//Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img"+i+".png");
		i++;
		try {
			FileUtils.copyFile(src, dest);
		}
		catch (IOException e) {
			throw new RuntimeException();
		}
		catch (Exception e) {

		} finally {

		}
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeAllBrowsers() {
		driver.quit();
	}

}
