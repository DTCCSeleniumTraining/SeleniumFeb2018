package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class CreateLead extends LoginLeaftaps {
	
	@BeforeClass
	public void initialize() {
		excelFileName="create";
	}
	@Test(dataProvider="excelRead")
	public void createLead(String cName, String fName, String lName) {
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", cName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", lName);
		clickByName("submitButton");
	}	
}
