package week4.day1;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnReports {
	@Test
	public void report() {
		ExtentReports reports = new ExtentReports("./Reports/result.html", false);
		reports.loadConfig(new File("./Config.xml"));
		ExtentTest test = reports.startTest("TC001", "Generate a sample report");
		test.assignAuthor("Sethu");
		test.assignCategory("Smoke");
		test.log(LogStatus.PASS, "sample test"+test.addScreenCapture(".././Snaps/img1.png"));
		reports.endTest(test);
		reports.flush();
		
		
	}

}
