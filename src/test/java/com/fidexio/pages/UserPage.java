package com.fidexio.pages;

import com.fidexio.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    public UserPage(){

      PageFactory.initElements(Driver.getDriver(),this);

           }
    @FindBy (xpath = "//li[.='#Inbox']")
    public WebElement UserOnPage;


}
