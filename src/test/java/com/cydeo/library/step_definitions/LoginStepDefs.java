package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Constant;
import com.cydeo.library.utilities.WaitUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage objLogin = new LoginPage();

    @Given("User is on login page")
    public void is_on_login_page() {
        BrowserUtils.goToURL(ConfigurationReader.getProperty("library.url"));
    }

    @When("User enters valid username {string} and User enters valid password {string}")
    public void user_enters_valid_username_user_enters_valid_password(String username, String password) {
        objLogin.login(username, password);
    }

    @Then("User should see {string} page title and URL should contain {string}")
    public void userShouldSeePageTitleAndURLShouldContain(String expectedTitle, String expectedURLContains) throws InterruptedException {
        WaitUtils.waitTitleContains(expectedTitle, Constant.WAIT_TIME_OUTS);
        BrowserUtils.verifyTitle(expectedTitle);
        BrowserUtils.verifyURLContains(expectedURLContains);
    }

    @When("User enters invalid username {string} and User enters invalid password {string}")
    public void userEntersInvalidUsernameAndUserEntersInvalidPassword(String username, String password) {
    }

    @Then("User should see error message {string}")
    public void userShouldSeeErrorMessage(String errorMessage) {
    }
}
