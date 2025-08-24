package com.fachri.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdef {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @When("user input username with {string}")
    public void userInputUsernameWith(String username) {
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
    }

    @And("user click login button")
    public void userClickLoginButton() {
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
    }
}
