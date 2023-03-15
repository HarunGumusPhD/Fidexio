package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.UserPage;
import com.fidexio.utils.ConfigurationReader;
import com.fidexio.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_stepDefination {

    LoginPage loginPage = new LoginPage();
    UserPage UserPage = new UserPage();

    String memorizedUserName, memorisedPassword;

    String currentUsername, currentPassword;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));

    }

    @When("User enters email {string} in username area")
    public void user_enters_email_in_username_area(String username) {
        loginPage.username.sendKeys(username);
        memorizedUserName = username;


    }

    @When("User enters password {string} password area")
    public void user_enters_password_password_area(String password) {
        loginPage.password.sendKeys(password);
        memorisedPassword = password;


    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();

    }

    @Then("User should be on the homepage")
    public void user_should_be_on_the_homepage() {
        Assert.assertTrue(UserPage.UserOnPage.isDisplayed());

    }

    @Then("User should see the error message {string}")
    public void user_should_see_the_error_message(String errorMessage) {
        Assert.assertTrue(loginPage.wrongCredentialsMsg.isDisplayed());
        Assert.assertEquals(errorMessage, loginPage.wrongCredentialsMsg.getText());


    }

    @Then("user should see validation message  {string}")
    public void user_should_see_validation_message(String validationMesssage) {
        System.out.println(memorisedPassword);
        System.out.println(memorizedUserName);


        if (memorizedUserName.isEmpty()) {
            Assert.assertEquals(loginPage.username.getAttribute("validationMessage"), validationMesssage);

        } else if (memorisedPassword.isEmpty()) {
            Assert.assertEquals(loginPage.password.getAttribute("validationMessage"), validationMesssage);

        }

    }


    @Then("user should see bullet sign")
    public void user_should_see_bullet_sign() {
        Assert.assertEquals("password", loginPage.password.getAttribute("type"));

    }

    @When("User clicks enter key on keyboard")
    public void user_clicks_enter_key_on_keyboard() {
        loginPage.password.sendKeys(Keys.ENTER);
    }


    @Then("user should login User Page")
    public void user_should_login_user_page() {


    }

    @Then("User should see the {string} link")
    public void user_should_see_the_link(String loginPassword) {
        loginPage.resetPassword.click();
    }


}