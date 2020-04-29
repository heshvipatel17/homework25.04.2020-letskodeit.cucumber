package com.learn.letskodeit.pages;

import com.cucumber.listener.Reporter;
import com.learn.letskodeit.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());


    @FindBy(tagName = "h1")
    WebElement _getSignUpMessage;

    @FindBy(xpath = "//a[@class='navbar-brand header-logo']//img")
    WebElement _logo;

    public String getSignUpText(){
        Reporter.addStepLog("Getting sign up text message " + _getSignUpMessage.toString());
        log.info("Getting sign up text message " + _getSignUpMessage.toString());
        return getTextFromElement(_getSignUpMessage);
    }
    public void clickOnLogo(){
        Reporter.addStepLog("Clicking on logo " + _logo.toString());
        clickOnElement(_logo);
        log.info("Clicking on logo " + _logo.toString());
    }



}
