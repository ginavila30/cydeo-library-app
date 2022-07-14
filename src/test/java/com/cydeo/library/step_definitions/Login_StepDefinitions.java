package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("I am on the log in page")
    public void i_am_on_the_log_in_page() {
        BrowserUtils.goToURL(ConfigurationReader.getProperty("library.url"));
    }

    @When("I enter username {string} and password {string} and click the sign in button")
    public void i_enter_username_and_password_and_click_the_sign_in_button(String username, String password) {
        new LoginPage().login(username,password);
    }

    @Then("URL should contains {string}")
    public void url_should_contains(String expectedUrl) {
        WaitUtils.waitUrlContains(expectedUrl, Constant.WAIT_TIME_OUTS);
        BrowserUtils.verifyURLContains(expectedUrl);
    }

}
