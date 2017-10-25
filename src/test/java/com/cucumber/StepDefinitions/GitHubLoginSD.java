package com.cucumber.StepDefinitions;

import java.net.MalformedURLException;

import com.cucumber.Selenium.SeleniumFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubLoginSD {

    SeleniumFunctions sf = new SeleniumFunctions();

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
        sf.teardown();
    }
}