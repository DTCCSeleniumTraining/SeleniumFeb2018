package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowsSwitch {
	@Test
	public void met() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String string : allWindows) {
			System.out.println("set Values"+string);
		}
		List<String> allWindowsList = new ArrayList<String>();
		allWindowsList.addAll(allWindows);
		for (String string : allWindowsList) {
			System.out.println("list Values"+string);

		}
		int size = allWindowsList.size();

		System.out.println(size);
		String childWin = allWindowsList.get(size-1);
		driver.switchTo().window(childWin);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


		/*String parentWin = allWindowsList.get(0);
	driver.switchTo().window(parentWin);*/
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit();



		//  Actual Code
		//	Set<String> allWindows = driver.getWindowHandles();
		//	List<String> allWindowsList = new ArrayList<String>();
		//	allWindowsList.addAll(allWindows);
		//	driver.switchTo().window(allWindowsList.get(index));
	}
}















