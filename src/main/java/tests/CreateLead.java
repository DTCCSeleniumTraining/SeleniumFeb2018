package tests;

import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class CreateLead extends LoginLeaftaps {
	// @Test(/*invocationCount=2*/)
	@Test(dataProvider="getData")
	//@Test(dataProvider="getData", dataProviderClass =LearnDP.class)
	public void createLead(String cName, String fName, String lName, String a) {
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", cName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", lName);
		clickByName("submitButton");
	}
	
	/*@DataProvider(name="getData")
	public Object[][] fetchData() {
		String data[][] = new String[2][3];
		data[0][0] = "Testleaf";
		data[0][1] = "koushik";
		data[0][2] = "chatterjee";
		
		data[1][0] = "Wipro";
		data[1][1] = "Sethu";
		data[1][2] = "S";
		return data;
	}*/
	
	
}
