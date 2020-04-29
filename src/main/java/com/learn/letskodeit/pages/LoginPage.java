package com.learn.letskodeit.pages;

import com.cucumber.listener.Reporter;
import com.learn.letskodeit.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "user_email")
    WebElement _emailField;

    @FindBy(id = "user_password")
    WebElement _passwordField;

    @FindBy(name = "commit")
    WebElement _clickOnCommitButton;

    @FindBy(xpath = "//h1[@class='text-center']")
    WebElement _getLoginText;

    @FindBy(xpath = "//a[contains(text(),'All Courses')]")
    WebElement _allCourseText;

    public void enterEmailId(String email) {
        Reporter.addStepLog("Enter email field " +email+ "Email field"+ _emailField.toString());
        sendTextToElement(_emailField, email);
        log.info("Enter email field " +email+ "Email field" +_emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter password field " +password+ "Password field"+ _passwordField.toString());
        sendTextToElement(_passwordField, password);
        log.info("Enter password field " +password+ "Password field"+ _passwordField.toString());
    }

    public void clickOnCommitFeature() {
        Reporter.addStepLog("Clicking on commit button " + _clickOnCommitButton.toString());
        clickOnElement(_clickOnCommitButton);
        log.info("Clicking on commit button " + _clickOnCommitButton.toString());
    }

    public String getLoginMessage() {
        Reporter.addStepLog("Getting login confirm message " + _getLoginText.toString());
        log.info("Getting login confirm message " + _getLoginText.toString());
        return getTextFromElement(_getLoginText);
    }

    public String getAllCourseMessage() {
        Reporter.addStepLog("Getting all course text message " + _allCourseText.toString());
        log.info("Getting all course text message " + _allCourseText.toString());
        return getTextFromElement(_allCourseText);
    }


}
