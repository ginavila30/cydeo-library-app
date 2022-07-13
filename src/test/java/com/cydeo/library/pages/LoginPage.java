package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    private WebElement usernameInput;

    @FindBy (id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement button;

    @FindBy(css = ".alert")
    private WebElement errorMessage;

    public WebElement getErrorMessageElement(){
        return errorMessage;
    }


    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        button.click();
    }



}
