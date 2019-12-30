package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.Then;

public class HomePage extends ProjectSpecificMethods {

	public LoginPage clickLogout() {

		driver.findElement(By.className("decorativeSubmit")).click();

		return new LoginPage();

	}
	
	@Then("homepage displayed")
	public void verifyHomePage() {
		

	}
	
	
}