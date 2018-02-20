package tests;

import org.testng.annotations.Test;

public class CreateLead extends LoginLeaftaps{
	@Test
	public void createLead() {

		login();
		clickByLink("Leads");
		clickByLink("Create Lea");
		enterById("createLeadForm_companyName","testleaf");
		enterById("createLeadForm_firstName", "koushik");
		enterById("createLeadForm_lastName", "chatterjee");		
		clickByName("submitButton");
		closeAllBrowsers();

	}
	}
