package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnVerification {

	public static void main(String[] args) throws InterruptedException  {
		// Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");

		// Maximize the browser
		driver.manage().window().maximize();

		//Implicit Wait - It affects only findElement
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Find the username and enter the value
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Find the password and enter the value
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login button
		WebElement label = driver.findElementByXPath("//*[@id='login']/p[1]/label");
		System.out.println(label.getText());
		System.out.println(label.isEnabled());

		/*// textbox value
		System.out.println(label.getAttribute("value"));

		//for link text
		System.out.println(label.getAttribute("href"));

		//for an image
		System.out.println(label.getAttribute("src"));*/


		// Click the link CRM/SFA
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		// Click the Leads link
		driver.findElementByLinkText("Leads").click();

		// click the link Create Lead
		driver.findElementByLinkText("Create Lead").click();

		//title
		System.out.println(driver.getTitle());

		// To get Current URL
		System.out.println(driver.getCurrentUrl());


		//location
		Point loc = driver.findElementById("createLeadForm_dataSourceId").getLocation();
		
		// get X  and Y loc
		System.out.println(loc.getX());
		System.out.println(loc.getY());

	}

}
