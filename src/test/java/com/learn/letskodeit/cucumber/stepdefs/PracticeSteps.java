package com.learn.letskodeit.cucumber.stepdefs;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.pages.PracticePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PracticeSteps {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {


    }
    @When("^I click on practice element$")
    public void iClickOnPracticeElement() {
        new HomePage().clickOnPracticePage();
    }

    @Then("^I should be in practice page successfully$")
    public void iShouldBeInPracticePageSuccessfully() {
        Assert.assertEquals(new PracticePage().getTextFromElement(),"Practice Page");
    }

    @When("^I click on login element$")
    public void iClickOnLoginElement() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should be in login page successfully$")
    public void iShouldBeInLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getLoginMessage(),"Log In to Let's Kode It");
    }
    }
