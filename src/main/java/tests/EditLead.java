package tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class EditLead extends LoginLeaftaps {
	
	String compName = "DTCC";
	@Test(expectedExceptions= {Exception.class, NoSuchElementException.class})
	//@Test(alwaysRun=true/*dependsOnMethods=("tests.CreateLead.createLead")*//*enabled=false*/)
	public void editLead() throws Exception {
	
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]", "Nimalan");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		if(verifyTitle("View Lead | opentaps CRM")) {
			System.out.println("Title Displayed successfully");
		}else {
			System.err.println("Title displayed with error");
		}
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", compName);
		clickByClassName("smallSubmit");
		verifyTextContainsByXpath("//*[@id='viewLead_companyName_sp']", compName);
	}
}
