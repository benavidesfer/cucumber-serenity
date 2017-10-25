package com.cucumber.StepDefinitions;

import java.net.MalformedURLException;

import com.cucumber.Selenium.SeleniumLoginFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubLoginSD {
	SeleniumLoginFunctions sf = new SeleniumLoginFunctions();

    @Given("^Usuario se encuentra en el homepage de Github$")
    public void user_is_on_github_homepage() throws MalformedURLException,
            InterruptedException {
        sf.createDriver();
        sf.ishomepageDisplayed();
    }

    @When("^Usuario hace el click en el boton Sign in$")
    public void user_clicks_on_Sign_in_button() {
        sf.clickSigninLink();
    }

    @Then("^Usuario ve la pantalla de login$")
    public void user_is_displayed_login_screen() {
        sf.isloginsectionDisplayed();       
    }
    
    @Then("^Usuario ingresa su usuario y contraseña$")
    public void user_enters_username_and_password() {
        sf.typeuserandpass();      
    }
    @When("^Usuario hace click en el boton de Log in$")
    public void user_clicks_login_button() {
        sf.clickLogin();      
    }
    @Then("^Usuario ve mensaje de username o password incorrecto$")
    public void user_sees_error_message() {
        sf.isloginerrormessageDisplayed();
        sf.teardown();
    }
}

