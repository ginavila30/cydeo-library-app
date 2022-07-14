package com.cydeo.library.pages;

import com.cydeo.library.utilities.Constant;
import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibrarianBasePage {

    public LibrarianBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title' and .='Users']")
    private WebElement usersBtn;

    public void clickUsersBtn(){
        new WebDriverWait(Driver.getDriver(), Constant.WAIT_TIME_OUTS).until(ExpectedConditions.visibilityOf(usersBtn));
        usersBtn.click();
    }

}
