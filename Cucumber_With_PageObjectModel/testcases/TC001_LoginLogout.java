package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_LoginLogout extends ProjectSpecificMethods {
	@Test
	public void loginAndLogout() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickLogout();

	}

}
