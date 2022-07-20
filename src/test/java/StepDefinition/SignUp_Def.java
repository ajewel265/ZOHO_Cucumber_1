package StepDefinition;

import ReuseLib.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SignUp_Def {

    @Given("User should be in SignUpNow page")
    public void user_should_be_in_sign_up_now_page() throws IOException {
        Base.Driverint();
        Base.newSignupPOM.Closeallcookies();
       // Base.newSignupPOM.ClsCookies();
        Base.newSignupPOM.ClickSignupnow();


    }
    @When("Enter Company Name")
    public void enter_company_name() {
        Base.newSignupPOM.companyname("ABC");

    }
    @When("Email Address")
    public void email_address() {

    }

    @When("Mobile Number")
    public void mobile_number() {

    }

    @When("Password")
    public void password() {

    }

    @Then("Select the Country")
    public void select_the_country() {

    }
}
