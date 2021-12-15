package com.orangehrmlive.demo.pages;

import com.cucumber.listener.Reporter;
import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(css = "a.panelTrigger")
    WebElement _welcomeTxt;

//    @FindBy(xpath = "//a[@id='welcome']")
//    WebElement _welcomeTxt;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement _logoutLink;

    @FindBy(xpath = "//td[2]//div[1]//a[1]//img[1]")
    WebElement _leaveSheetLink;

    public String getWelcomeText() {
        //    waitUntilElementToBeClickable(_welcomeTxt, 20);

        log.info(" Verify text is displayed " + _welcomeTxt.toString());
        return getTextFromElement(_welcomeTxt);
    }



    public void clickOnWelcomeAdmin() {


        clickOnElement(_welcomeTxt);
        log.info(" Click on welcome admin button " + _welcomeTxt.toString());
    }

    public void clickOnLogoutLink() {


        clickOnElement(_logoutLink);
        log.info(" Click on logout link " + _logoutLink.toString());
    }
    public void clickOnlEaveSheetLink(){


        clickOnElement(_leaveSheetLink);
        log.info("Clicking on leave sheet"+ _leaveSheetLink.toString());
    }

}

