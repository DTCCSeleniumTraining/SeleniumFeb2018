package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements Wrappers {

	RemoteWebDriver driver;
	int i = 1;

	@Override
	public void invokeApp(String browser, String url) {
		try {
			switch (browser) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			default:
				System.setProperty("webdriver.edge.driver", "./drivers/MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				break;
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();

		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured: " + e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Exception occured: " + e.getMessage());
		} finally {
			takeSnap();
		}
	}

	@Override
	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The text field with id " + idValue + " entered with value :" + data);
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured: " + e.getMessage());
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured: " + e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Exception occured: " + e.getMessage());
		} finally {
			takeSnap();
		}

	}

	@Override
	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The text field with id " + nameValue + " entered with value :" + data);
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured: " + e.getMessage());
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured: " + e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Exception occured: " + e.getMessage());
		} finally {
			takeSnap();
		}
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		driver.findElementByXPath(xpathValue).clear();
		driver.findElementByXPath(xpathValue).sendKeys(data);
		System.out.println("The text field with id " + xpathValue + " entered with value :" + data);
		takeSnap();

	}

	@Override
	public boolean verifyTitle(String title) {
		boolean isMatch = false;
		try {
			if (driver.getTitle().equals(title)) {
				isMatch = true;
				System.out.println("Title matched");
			}
		} catch (Exception e) {
			throw new RuntimeException("Exception Occured");
		}
		return isMatch;
	}

	@Override
	public void verifyTextById(String id, String text) {
		try {
			String actualText = driver.findElementById(id).getText();
			if (actualText.equals(text)) {
				System.out.println("Displayed test matches with the expected text");
			} else {
				System.err.println("Displayed test does not matches with the expected text");
			}
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}

	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				System.out.println("Displayed test matches with the expected text");
			} else {
				System.err.println("Displayed test does not matches with the expected text");
			}
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}

	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				System.out.println("Displayed test matches with the expected text");
			} else {
				System.err.println("Displayed test does not matches with the expected text");
			}
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}

	}

	@Override
	public void clickById(String id) {
		try {
			driver.findElementById(id).click();
			System.out.println("The button with id " + id + " is clicked");
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (UnhandledAlertException e) {
			throw new RuntimeException("Alert Exception occured");		
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		} finally {
			takeSnap();
		}

	}

	@Override
	public void clickByClassName(String classVal) {
		driver.findElementByClassName(classVal).click();
		System.out.println("The button with class name " + classVal + " is clicked");
		takeSnap();

	}

	@Override
	public void clickByName(String name) {
		driver.findElementByName(name).click();

	}

	@Override
	public void clickByLink(String name) {
		driver.findElementByLinkText(name).click();
		System.out.println("The link with name " + name + " is clicked");
		takeSnap();

	}

	@Override
	public void clickByLinkNoSnap(String name) {
		driver.findElementByLinkText(name).click();
		System.out.println("The link with name " + name + " is clicked");

	}

	@Override
	public void clickByXpath(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		System.out.println("The xpath with name " + xpathVal + " is clicked");
		takeSnap();
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		System.out.println("The xpath with name " + xpathVal + " is clicked");

	}

	@Override
	public String getTextById(String idVal) {
		String text = null;
		try {
			text = driver.findElementById(idVal).getText();
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}
		return text;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		String text = null;
		try {
			text = driver.findElementByXPath(xpathVal).getText();
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}
		return text;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		try {
			Select dropDown = new Select(driver.findElementById(id));
			dropDown.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		} finally {
			takeSnap();
		}
	}

	@Override
	public void selectIndexById(String id, int value) {
		try {
			Select dropDown = new Select(driver.findElementById(id));
			dropDown.selectByIndex(value);
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		} finally {
			takeSnap();
		}
	}
/*	public void switchToWindow(int i) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> list = new ArrayList<String>();
			list.addAll(allWindows);
			driver.switchTo().window(list.get(i));
			System.out.println("Switched to last window");
		} catch (NoSuchWindowException e) {
			throw new RuntimeException("Exception occured");
		}catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}		
	}*/

	@Override
	public void switchToParentWindow() {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> list = new ArrayList<String>();
			list.addAll(allWindows);
			driver.switchTo().window(list.get(0));
			System.out.println("Switched to last window");
		} catch (NoSuchWindowException e) {
			throw new RuntimeException("Exception occured");
		}catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}		
	}

	@Override
	public void switchToLastWindow() {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> list = new ArrayList<String>();
			list.addAll(allWindows);
			driver.switchTo().window(list.get(list.size()-1));
			System.out.println("Switched to last window");
		} catch (NoSuchWindowException e) {
			throw new RuntimeException("Exception occured");
		}catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}

	}

	@Override
	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}
	}

	@Override
	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}
	}

	@Override
	public String getAlertText() {
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Exception occured");
		} catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}
		return text;
	}

	@Override
	public void takeSnap() {
		// Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img" + i + ".png");
		i++;
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}

	@Override
	public void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void closeAllBrowsers() {
		driver.quit();
	}

}
