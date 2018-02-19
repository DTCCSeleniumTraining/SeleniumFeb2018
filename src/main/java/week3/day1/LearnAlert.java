package week3.day1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
	@Test
	public void alert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");

		//Implicit Wait - It affects only findElement
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();
		
		
		
		driver.findElementById("loginbutton").click();
		//driver.getTitle();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		Thread.sleep(5000);
		alert.dismiss();
		System.out.println(text);
		
	
		
		
		
	}
}
















