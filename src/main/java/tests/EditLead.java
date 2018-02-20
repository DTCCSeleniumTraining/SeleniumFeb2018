package tests;

import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class EditLead extends LoginLeaftaps{
	@Test
	public void createLead() {

		login();
		clickByLink("Leads");
		clickByLink("Create Lead");
		closeAllBrowsers();
		/*enterById("createLeadForm_companyName","testleaf");
		enterById("createLeadForm_firstName", "koushik");
		enterById("createLeadForm_lastName", "chatterjee");		
		clickByName("submitButton");*/

	}
	}
