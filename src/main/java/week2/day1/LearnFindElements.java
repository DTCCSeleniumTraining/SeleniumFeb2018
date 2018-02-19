package week2.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) throws IOException, Exception{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.crystalcruises.com/travel-calendar?year=2018");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> alllinks = driver.findElementsByLinkText("REQUEST A QUOTE");
		System.out.println(alllinks.size());
		alllinks.get(2).click();

		//Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img1.png");
		try {
			FileUtils.copyFile(src, dest);
			}
		/*catch (IOException e) {
			throw new RuntimeException();
		}
		catch (Exception e) {
		
		} */finally {
			
		}
		
	}


}







