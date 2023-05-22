package BDDCucumber.IntroductionToBDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Binding_LinkedInSignUp {
	@Given("launch the application")
	public void launch_the_application() {
		System.out.println("launch_the_application");
	    
	}

	@When("I entered the Email-id")
	public void i_entered_the_email_id() {
		System.out.println("i_entered_the_email_id");
	}
	

	@When("I Create the password")
	public void i_create_the_password() {
		System.out.println("i_create_the_password");
	}

	@When("I clicked on Agree&Join")
	public void i_clicked_on_agree_join() {
		System.out.println("i_clicked_on_agree_join");
	}

	@Then("I verified that the user Signup successfully")
	public void i_verified_that_the_user_signup_successfully() {
		System.out.println("i_verified_that_the_user_signup_successfully");
	}




}
