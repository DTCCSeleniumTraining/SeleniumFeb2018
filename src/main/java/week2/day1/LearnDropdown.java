package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		// Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Find the username and enter the value
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Find the password and enter the value
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click the link CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// Click the Leads link
		driver.findElementByLinkText("Leads").click();

		// click the link Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement source = 
				driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		//dd.selectByVisibleText("Employee");
		//dd.selectByValue("LEAD_DIRECTMAIL");
		//dd.selectByIndex(3);
		List<WebElement> opt = dd.getOptions();
		/*int size = opt.size();
		dd.selectByIndex(size-2);*/
		for (WebElement eachOpt : opt) {
			System.out.println(eachOpt.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
