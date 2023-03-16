package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.UserPage;
import com.fidexio.utils.ConfigurationReader;
import com.fidexio.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Logout_stepDefination {

    LoginPage loginPage = new LoginPage();
    UserPage userPage = new UserPage();


    @Given("User is on the User page as a salesManager")
    public void user_is_on_the_user_page_as_a_sales_manager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("sales_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_password"));
        loginPage.loginButton.click();

    }

    @Given("User is on the User page as a posManager")
    public void user_is_on_the_user_page_as_a_pos_manager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("pos_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("pos_password"));
        loginPage.loginButton.click();

    }

    @When("user click top bar name on right corner")
    public void user_click_top_bar_name_on_right_corner() {
        userPage.TopRightUserName.click();


    }

    @When("user click log out button")
    public void user_click_log_out_button() {
        userPage.TopRightMenuLogOutLink.click();

    }

    @Then("user should back to the login page")
    public void user_should_back_to_the_login_page() {
        Assert.assertTrue(loginPage.loginButton.isDisplayed());

    }

    @When("user click step back button on the browser")
    public void user_click_step_back_button_on_the_browser() {
        Driver.getDriver().navigate().back();

    }

    @Then("user can not back to the homepage")
    public void user_can_not_back_to_the_homepage() {
        Assert.assertTrue(userPage.SessionExpiredMessage.isDisplayed());

    }


}
