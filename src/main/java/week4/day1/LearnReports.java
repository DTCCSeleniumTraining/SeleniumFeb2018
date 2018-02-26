package week4.day1;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnReports {
	@Test
	public void report() {
		// Create HTML
		ExtentReports reports = new ExtentReports("./Reports/result.html", false); // Before Suite
		// Load config.xml
		reports.loadConfig(new File("./Config.xml"));	// Before Suite
		// Create Test
		ExtentTest test = reports.startTest("TC001", "Generate a sample report");	//Before Test
		// Assign Author
		test.assignAuthor("Sethu");	// Before Class
		// Assign Category
		test.assignCategory("Smoke");		// Before Class
		// Create log
		test.log(LogStatus.PASS, "sample test"+test.addScreenCapture(".././Snaps/img1.png")); //@Test
		// End Test
		reports.endTest(test);	//After Test
		// save Report
		reports.flush();	// After Suite
		
	}

}
