package com.learn.letskodeit.cucumber.stepdefs;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.SignUpPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignUpSteps {

    @When("^I click on Sign Up button$")
    public void iClickOnSignUpButton() {
        new HomePage().clickOnSignUpLink();
    }

    @Then("^I should be on Sign Up page successfully$")
    public void iShouldBeOnSignUpPageSuccessfully() {
        Assert.assertEquals(new SignUpPage().getSignUpText(),"Sign Up to Let's Kode It");
    }

    @Given("^I am on Sign Up page$")
    public void iAmOnSignUpPage() {

    }

    @When("^I click on Lets kode it Logo$")
    public void iClickOnLetsKodeItLogo() {
        new SignUpPage().clickOnLogo();
    }

    @Then("^I should be on Home Page successfully$")
    public void iShouldBeOnHomePageSuccessfully() {
        Assert.assertEquals(new HomePage().getHomePageMessage(),"Welcome to Let's Kode It");
    }
}
