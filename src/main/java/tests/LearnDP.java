package tests;

import org.testng.annotations.DataProvider;

public class LearnDP {
		
	@DataProvider(name="getData")
	public static Object[][] fetchData() {
		String data[][] = new String[2][3];
		data[0][0] = "Testleaf";
		data[0][1] = "koushik";
		data[0][2] = "chatterjee";
		
		data[1][0] = "Wipro";
		data[1][1] = "Sethu";
		data[1][2] = "S";
		return data;
	}

}
