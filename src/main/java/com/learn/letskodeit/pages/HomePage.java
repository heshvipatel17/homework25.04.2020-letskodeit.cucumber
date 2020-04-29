package com.learn.letskodeit.pages;

import com.cucumber.listener.Reporter;
import com.learn.letskodeit.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[@class='navbar-link fedora-navbar-link']")
    WebElement _loginLink;

    @FindBy(partialLinkText = "Practi")
    WebElement _practiceLink;

    @FindBy(id = "header-sign-up-btn")
    WebElement _signUpLink;

    @FindBy(xpath = "//h2[@class='headline']")
    WebElement _getHomePageText;


    public String getHomePageMessage() {
        Reporter.addStepLog("Getting Home Page Header " + _getHomePageText.toString());
        log.info("Getting Home Page Header " + _getHomePageText.toString());
        return getTextFromElement(_getHomePageText);
    }


    public void clickOnLoginLink() {
        Reporter.addStepLog("Clicking on login button " + _loginLink.toString());
        clickOnElement(_loginLink);
        log.info("Clicking on login button " + _loginLink.toString());

    }

    public void clickOnPracticePage() {
        Reporter.addStepLog("Clicking on practice button " + _practiceLink.toString());
        clickOnElement(_practiceLink);
        log.info("Clicking on practice button " + _practiceLink.toString());
    }

    public void clickOnSignUpLink() {
        Reporter.addStepLog("Clicking on signUp button " + _signUpLink.toString());
        clickOnElement(_signUpLink);
        log.info("Clicking on signUp button " + _signUpLink.toString());
    }

}
