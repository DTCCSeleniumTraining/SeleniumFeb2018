package pages;

import wrappers.SeMethods;

public class LoginPage extends SeMethods{

	public LoginPage enteruserName(String userName) {
		enterById("username", userName);
		return this;
	}
	public LoginPage enterPassword(String password) {
		enterById("password", password);
		return this;
	}
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage();
		}
	public LoginPage clickLoginFailure() {
		clickByClassName("decorativeSubmit");
		return this;
		}
	

}
