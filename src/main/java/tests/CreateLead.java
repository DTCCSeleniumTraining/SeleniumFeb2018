package tests;

import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class CreateLead extends LoginLeaftaps {
	@Test
	public void createLead() {
		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "testleaf");
		enterById("createLeadForm_firstName", "koushik");
		enterById("createLeadForm_lastName", "chatterjee");
		clickByName("submitButton");
		//closeAllBrowsers();
	}
}
