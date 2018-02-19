package week3.day1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	@Test
	public void frames() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("//button[text()='Try it']").click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Koushik");
	alert.accept();
	String text = driver.findElementById("demo").getText();
	System.out.println(text);
	driver.switchTo().defaultContent();
	System.out.println(driver.findElementById("framesize").getText());
	
	}

}
