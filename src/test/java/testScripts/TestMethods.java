package testScripts;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMethods {

	@Given("Launch URL")
	public void launch_URL() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("URL Launched");
	}

	@When("login to application")
	public void login_to_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logged into application");
	}

	@Then("Logout")
	public void logout() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logout");
	}
	
}
