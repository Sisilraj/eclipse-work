package stepdefinitions;

import io.cucumber.java.en.*;

public class Login {
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {

	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String email) {

	}

	@And("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String password) {

	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {

	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		
	}

	@When("User enters invalid email address {string} into email field")
	public void user_enters_invalid_email_address_into_email_field(String invalidEmail) {

	}

	@And("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPassword) {

	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {

	}

	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {

	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {

	}
}
