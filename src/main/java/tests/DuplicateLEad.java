package tests;

import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class DuplicateLEad extends LoginLeaftaps {
	@Test
	public void dup(){
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Email']");
		enterByXpath("//label[text()='Email Address:']/following::input[1]", "koushik@testleaf.com");
		clickByXpath("//button[text()='Find Leads']");
		String leadId = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		clickByLink("Duplicate Lead");
		verifyTitle("Duplicate Lead | opentaps CRM");
		clickByName("submitButton");
		String textById = getTextById("viewLead_firstName_sp");
		if(textById.equals(leadId)){
			System.out.println("Same");
		}
	}
}
