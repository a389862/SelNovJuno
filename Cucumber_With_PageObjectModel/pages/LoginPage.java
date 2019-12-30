package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends ProjectSpecificMethods {
	@Given("enter the username")
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		return this;
	}

	@Given("enter the password")
	public LoginPage enterPassword() {

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	@When("click login")
	public HomePage clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage();
	}
}
