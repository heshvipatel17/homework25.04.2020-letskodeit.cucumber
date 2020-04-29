package com.learn.letskodeit.pages;

import com.cucumber.listener.Reporter;
import com.learn.letskodeit.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticePage extends Utility {

    private static final Logger log = LogManager.getLogger(PracticePage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Practice Page')]")
    WebElement _getPracticePageText;

    public String getTextFromElement(){
        Reporter.addStepLog("Getting practice page text " + _getPracticePageText.toString()+"<br>");
        log.info("Getting practice page text " + _getPracticePageText.toString());
        return getTextFromElement(_getPracticePageText);

    }
}
