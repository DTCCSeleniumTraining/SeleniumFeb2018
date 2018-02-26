package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class SampleTest {

	@Test
	public void meth() {
	LoginPage lp = new LoginPage();
	lp.enteruserName("ca").clickLoginFailure();
	

	}
}
