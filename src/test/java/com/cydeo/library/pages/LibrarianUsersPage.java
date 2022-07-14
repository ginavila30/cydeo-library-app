package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LibrarianUsersPage {

    public LibrarianUsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//table//th")
    private List<WebElement> topColumnsFromTable;

    public List<String> getListTopColumnsInText(){
        List<String> list = new ArrayList<>();
        topColumnsFromTable.forEach(n -> list.add(n.getText()));
        return list;
    }

}
