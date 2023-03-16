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

@FindBy (xpath=" //span[@class='oe_topbar_name']")
public WebElement TopRightUserName;


@FindBy (xpath= "//a[@data-menu='logout']")
    public WebElement TopRightMenuLogOutLink;

@FindBy (xpath ="//div[@class='o_dialog_warning modal-body']")
public WebElement SessionExpiredMessage;

}
