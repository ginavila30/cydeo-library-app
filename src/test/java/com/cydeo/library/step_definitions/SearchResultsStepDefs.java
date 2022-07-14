package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibrarianBasePage;
import com.cydeo.library.pages.LibrarianUsersPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class SearchResultsStepDefs {
    @Given("I am a librarian logged in on dashboard page")
    public void i_am_a_librarian_logged_in_on_dashboard_page() {
        BrowserUtils.goToURL(ConfigurationReader.getProperty("library.url"));
        new LoginPage().login("librarian2@library","eb2VQKEj");
    }

    @When("I click on {string} link")
    public void i_click_on_link(String usersLink) {
        new LibrarianBasePage().clickUsersBtn();
    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> listOfColumns) {
        BrowserUtils.verify2ListsOfTextEqual(listOfColumns,new LibrarianUsersPage().getListTopColumnsInText());
    }

}
